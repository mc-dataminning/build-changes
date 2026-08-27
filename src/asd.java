public interface asd {
   int a();

   String b();

   default tl d() {
      return tl.c(this.b());
   }
}
