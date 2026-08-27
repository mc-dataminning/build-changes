public abstract class ehn {
   protected final ehp a;

   protected ehn(ehp $$0) {
      this.a = $$0;
   }

   public double a(bis $$0) {
      double $$1 = this.a.c - $$0.dq();
      double $$2 = this.a.d - $$0.ds();
      double $$3 = this.a.e - $$0.dw();
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public abstract ehn.a c();

   public ehp e() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
