public class clu extends cmq {
   public clu(bur<? extends clu> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public static boolean a(bur<clu> $$0, dgz $$1, buq $$2, ji $$3, azh $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (buq.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ai_() {
      return false;
   }

   @Override
   protected avz u() {
      return awa.nx;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.nA;
   }

   @Override
   protected avz o_() {
      return awa.nz;
   }

   @Override
   protected avz t() {
      return awa.nB;
   }

   @Override
   public boolean c(arc $$0, buk $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.eZ().f() && $$1 instanceof bvg) {
         float $$3 = this.dW().d_(this.dw()).b();
         ((bvg)$$1).b(new btp(btr.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean gq() {
      return true;
   }

   @Override
   protected void ah_() {
      this.b(bur.bO);
      if (!this.bb()) {
         this.dW().a(null, 1041, this.dw(), 0);
      }
   }

   @Override
   protected cwp gp() {
      return cwp.j;
   }
}
