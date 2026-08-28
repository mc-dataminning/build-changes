class bvc extends bvh {
   protected bvc(bvi $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(arq $$0, bxe $$1, int $$2) {
      if ($$1 instanceof arr $$3 && !$$3.V_() && $$0.an() != bua.a && $$0.c($$3.dv())) {
         css $$4 = $$0.d($$3.dv());
         if ($$4 == null || $$4.l() < $$4.k()) {
            $$3.a(new bvj(bvl.I, 600, $$2));
            $$3.c($$3.dv());
            return false;
         }
      }

      return true;
   }
}
