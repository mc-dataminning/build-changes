public class cgw extends chs {
   public cgw(bqb<? extends cgw> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public static boolean a(bqb<cgw> $$0, czm $$1, bqs $$2, ib $$3, axr $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bqs.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected aul v() {
      return aum.mK;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.mN;
   }

   @Override
   protected aul o_() {
      return aum.mM;
   }

   @Override
   protected aul gn() {
      return aum.mO;
   }

   @Override
   public boolean C(bpv $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eU().d() && $$0 instanceof bqo) {
         float $$2 = this.dM().d_(this.dm()).b();
         ((bqo)$$0).b(new bph(bpj.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gp() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bqb.bt);
      if (!this.aU()) {
         this.dM().a(null, 1041, this.dm(), 0);
      }
   }

   @Override
   protected crj go() {
      return crj.i;
   }
}
