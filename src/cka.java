public class cka extends ckw {
   public cka(bta<? extends cka> $$0, dby $$1) {
      super($$0, $$1);
   }

   public static boolean a(bta<cka> $$0, dcn $$1, btt $$2, iz $$3, azh $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (btt.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected avz v() {
      return awa.mZ;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.nc;
   }

   @Override
   protected avz o_() {
      return awa.nb;
   }

   @Override
   protected avz gq() {
      return awa.nd;
   }

   @Override
   public boolean C(bsu $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eX().e() && $$0 instanceof btp) {
         float $$2 = this.dP().d_(this.dp()).b();
         ((btp)$$0).b(new bsc(bse.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gs() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bta.bu);
      if (!this.aW()) {
         this.dP().a(null, 1041, this.dp(), 0);
      }
   }

   @Override
   protected cup gr() {
      return cup.l;
   }
}
