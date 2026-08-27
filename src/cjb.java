public class cjb extends cjx {
   public cjb(bsc<? extends cjb> $$0, daz $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsc<cjb> $$0, dbo $$1, bsu $$2, io $$3, aym $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bsu.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected avh v() {
      return avi.mZ;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.nc;
   }

   @Override
   protected avh o_() {
      return avi.nb;
   }

   @Override
   protected avh gp() {
      return avi.nd;
   }

   @Override
   public boolean C(brw $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eX().e() && $$0 instanceof bsq) {
         float $$2 = this.dP().d_(this.dp()).b();
         ((bsq)$$0).b(new bre(brg.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gr() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bsc.bu);
      if (!this.aW()) {
         this.dP().a(null, 1041, this.dp(), 0);
      }
   }

   @Override
   protected ctq gq() {
      return ctq.i;
   }
}
