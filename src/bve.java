class bve extends bvh {
   protected bve(bvi $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(arq $$0, bxe $$1, int $$2) {
      if ($$1 instanceof crc $$3) {
         $$3.G(0.005F * (float)($$2 + 1));
      }

      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }
}
