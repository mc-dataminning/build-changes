class bsx extends bsn {
   protected bsx(bsp $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(buf $$0, int $$1) {
      if (!$$0.dS().B && $$0 instanceof cnp $$2) {
         $$2.gm().a($$1 + 1, 1.0F);
      }

      return true;
   }
}
