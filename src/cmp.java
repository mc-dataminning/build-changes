public class cmp extends cnl {
   public cmp(bvm<? extends cmp> $$0, dha $$1) {
      super($$0, $$1);
   }

   public static boolean a(bvm<cmp> $$0, dhr $$1, bvl $$2, jh $$3, bam $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bvl.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean aj_() {
      return false;
   }

   @Override
   protected axe u() {
      return axf.nq;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.nt;
   }

   @Override
   protected axe o_() {
      return axf.ns;
   }

   @Override
   protected axe t() {
      return axf.nu;
   }

   @Override
   public boolean c(ash $$0, bvf $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.eX().f() && $$1 instanceof bwb) {
         float $$3 = this.dV().d_(this.dv()).b();
         ((bwb)$$1).b(new buk(bum.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean gn() {
      return true;
   }

   @Override
   protected void ai_() {
      this.b(bvm.bO);
      if (!this.bb()) {
         this.dV().a(null, 1041, this.dv(), 0);
      }
   }

   @Override
   protected cxk gm() {
      return cxk.k;
   }
}
