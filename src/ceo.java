public class ceo extends cfk {
   public ceo(bnw<? extends ceo> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public static boolean a(bnw<ceo> $$0, cwg $$1, bom $$2, hz $$3, awp $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bom.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean af_() {
      return false;
   }

   @Override
   protected atk y() {
      return atl.mB;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.mE;
   }

   @Override
   protected atk n_() {
      return atl.mD;
   }

   @Override
   protected atk gg() {
      return atl.mF;
   }

   @Override
   public boolean B(bnq $$0) {
      boolean $$1 = super.B($$0);
      if ($$1 && this.eT().b() && $$0 instanceof boi) {
         float $$2 = this.dM().d_(this.dm()).b();
         ((boi)$$0).b(new bnd(bnf.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gi() {
      return true;
   }

   @Override
   protected void ae_() {
      this.b(bnw.bs);
      if (!this.aU()) {
         this.dM().a(null, 1041, this.dm(), 0);
      }
   }

   @Override
   protected cpd gh() {
      return cpd.h;
   }
}
