public interface azr {
   int b();

   String a();

   default xa d() {
      return xa.c(this.a());
   }
}
