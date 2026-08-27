public abstract class epp {
   protected final epr a;

   protected epp(epr $$0) {
      this.a = $$0;
   }

   public double a(bow $$0) {
      double $$1 = this.a.c - $$0.dr();
      double $$2 = this.a.d - $$0.dt();
      double $$3 = this.a.e - $$0.dx();
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public abstract epp.a c();

   public epr e() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
