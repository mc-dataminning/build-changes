public class cik extends cjg {
   public cik(brn<? extends cik> $$0, dad $$1) {
      super($$0, $$1);
   }

   public static boolean a(brn<cik> $$0, das $$1, bse $$2, in $$3, ayg $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bse.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected avb v() {
      return avc.mP;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.mS;
   }

   @Override
   protected avb o_() {
      return avc.mR;
   }

   @Override
   protected avb gp() {
      return avc.mT;
   }

   @Override
   public boolean C(brh $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eV().d() && $$0 instanceof bsa) {
         float $$2 = this.dN().d_(this.dn()).b();
         ((bsa)$$0).b(new bqt(bqv.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gr() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(brn.bt);
      if (!this.aU()) {
         this.dN().a(null, 1041, this.dn(), 0);
      }
   }

   @Override
   protected csz gq() {
      return csz.i;
   }
}
