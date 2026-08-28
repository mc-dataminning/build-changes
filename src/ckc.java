public class ckc extends cky {
   public ckc(btc<? extends ckc> $$0, dca $$1) {
      super($$0, $$1);
   }

   public static boolean a(btc<ckc> $$0, dcp $$1, btv $$2, iz $$3, azh $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (btv.a($$2) || $$1.h($$3));
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
   protected avz d(brp $$0) {
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
   public boolean C(bsw $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eX().e() && $$0 instanceof btr) {
         float $$2 = this.dP().d_(this.dp()).b();
         ((btr)$$0).b(new bse(bsg.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gs() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(btc.bu);
      if (!this.aW()) {
         this.dP().a(null, 1041, this.dp(), 0);
      }
   }

   @Override
   protected cur gr() {
      return cur.l;
   }
}
