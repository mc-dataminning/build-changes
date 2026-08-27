class bjp extends bjt {
   protected bjp(bju $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(bky $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof amb $$2 && !$$0.N_()) {
         ama $$3 = $$2.x();
         if ($$3.ai() == bin.a) {
            return;
         }

         if ($$3.b($$0.dl())) {
            $$3.x().a($$2);
         }
      }
   }
}
