public class chd extends chz {
   public chd(bqg<? extends chd> $$0, czg $$1) {
      super($$0, $$1);
   }

   public static boolean a(bqg<chd> $$0, czv $$1, bqx $$2, id $$3, axt $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bqx.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected aun v() {
      return auo.mK;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.mN;
   }

   @Override
   protected aun o_() {
      return auo.mM;
   }

   @Override
   protected aun gn() {
      return auo.mO;
   }

   @Override
   public boolean C(bqa $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eU().d() && $$0 instanceof bqt) {
         float $$2 = this.dM().d_(this.dm()).b();
         ((bqt)$$0).b(new bpm(bpo.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gp() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bqg.bt);
      if (!this.aU()) {
         this.dM().a(null, 1041, this.dm(), 0);
      }
   }

   @Override
   protected crs go() {
      return crs.i;
   }
}
