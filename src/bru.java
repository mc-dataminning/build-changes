class bru extends brn {
   protected bru(bro $$0, int $$1, lh $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(btc $$0, int $$1) {
      if ($$0 instanceof aqn $$2 && !$$0.N_()) {
         aqm $$3 = $$2.A();
         ja $$4 = $$2.af();
         if ($$4 != null) {
            $$3.z().a($$2, $$4);
            $$2.ae();
            return false;
         }
      }

      return true;
   }
}
