public interface awo {
   int a();

   String b();

   default vs d() {
      return vs.c(this.b());
   }
}
