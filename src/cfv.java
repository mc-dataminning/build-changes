public class cfv extends cgr {
   public cfv(bpc<? extends cfv> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public static boolean a(bpc<cfv> $$0, cxo $$1, bps $$2, ib $$3, axd $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bps.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected atx v() {
      return aty.mE;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.mH;
   }

   @Override
   protected atx n_() {
      return aty.mG;
   }

   @Override
   protected atx gn() {
      return aty.mI;
   }

   @Override
   public boolean C(bow $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eU().b() && $$0 instanceof bpo) {
         float $$2 = this.dM().d_(this.dm()).b();
         ((bpo)$$0).b(new boj(bol.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gp() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bpc.bt);
      if (!this.aU()) {
         this.dM().a(null, 1041, this.dm(), 0);
      }
   }

   @Override
   protected cqk go() {
      return cqk.h;
   }
}
