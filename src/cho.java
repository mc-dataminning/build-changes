public class cho extends cik {
   public cho(bqr<? extends cho> $$0, czu $$1) {
      super($$0, $$1);
   }

   public static boolean a(bqr<cho> $$0, daj $$1, bri $$2, im $$3, ayd $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bri.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected auy v() {
      return auz.mP;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.mS;
   }

   @Override
   protected auy o_() {
      return auz.mR;
   }

   @Override
   protected auy gp() {
      return auz.mT;
   }

   @Override
   public boolean C(bql $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eV().d() && $$0 instanceof bre) {
         float $$2 = this.dN().d_(this.dn()).b();
         ((bre)$$0).b(new bpx(bpz.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gr() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bqr.bt);
      if (!this.aU()) {
         this.dN().a(null, 1041, this.dn(), 0);
      }
   }

   @Override
   protected csd gq() {
      return csd.i;
   }
}
