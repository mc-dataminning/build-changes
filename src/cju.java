public abstract class cju extends bwu {
   protected cju(bxn<? extends cju> $$0, dkj $$1) {
      super($$0, $$1);
      this.a(eyr.j, 0.0F);
   }

   @Override
   public boolean a(dkm $$0) {
      return $$0.f(this);
   }

   @Override
   public int S() {
      return 120;
   }

   @Override
   public int e(asb $$0) {
      return 1 + this.ae.a(3);
   }

   protected void r(int $$0) {
      if (this.bJ() && !this.bi()) {
         this.j($$0 - 1);
         if (this.cs() == -20) {
            this.j(0);
            this.a(this.dW().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void aw() {
      int $$0 = this.cs();
      super.aw();
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

   public static boolean b(bxn<? extends cju> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      int $$5 = $$1.P();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(axs.a) && $$1.a_($$3.d()).a(dnq.J);
   }
}
