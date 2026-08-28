public class cmt extends cnp {
   public cmt(bvq<? extends cmt> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public static boolean a(bvq<cmt> $$0, dhy $$1, bvp $$2, jh $$3, bam $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bvp.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean aj_() {
      return false;
   }

   @Override
   protected axe u() {
      return axf.nr;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.nu;
   }

   @Override
   protected axe o_() {
      return axf.nt;
   }

   @Override
   protected axe t() {
      return axf.nv;
   }

   @Override
   public boolean c(ash $$0, bvj $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.eX().f() && $$1 instanceof bwf) {
         float $$3 = this.dV().d_(this.dv()).b();
         ((bwf)$$1).b(new buo(buq.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean gn() {
      return true;
   }

   @Override
   protected void ai_() {
      this.b(bvq.bO);
      if (!this.bb()) {
         this.dV().a(null, 1041, this.dv(), 0);
      }
   }

   @Override
   protected cxo gm() {
      return cxo.k;
   }
}
