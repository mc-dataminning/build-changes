class bta extends bst {
   protected bta(bsu $$0, int $$1, ll $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(buk $$0, int $$1) {
      if ($$0 instanceof ari $$2 && !$$0.P_()) {
         arh $$3 = $$2.B();
         je $$4 = $$2.ah();
         if ($$4 != null) {
            $$3.z().a($$2, $$4);
            $$2.ag();
            return false;
         }
      }

      return true;
   }
}
