public interface ayr {
   int a();

   String b();

   default wz d() {
      return wz.c(this.b());
   }
}
