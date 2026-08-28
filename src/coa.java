public class coa extends cox {
   public coa(bwo<? extends coa> $$0, dja $$1) {
      super($$0, $$1);
   }

   public static boolean a(bwo<coa> $$0, djr $$1, bwn $$2, iu $$3, azv $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bwn.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected awm u() {
      return awn.nB;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.nE;
   }

   @Override
   protected awm l_() {
      return awn.nD;
   }

   @Override
   protected awm n() {
      return awn.nF;
   }

   @Override
   public boolean c(arq $$0, bwf $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.fb().f() && $$1 instanceof bxe) {
         float $$3 = this.dV().d_(this.dv()).b();
         ((bxe)$$1).b(new bvj(bvl.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bwo.bO);
      if (!this.bb()) {
         this.dV().a(null, 1041, this.dv(), 0);
      }
   }

   @Override
   protected czd t() {
      return czd.k;
   }
}
