class bpt extends bpv {
   protected bpt(bpw $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bre $$0, int $$1) {
      if ($$0 instanceof ckl $$2) {
         $$2.C(0.005F * (float)($$1 + 1));
      }

      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }
}
