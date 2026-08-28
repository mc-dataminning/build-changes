public class cph extends cqd {
   public cph(bxn<? extends cph> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public static boolean a(bxn<cph> $$0, dla $$1, bxm $$2, iw $$3, bai $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bxm.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ai_() {
      return false;
   }

   @Override
   protected awx u() {
      return awy.nB;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.nE;
   }

   @Override
   protected awx l_() {
      return awy.nD;
   }

   @Override
   protected awx n() {
      return awy.nF;
   }

   @Override
   public boolean c(asb $$0, bxe $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.fb().f() && $$1 instanceof byf) {
         float $$3 = this.dV().d_(this.dv()).b();
         ((byf)$$1).b(new bwi(bwk.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   protected void ah_() {
      this.b(bxn.bP);
      if (!this.ba()) {
         this.dV().a(null, 1041, this.dv(), 0);
      }
   }

   @Override
   protected dak t() {
      return dak.l;
   }
}
