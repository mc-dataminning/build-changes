class bhx extends bid {
   protected bhx(bie $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(bji $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0.fj() <= 0.0F && !$$0.dL().B) {
         $$0.d(this);
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(bji $$0, int $$1) {
      super.b($$0, $$1);
      $$0.y(Math.max($$0.fj(), (float)(4 * (1 + $$1))));
   }
}
