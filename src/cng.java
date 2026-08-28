public class cng extends coc {
   public cng(bwb<? extends cng> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public static boolean a(bwb<cng> $$0, dig $$1, bwa $$2, jj $$3, azs $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bwa.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ac_() {
      return false;
   }

   @Override
   protected awj u() {
      return awk.nx;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.nA;
   }

   @Override
   protected awj l_() {
      return awk.nz;
   }

   @Override
   protected awj n() {
      return awk.nB;
   }

   @Override
   public boolean c(arn $$0, bvs $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.fa().f() && $$1 instanceof bwr) {
         float $$3 = this.dV().d_(this.dv()).b();
         ((bwr)$$1).b(new buw(buy.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   protected void ab_() {
      this.b(bwb.bN);
      if (!this.bb()) {
         this.dV().a(null, 1041, this.dv(), 0);
      }
   }

   @Override
   protected cxy t() {
      return cxy.k;
   }
}
