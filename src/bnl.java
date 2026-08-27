class bnl extends bnq {
   protected bnl(bnr $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(box $$0, int $$1) {
      return $$0.fm() > 0.0F || $$0.dJ().B;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(box $$0, int $$1) {
      super.b($$0, $$1);
      $$0.y(Math.max($$0.fm(), (float)(4 * (1 + $$1))));
   }
}
