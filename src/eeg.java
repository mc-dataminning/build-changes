public abstract class eeg {
   protected final eei a;

   protected eeg(eei $$0) {
      this.a = $$0;
   }

   public double a(bfj $$0) {
      double $$1 = this.a.c - $$0.dn();
      double $$2 = this.a.d - $$0.dp();
      double $$3 = this.a.e - $$0.dt();
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public abstract eeg.a c();

   public eei e() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
