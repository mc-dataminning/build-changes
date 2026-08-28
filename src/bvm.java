class bvm extends bvf {
   protected bvm(bvg $$0, int $$1, lv $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(arq $$0, bxc $$1, int $$2) {
      if ($$1 instanceof arr $$3 && !$$1.U_()) {
         iu $$4 = $$3.ag();
         if ($$4 != null) {
            $$0.B().a($$3, $$4);
            $$3.af();
            return false;
         }
      }

      return true;
   }
}
