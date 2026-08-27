public class bxm extends bxp {
   public bxm(boi $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected ehg a(int $$0) {
      this.o = new egy(false);
      this.o.a(true);
      return new ehg(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return true;
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
      return this.a.bd() ? a(this.a, $$0, $$1, false) : false;
   }

   @Override
   public boolean a(hz $$0) {
      return !this.b.a_($$0.d()).i();
   }

   @Override
   public void a(boolean $$0) {
   }
}
