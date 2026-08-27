class bpq extends bpv {
   protected bpq(bpw $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bre $$0, int $$1) {
      return $$0.fq() > 0.0F || $$0.dN().B;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(bre $$0, int $$1) {
      super.b($$0, $$1);
      $$0.A(Math.max($$0.fq(), (float)(4 * (1 + $$1))));
   }
}
