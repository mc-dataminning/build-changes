public interface aru {
   int a();

   String b();

   default ti d() {
      return ti.c(this.b());
   }
}
