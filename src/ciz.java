public class ciz extends cjv {
   public ciz(bsa<? extends ciz> $$0, dax $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsa<ciz> $$0, dbm $$1, bss $$2, io $$3, ayk $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bss.a($$2) || $$1.h($$3));
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
   protected avg d(bqn $$0) {
      return avh.nc;
   }

   @Override
   protected avg o_() {
      return avh.nb;
   }

   @Override
   protected avg gp() {
      return avh.nd;
   }

   @Override
   public boolean C(bru $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eX().e() && $$0 instanceof bso) {
         float $$2 = this.dP().d_(this.dp()).b();
         ((bso)$$0).b(new brc(bre.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gr() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bsa.bu);
      if (!this.aW()) {
         this.dP().a(null, 1041, this.dp(), 0);
      }
   }

   @Override
   protected cto gq() {
      return cto.i;
   }
}
