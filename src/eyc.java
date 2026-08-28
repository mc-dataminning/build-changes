public abstract class eyc {
   protected final eye a;

   protected eyc(eye $$0) {
      this.a = $$0;
   }

   public double a(btj $$0) {
      double $$1 = this.a.d - $$0.dx();
      double $$2 = this.a.e - $$0.dz();
      double $$3 = this.a.f - $$0.dD();
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public abstract eyc.a c();

   public eye e() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
