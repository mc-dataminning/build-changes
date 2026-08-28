public interface azc {
   int a();

   String b();

   default xp d() {
      return xp.c(this.b());
   }
}
