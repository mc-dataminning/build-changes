public class cjo extends ckk {
   public cjo(bsn<? extends cjo> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsn<cjo> $$0, dcv $$1, btg $$2, ja $$3, ayo $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (btg.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected avg v() {
      return avh.mZ;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.nc;
   }

   @Override
   protected avg n_() {
      return avh.nb;
   }

   @Override
   protected avg gn() {
      return avh.nd;
   }

   @Override
   public boolean D(bsh $$0) {
      boolean $$1 = super.D($$0);
      if ($$1 && this.eV().e() && $$0 instanceof btc) {
         float $$2 = this.dR().d_(this.dr()).b();
         ((btc)$$0).b(new brp(brr.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gp() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bsn.bu);
      if (!this.aY()) {
         this.dR().a(null, 1041, this.dr(), 0);
      }
   }

   @Override
   protected cud go() {
      return cud.l;
   }
}
