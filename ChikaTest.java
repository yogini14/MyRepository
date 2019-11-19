import java.util.Scanner;
class ChikaTest{
public static void main(String[] args){
int rem=0,result=0;
System.out.println("Enter any number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
rem=num%10;
num=num/10;
result=(rem*5)+num;
System.out.println(result);
if(result%7==0){
System.out.println("Divisible by 7");
}
else{
System.out.println("Not divisible by 7");
}
}
}