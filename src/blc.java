class blc extends blg {
   protected blc(blh $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(bml $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof ane $$2 && !$$0.P_()) {
         and $$3 = $$2.z();
         if ($$3.ak() == bjy.a) {
            return;
         }

         if ($$3.c($$0.dm())) {
            $$3.z().a($$2);
         }
      }
   }
}
