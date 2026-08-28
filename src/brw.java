class brw extends bsc {
   protected brw(bsd $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(btr $$0, int $$1) {
      return $$0.fs() > 0.0F || $$0.dP().B;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(btr $$0, int $$1) {
      super.b($$0, $$1);
      $$0.A(Math.max($$0.fs(), (float)(4 * (1 + $$1))));
   }
}
