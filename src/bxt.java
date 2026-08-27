public abstract class bxt extends blp {
   protected bxt(bku<? extends bxt> $$0, csa $$1) {
      super($$0, $$1);
      this.a(edd.j, 0.0F);
   }

   @Override
   public bll eT() {
      return bll.e;
   }

   @Override
   public boolean a(csd $$0) {
      return $$0.f(this);
   }

   @Override
   public int Q() {
      return 120;
   }

   @Override
   public int ef() {
      return 1 + this.dN().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bx() && !this.bc()) {
         this.j($$0 - 1);
         if (this.ci() == -20) {
            this.j(0);
            this.a(this.dO().h(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void as() {
      int $$0 = this.ci();
      super.as();
      this.b($$0);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public boolean a(cdu $$0) {
      return false;
   }

   public static boolean c(bku<? extends bxt> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      int $$5 = $$1.z_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(arl.a) && $$1.a_($$3.c()).a(cvc.G);
   }
}
