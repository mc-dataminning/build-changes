class bkj extends bkb {
   protected bkj(bkc $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(blg $$0, int $$1) {
      super.a($$0, $$1);
      $$0.a($$0.dO().p(), 1.0F);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 40 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
