public interface arq {
   int a();

   String b();

   default te d() {
      return te.c(this.b());
   }
}
