class btf extends btl {
   protected btf(btm $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bve $$0, int $$1) {
      return $$0.fz() > 0.0F || $$0.dY().C;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(bve $$0, int $$1) {
      super.b($$0, $$1);
      $$0.E(Math.max($$0.fz(), (float)(4 * (1 + $$1))));
   }
}
