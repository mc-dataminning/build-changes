public class cnw extends cot {
   public cnw(bwm<? extends cnw> $$0, div $$1) {
      super($$0, $$1);
   }

   public static boolean a(bwm<cnw> $$0, djm $$1, bwl $$2, iu $$3, azv $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bwl.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ac_() {
      return false;
   }

   @Override
   protected awm u() {
      return awn.ny;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.nB;
   }

   @Override
   protected awm l_() {
      return awn.nA;
   }

   @Override
   protected awm n() {
      return awn.nC;
   }

   @Override
   public boolean c(arq $$0, bwd $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.fa().f() && $$1 instanceof bxc) {
         float $$3 = this.dV().d_(this.dv()).b();
         ((bxc)$$1).b(new bvh(bvj.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   protected void ab_() {
      this.b(bwm.bO);
      if (!this.bb()) {
         this.dV().a(null, 1041, this.dv(), 0);
      }
   }

   @Override
   protected cyy t() {
      return cyy.k;
   }
}
