public class coy extends cpu {
   public coy(bxe<? extends coy> $$0, djz $$1) {
      super($$0, $$1);
   }

   public static boolean a(bxe<coy> $$0, dkq $$1, bxd $$2, iw $$3, azz $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bxd.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ah_() {
      return false;
   }

   @Override
   protected awq u() {
      return awr.nB;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.nE;
   }

   @Override
   protected awq l_() {
      return awr.nD;
   }

   @Override
   protected awq n() {
      return awr.nF;
   }

   @Override
   public boolean c(aru $$0, bwv $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.fb().f() && $$1 instanceof bxw) {
         float $$3 = this.dV().d_(this.dv()).b();
         ((bxw)$$1).b(new bvz(bwb.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   protected void ag_() {
      this.b(bxe.bP);
      if (!this.ba()) {
         this.dV().a(null, 1041, this.dv(), 0);
      }
   }

   @Override
   protected daa t() {
      return daa.k;
   }
}
