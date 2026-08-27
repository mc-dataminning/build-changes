class bqc extends bpu {
   protected bqc(bpw $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bre $$0, int $$1) {
      if (!$$0.dN().B && $$0 instanceof ckl $$2) {
         $$2.gk().a($$1 + 1, 1.0F);
      }

      return true;
   }
}
