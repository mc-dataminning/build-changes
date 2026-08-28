public class cjv extends ckr {
   public cjv(bsv<? extends cjv> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsv<cjv> $$0, dci $$1, bto $$2, iz $$3, azc $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bto.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected avv v() {
      return avw.mZ;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.nc;
   }

   @Override
   protected avv o_() {
      return avw.nb;
   }

   @Override
   protected avv gq() {
      return avw.nd;
   }

   @Override
   public boolean C(bsp $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eX().e() && $$0 instanceof btk) {
         float $$2 = this.dP().d_(this.dp()).b();
         ((btk)$$0).b(new brx(brz.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gs() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bsv.bu);
      if (!this.aW()) {
         this.dP().a(null, 1041, this.dp(), 0);
      }
   }

   @Override
   protected cuk gr() {
      return cuk.l;
   }
}
