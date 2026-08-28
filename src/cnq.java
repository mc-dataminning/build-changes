public class cnq extends com {
   public cnq(bwj<? extends cnq> $$0, dip $$1) {
      super($$0, $$1);
   }

   public static boolean a(bwj<cnq> $$0, djg $$1, bwi $$2, iu $$3, azt $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bwi.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ac_() {
      return false;
   }

   @Override
   protected awk u() {
      return awl.nx;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.nA;
   }

   @Override
   protected awk l_() {
      return awl.nz;
   }

   @Override
   protected awk n() {
      return awl.nB;
   }

   @Override
   public boolean c(aro $$0, bwa $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.fa().f() && $$1 instanceof bwz) {
         float $$3 = this.dV().d_(this.dv()).b();
         ((bwz)$$1).b(new bve(bvg.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   protected void ab_() {
      this.b(bwj.bO);
      if (!this.bb()) {
         this.dV().a(null, 1041, this.dv(), 0);
      }
   }

   @Override
   protected cys t() {
      return cys.k;
   }
}
