public class cek extends cfg {
   public cek(bnu<? extends cek> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public static boolean a(bnu<cek> $$0, cwc $$1, bok $$2, hz $$3, awo $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bok.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean af_() {
      return false;
   }

   @Override
   protected atj y() {
      return atk.mA;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.mD;
   }

   @Override
   protected atj n_() {
      return atk.mC;
   }

   @Override
   protected atj gg() {
      return atk.mE;
   }

   @Override
   public boolean B(bno $$0) {
      boolean $$1 = super.B($$0);
      if ($$1 && this.eT().b() && $$0 instanceof bog) {
         float $$2 = this.dM().d_(this.dm()).b();
         ((bog)$$0).b(new bnb(bnd.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gi() {
      return true;
   }

   @Override
   protected void ae_() {
      this.b(bnu.bs);
      if (!this.aU()) {
         this.dM().a(null, 1041, this.dm(), 0);
      }
   }

   @Override
   protected coz gh() {
      return coz.h;
   }
}
