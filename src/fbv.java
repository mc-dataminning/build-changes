public abstract class fbv {
   protected final fbx a;

   protected fbv(fbx $$0) {
      this.a = $$0;
   }

   public double a(bva $$0) {
      double $$1 = this.a.d - $$0.dz();
      double $$2 = this.a.e - $$0.dB();
      double $$3 = this.a.f - $$0.dF();
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public abstract fbv.a d();

   public fbx g() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
