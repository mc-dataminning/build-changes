class bps extends bpk {
   protected bps(bpl $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bqt $$0, int $$1) {
      $$0.a($$0.dN().p(), 1.0F);
      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 40 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
