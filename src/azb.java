public interface azb {
   int b();

   String a();

   default wo d() {
      return wo.c(this.a());
   }
}
