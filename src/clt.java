public class clt extends cmp {
   public clt(buq<? extends clt> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public static boolean a(buq<clt> $$0, dgx $$1, bup $$2, ji $$3, azg $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bup.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ai_() {
      return false;
   }

   @Override
   protected avy u() {
      return avz.nx;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.nA;
   }

   @Override
   protected avy o_() {
      return avz.nz;
   }

   @Override
   protected avy t() {
      return avz.nB;
   }

   @Override
   public boolean c(arc $$0, buj $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.eZ().f() && $$1 instanceof bvf) {
         float $$3 = this.dW().d_(this.dw()).b();
         ((bvf)$$1).b(new bto(btq.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean gq() {
      return true;
   }

   @Override
   protected void ah_() {
      this.b(buq.bN);
      if (!this.bb()) {
         this.dW().a(null, 1041, this.dw(), 0);
      }
   }

   @Override
   protected cwn gp() {
      return cwn.j;
   }
}
