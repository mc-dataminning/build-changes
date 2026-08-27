public interface asa {
   int a();

   String b();

   default tn d() {
      return tn.c(this.b());
   }
}
