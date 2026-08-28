public interface ayq {
   int a();

   String b();

   default wy d() {
      return wy.c(this.b());
   }
}
