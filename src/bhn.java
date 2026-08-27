class bhn extends bhr {
   protected bhn(bhs $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(biw $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof akj $$2 && !$$0.G_()) {
         aki $$3 = $$2.x();
         if ($$3.ai() == bgl.a) {
            return;
         }

         if ($$3.b($$0.dk())) {
            $$3.x().a($$2);
         }
      }
   }
}
