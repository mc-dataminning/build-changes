public class clj extends cmf {
   public clj(bug<? extends clj> $$0, dev $$1) {
      super($$0, $$1);
   }

   public static boolean a(bug<clj> $$0, dfl $$1, buf $$2, jg $$3, azr $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (buf.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ai_() {
      return false;
   }

   @Override
   protected awj w() {
      return awk.mY;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.nb;
   }

   @Override
   protected awj o_() {
      return awk.na;
   }

   @Override
   protected awj y() {
      return awk.nc;
   }

   @Override
   public boolean E(btz $$0) {
      boolean $$1 = super.E($$0);
      if ($$1 && this.fb().f() && $$0 instanceof buv) {
         float $$2 = this.dX().d_(this.dx()).b();
         ((buv)$$0).b(new bte(btg.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gw() {
      return true;
   }

   @Override
   protected void ah_() {
      this.b(bug.bu);
      if (!this.bc()) {
         this.dX().a(null, 1041, this.dx(), 0);
      }
   }

   @Override
   protected cvx gv() {
      return cvx.k;
   }
}
