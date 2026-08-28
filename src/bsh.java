class bsh extends brv {
   protected bsh(brw $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(btk $$0, int $$1) {
      $$0.a($$0.dQ().p(), 1.0F);
      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 40 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
