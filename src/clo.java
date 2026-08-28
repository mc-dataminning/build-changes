public class clo extends cmk {
   public clo(bul<? extends clo> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public static boolean a(bul<clo> $$0, dfr $$1, buk $$2, jh $$3, azs $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (buk.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ai_() {
      return false;
   }

   @Override
   protected awk w() {
      return awl.mY;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.nb;
   }

   @Override
   protected awk o_() {
      return awl.na;
   }

   @Override
   protected awk y() {
      return awl.nc;
   }

   @Override
   public boolean E(bue $$0) {
      boolean $$1 = super.E($$0);
      if ($$1 && this.fb().f() && $$0 instanceof bva) {
         float $$2 = this.dX().d_(this.dx()).b();
         ((bva)$$0).b(new btj(btl.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gv() {
      return true;
   }

   @Override
   protected void ah_() {
      this.b(bul.bu);
      if (!this.bc()) {
         this.dX().a(null, 1041, this.dx(), 0);
      }
   }

   @Override
   protected cwb gu() {
      return cwb.k;
   }
}
