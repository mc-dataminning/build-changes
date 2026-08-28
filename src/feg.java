public abstract class feg {
   protected final fei a;

   protected feg(fei $$0) {
      this.a = $$0;
   }

   public double a(bwd $$0) {
      double $$1 = this.a.d - $$0.dA();
      double $$2 = this.a.e - $$0.dC();
      double $$3 = this.a.f - $$0.dG();
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public abstract feg.a d();

   public fei g() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
