public interface ayj {
   int a();

   String b();

   default wu d() {
      return wu.c(this.b());
   }
}
