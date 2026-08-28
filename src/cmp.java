public class cmp extends cnl {
   public cmp(bvi<? extends cmp> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public static boolean a(bvi<cmp> $$0, dhq $$1, bvh $$2, ji $$3, azh $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bvh.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ag_() {
      return false;
   }

   @Override
   protected avz u() {
      return awa.nx;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.nA;
   }

   @Override
   protected avz l_() {
      return awa.nz;
   }

   @Override
   protected avz n() {
      return awa.nB;
   }

   @Override
   public boolean c(ard $$0, bva $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.eZ().f() && $$1 instanceof bvy) {
         float $$3 = this.dU().d_(this.du()).b();
         ((bvy)$$1).b(new bue(bug.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   protected void af_() {
      this.b(bvi.bN);
      if (!this.bb()) {
         this.dU().a(null, 1041, this.du(), 0);
      }
   }

   @Override
   protected cxh t() {
      return cxh.k;
   }
}
