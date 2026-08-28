public class cjz extends ckv {
   public cjz(bsz<? extends cjz> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsz<cjz> $$0, dcm $$1, bts $$2, iz $$3, azg $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bts.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected avy v() {
      return avz.mZ;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.nc;
   }

   @Override
   protected avy o_() {
      return avz.nb;
   }

   @Override
   protected avy gq() {
      return avz.nd;
   }

   @Override
   public boolean C(bst $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eX().e() && $$0 instanceof bto) {
         float $$2 = this.dP().d_(this.dp()).b();
         ((bto)$$0).b(new bsb(bsd.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gs() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bsz.bu);
      if (!this.aW()) {
         this.dP().a(null, 1041, this.dp(), 0);
      }
   }

   @Override
   protected cuo gr() {
      return cuo.l;
   }
}
