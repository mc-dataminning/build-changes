class bhx extends bib {
   protected bhx(bic $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(bjg $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof akr $$2 && !$$0.M_()) {
         akq $$3 = $$2.x();
         if ($$3.ai() == bgv.a) {
            return;
         }

         if ($$3.b($$0.dl())) {
            $$3.x().a($$2);
         }
      }
   }
}
