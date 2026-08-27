class bja extends bje {
   protected bja(bjf $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(bkj $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof alr $$2 && !$$0.N_()) {
         alq $$3 = $$2.x();
         if ($$3.ai() == bhy.a) {
            return;
         }

         if ($$3.b($$0.dl())) {
            $$3.x().a($$2);
         }
      }
   }
}
