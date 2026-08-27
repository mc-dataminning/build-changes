class bhs extends bhw {
   protected bhs(bhx $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(bjb $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof ako $$2 && !$$0.G_()) {
         akn $$3 = $$2.x();
         if ($$3.ai() == bgq.a) {
            return;
         }

         if ($$3.b($$0.dk())) {
            $$3.x().a($$2);
         }
      }
   }
}
