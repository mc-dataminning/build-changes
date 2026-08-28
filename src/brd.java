class brd extends brj {
   protected brd(brk $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bsy $$0, int $$1) {
      return $$0.fo() > 0.0F || $$0.dP().B;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(bsy $$0, int $$1) {
      super.b($$0, $$1);
      $$0.B(Math.max($$0.fo(), (float)(4 * (1 + $$1))));
   }
}
