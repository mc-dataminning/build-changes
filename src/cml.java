public class cml extends cnh {
   public cml(bvi<? extends cml> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public static boolean a(bvi<cml> $$0, dhq $$1, bvh $$2, jh $$3, bac $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bvh.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean aj_() {
      return false;
   }

   @Override
   protected awu u() {
      return awv.nx;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.nA;
   }

   @Override
   protected awu o_() {
      return awv.nz;
   }

   @Override
   protected awu t() {
      return awv.nB;
   }

   @Override
   public boolean c(arx $$0, bvb $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.eZ().f() && $$1 instanceof bvx) {
         float $$3 = this.dW().d_(this.dw()).b();
         ((bvx)$$1).b(new bug(bui.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean gp() {
      return true;
   }

   @Override
   protected void ai_() {
      this.b(bvi.bO);
      if (!this.bb()) {
         this.dW().a(null, 1041, this.dw(), 0);
      }
   }

   @Override
   protected cxg go() {
      return cxg.j;
   }
}
