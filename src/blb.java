class blb extends blf {
   protected blb(blg $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(bmk $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof ane $$2 && !$$0.P_()) {
         and $$3 = $$2.z();
         if ($$3.ak() == bjx.a) {
            return;
         }

         if ($$3.c($$0.dm())) {
            $$3.z().a($$2);
         }
      }
   }
}
