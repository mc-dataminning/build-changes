class bus extends bum {
   protected bus(bun $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(ash $$0, bwf $$1, int $$2) {
      if ($$1.eE() > 1.0F) {
         $$1.a($$0, $$1.dX().q(), 1.0F);
      }

      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 25 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
