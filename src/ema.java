public abstract class ema {
   protected final emc a;

   protected ema(emc $$0) {
      this.a = $$0;
   }

   public double a(blw $$0) {
      double $$1 = this.a.c - $$0.dq();
      double $$2 = this.a.d - $$0.ds();
      double $$3 = this.a.e - $$0.dw();
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public abstract ema.a c();

   public emc e() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
