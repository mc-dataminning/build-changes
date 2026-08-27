public interface ato {
   int a();

   String b();

   default ur d() {
      return ur.c(this.b());
   }
}
