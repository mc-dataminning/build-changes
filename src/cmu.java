public class cmu extends cnq {
   public cmu(bvr<? extends cmu> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public static boolean a(bvr<cmu> $$0, dhz $$1, bvq $$2, jh $$3, bam $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bvq.a($$2) || $$1.h($$3));
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
   protected axe e(bua $$0) {
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
   public boolean c(ash $$0, bvk $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.eZ().f() && $$1 instanceof bwg) {
         float $$3 = this.dW().d_(this.dw()).b();
         ((bwg)$$1).b(new bup(bur.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean gp() {
      return true;
   }

   @Override
   protected void ai_() {
      this.b(bvr.bO);
      if (!this.bb()) {
         this.dW().a(null, 1041, this.dw(), 0);
      }
   }

   @Override
   protected cxp go() {
      return cxp.j;
   }
}
