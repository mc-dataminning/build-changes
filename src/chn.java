public abstract class chn extends bus {
   protected chn(bvi<? extends chn> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(euh.j, 0.0F);
   }

   @Override
   public boolean a(dhc $$0) {
      return $$0.f(this);
   }

   @Override
   public int Q() {
      return 120;
   }

   @Override
   public int e(arx $$0) {
      return 1 + this.ae.a(3);
   }

   protected void r(int $$0) {
      if (this.bL() && !this.bm()) {
         this.j($$0 - 1);
         if (this.ct() == -20) {
            this.j(0);
            this.a(this.dX().i(), 2.0F);
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
   public boolean y() {
      return false;
   }

   public static boolean b(bvi<? extends chn> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      int $$5 = $$1.P();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(axq.a) && $$1.a_($$3.d()).a(dkf.J);
   }
}
