public class cjn extends ckj {
   public cjn(bsm<? extends cjn> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsm<cjn> $$0, dcu $$1, btf $$2, ja $$3, ayo $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (btf.a($$2) || $$1.h($$3));
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
   protected avg d(bqz $$0) {
      return avh.nc;
   }

   @Override
   protected avg o_() {
      return avh.nb;
   }

   @Override
   protected avg go() {
      return avh.nd;
   }

   @Override
   public boolean D(bsg $$0) {
      boolean $$1 = super.D($$0);
      if ($$1 && this.eU().e() && $$0 instanceof btb) {
         float $$2 = this.dQ().d_(this.dq()).b();
         ((btb)$$0).b(new bro(brq.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gq() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bsm.bu);
      if (!this.aX()) {
         this.dQ().a(null, 1041, this.dq(), 0);
      }
   }

   @Override
   protected cuc gp() {
      return cuc.l;
   }
}
