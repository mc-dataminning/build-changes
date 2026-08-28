class brr extends brx {
   protected brr(bry $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(btn $$0, int $$1) {
      return $$0.fp() > 0.0F || $$0.dP().B;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(btn $$0, int $$1) {
      super.b($$0, $$1);
      $$0.C(Math.max($$0.fp(), (float)(4 * (1 + $$1))));
   }
}
