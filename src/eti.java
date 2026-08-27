public interface eti extends epi {
   float b(eph var1);

   default int a(eph $$0) {
      return Math.round(this.b($$0));
   }

   eth b();
}
