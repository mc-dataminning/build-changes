public class cjy extends cku {
   public cjy(bsw<? extends cjy> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsw<cjy> $$0, ddj $$1, btp $$2, jd $$3, ayv $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (btp.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected avn v() {
      return avo.mZ;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.nc;
   }

   @Override
   protected avn n_() {
      return avo.nb;
   }

   @Override
   protected avn gm() {
      return avo.nd;
   }

   @Override
   public boolean D(bsq $$0) {
      boolean $$1 = super.D($$0);
      if ($$1 && this.eU().e() && $$0 instanceof btl) {
         float $$2 = this.dQ().d_(this.dq()).b();
         ((btl)$$0).b(new bry(bsa.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean go() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bsw.bu);
      if (!this.aX()) {
         this.dQ().a(null, 1041, this.dq(), 0);
      }
   }

   @Override
   protected cuo gn() {
      return cuo.l;
   }
}
