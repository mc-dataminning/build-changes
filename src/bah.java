public interface bah {
   int b();

   String a();

   default xv d() {
      return xv.c(this.a());
   }
}
