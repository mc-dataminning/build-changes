public interface azc {
   int b();

   String a();

   default wp d() {
      return wp.c(this.a());
   }
}
