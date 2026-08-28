public abstract class cir extends bvt {
   protected cir(bwm<? extends cir> $$0, div $$1) {
      super($$0, $$1);
      this.a(ewx.j, 0.0F);
   }

   @Override
   public boolean a(diy $$0) {
      return $$0.f(this);
   }

   @Override
   public int S() {
      return 120;
   }

   @Override
   public int e(arq $$0) {
      return 1 + this.ae.a(3);
   }

   protected void r(int $$0) {
      if (this.bK() && !this.bj()) {
         this.j($$0 - 1);
         if (this.ct() == -20) {
            this.j(0);
            this.a(this.dW().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void az() {
      int $$0 = this.ct();
      super.az();
      this.r($$0);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   public boolean w() {
      return false;
   }

   public static boolean b(bwm<? extends cir> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      int $$5 = $$1.P();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(axh.a) && $$1.a_($$3.d()).a(dmc.J);
   }
}
