class bsd extends brw {
   protected bsd(brx $$0, int $$1, lk $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(btl $$0, int $$1) {
      if ($$0 instanceof aqu $$2 && !$$0.N_()) {
         aqt $$3 = $$2.A();
         jd $$4 = $$2.af();
         if ($$4 != null) {
            $$3.z().a($$2, $$4);
            $$2.ae();
            return false;
         }
      }

      return true;
   }
}
