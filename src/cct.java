public class cct extends cdp {
   public cct(bmc<? extends cct> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public static boolean a(bmc<cct> $$0, cum $$1, bms $$2, hx $$3, auw $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bms.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean af_() {
      return false;
   }

   @Override
   protected ars y() {
      return art.mA;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.mD;
   }

   @Override
   protected ars n_() {
      return art.mC;
   }

   @Override
   protected ars gf() {
      return art.mE;
   }

   @Override
   public boolean B(blw $$0) {
      boolean $$1 = super.B($$0);
      if ($$1 && this.eT().b() && $$0 instanceof bmo) {
         float $$2 = this.dL().d_(this.dl()).b();
         ((bmo)$$0).b(new blj(bll.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gh() {
      return true;
   }

   @Override
   protected void ae_() {
      this.b(bmc.bs);
      if (!this.aU()) {
         this.dL().a(null, 1041, this.dl(), 0);
      }
   }

   @Override
   protected cng gg() {
      return cng.f;
   }
}
