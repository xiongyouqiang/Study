package com.xiong.calculte;
/***
 * 算法工具类，提供主流的排序算法
 * 1、冒牌排序
 * 2、
 * @author lenovo
 *
 */
public class ArithemticUtil {

	/****
	 * 对数组进行冒泡排序计算（升序排序）
	 * @param numbers 整形数组
	 */
	public static final void bubbleSort(int... numbers){
		int length = numbers.length -1;
		for(int i = 0;i< length;i++){
			for(int j=0;j<length - i;j++){
				int t ;
				if(numbers[j] > numbers[j+1]){
					t = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = t;
				}
			}
		}
	}
	/***
	 * 
	 * @param descend
	 * @param numbers
	 */
	public static final void bubbleSort(boolean descend,int... numbers){
		int length = numbers.length -1;
		int flag = 0;
		for(int i = 0;i< length;i++){
			for(int j=0;j<length - i;j++){
				int t ;
				if(descend){ //从小到大
					if(numbers[j] > numbers[j+1]){
						t = numbers[j];
						numbers[j] = numbers[j+1];
						numbers[j+1] = t;
						flag = 1;
					}
				}else{
					if(numbers[j] < numbers[j+1]){
						t = numbers[j];
						numbers[j] = numbers[j+1];
						numbers[j+1] = t;
						flag = 1;
					}
				}
			}
			
			if(flag == 0){
				break;
			}else{
				flag = 0;
			}
		}
	}
	
	 
	
	public static long calcWithoutRecursion1(long n) {  
	    if(n < 0)  
	        return 0;  
	    if(n == 0 || n == 1) {  
	        return n;  
	    }  
	    long fib = 0;  
	    long fibOne = 1;  
	    long fibTwo = 1;  
	    for(long i = 2; i < n; i++) {  
	        fib = fibOne + fibTwo;  
	        fibOne = fibTwo;  
	        fibTwo = fib;  
	    }  
	    return fib;  
	   
	}
	
	public static void main(String[] args) {
		
		//冒泡排序测试
//		int[] numbers = new int[]{4,5,1,3,9,6,7,4,11,5,6,2,3,100,34,134};
//		System.out.println("befer sort");
//		for(int i:numbers){
//			System.out.print(i+" ");
//		}
//		System.out.println("");
//		long start = System.currentTimeMillis();
//		bubbleSort(false,numbers);
//		long end = System.currentTimeMillis();
//		System.out.println("sort take "+(end-start)+"ms");
//		System.out.println("after sort");
//		for(int i:numbers){
//			System.out.print(i+" ");
//		}
//		System.out.println("");
		
		//斐波那契数 
		
		int n = 50;
		
		long start = System.currentTimeMillis();
		long total = calcWithoutRecursion1(n);
		long end = System.currentTimeMillis();
		System.out.println("计算n="+n +"的结果="+ total +" 共耗时："+(end-start)+"ms");
		//计算n=50的结果=12586269025 共耗时：0ms
		//计算n=50的结果=12586269025 共耗时：0ms
		
		int result = (int) total;
		System.out.println(result);

	}
}
