public interface ary {
   int a();

   String b();

   default tl d() {
      return tl.c(this.b());
   }
}
