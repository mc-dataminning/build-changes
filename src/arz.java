public interface arz {
   int a();

   String b();

   default tm d() {
      return tm.c(this.b());
   }
}
