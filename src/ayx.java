public interface ayx {
   int a();

   String b();

   default xl d() {
      return xl.c(this.b());
   }
}
