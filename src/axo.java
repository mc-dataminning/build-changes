public interface axo {
   int a();

   String b();

   default wi d() {
      return wi.c(this.b());
   }
}
