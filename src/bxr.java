public class bxr extends bxp {
   private boolean p;

   public bxr(boi $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected ehg a(int $$0) {
      this.p = this.a.ai() == bnu.x;
      this.o = new ehh(this.p);
      return new ehg(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bd();
   }

   @Override
   protected ens b() {
      return new ens(this.a.dr(), this.a.e(0.5), this.a.dx());
   }

   @Override
   protected double a(ens $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(ens $$0, ens $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(hz $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
