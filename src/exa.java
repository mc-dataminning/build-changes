public abstract class exa {
   protected final exc a;

   protected exa(exc $$0) {
      this.a = $$0;
   }

   public double a(bsr $$0) {
      double $$1 = this.a.c - $$0.dt();
      double $$2 = this.a.d - $$0.dv();
      double $$3 = this.a.e - $$0.dz();
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public abstract exa.a c();

   public exc e() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
