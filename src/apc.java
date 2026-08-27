public interface apc {
   int a();

   String b();

   default sw c() {
      return sw.c(this.b());
   }
}
