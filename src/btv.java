class btv extends btn {
   protected btv(bto $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(arc $$0, bvg $$1, int $$2) {
      if ($$1.eE() < $$1.eS()) {
         $$1.c(1.0F);
      }

      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 50 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
