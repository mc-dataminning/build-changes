public abstract class etn {
   protected final etp a;

   protected etn(etp $$0) {
      this.a = $$0;
   }

   public double a(brh $$0) {
      double $$1 = this.a.c - $$0.ds();
      double $$2 = this.a.d - $$0.du();
      double $$3 = this.a.e - $$0.dy();
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public abstract etn.a c();

   public etp e() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
