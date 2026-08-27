class bnm extends bnq {
   protected bnm(bnr $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(box $$0, int $$1) {
      if ($$0 instanceof apb $$2 && !$$0.P_()) {
         apa $$3 = $$2.z();
         if ($$3.aj() != bmi.a && $$3.c($$0.dj())) {
            $$3.z().a($$2);
         }
      }

      return true;
   }
}
