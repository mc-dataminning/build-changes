public abstract class cge extends btu {
   protected cge(bsw<? extends cge> $$0, dcu $$1) {
      super($$0, $$1);
      this.a(epp.j, 0.0F);
   }

   @Override
   public boolean a(dcx $$0) {
      return $$0.f(this);
   }

   @Override
   public int P() {
      return 120;
   }

   @Override
   protected int eh() {
      return 1 + this.dQ().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bE() && !this.bi()) {
         this.j($$0 - 1);
         if (this.cm() == -20) {
            this.j(0);
            this.a(this.dR().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void aw() {
      int $$0 = this.cm();
      super.aw();
      this.b($$0);
   }

   @Override
   public boolean cD() {
      return false;
   }

   @Override
   public boolean a(cmv $$0) {
      return false;
   }

   public static boolean c(bsw<? extends cge> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      int $$5 = $$1.z_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(awj.a) && $$1.a_($$3.c()).a(dfy.G);
   }
}
