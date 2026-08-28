public class cjy extends cku {
   public cjy(bsy<? extends cjy> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsy<cjy> $$0, dcl $$1, btr $$2, iz $$3, azf $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (btr.a($$2) || $$1.h($$3));
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
   protected avy d(brl $$0) {
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
   public boolean C(bss $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eX().e() && $$0 instanceof btn) {
         float $$2 = this.dP().d_(this.dp()).b();
         ((btn)$$0).b(new bsa(bsc.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gs() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bsy.bu);
      if (!this.aW()) {
         this.dP().a(null, 1041, this.dp(), 0);
      }
   }

   @Override
   protected cun gr() {
      return cun.l;
   }
}
