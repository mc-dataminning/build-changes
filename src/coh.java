public class coh extends cpe {
   public coh(bwr<? extends coh> $$0, djh $$1) {
      super($$0, $$1);
   }

   public static boolean a(bwr<coh> $$0, djy $$1, bwq $$2, iv $$3, azv $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bwq.a($$2) || $$1.h($$3));
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
   protected awm e(bux $$0) {
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
   public boolean c(arq $$0, bwi $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.fa().f() && $$1 instanceof bxj) {
         float $$3 = this.dU().d_(this.du()).b();
         ((bxj)$$1).b(new bvm(bvo.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bwr.bO);
      if (!this.aZ()) {
         this.dU().a(null, 1041, this.du(), 0);
      }
   }

   @Override
   protected czk t() {
      return czk.k;
   }
}
