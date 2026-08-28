class bvf extends bvk {
   protected bvf(bvl $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(arq $$0, bxj $$1, int $$2) {
      if ($$1 instanceof arr $$3 && !$$3.V_() && $$0.an() != bud.a && $$0.c($$3.du())) {
         ctc $$4 = $$0.d($$3.du());
         if ($$4 == null || $$4.l() < $$4.k()) {
            $$3.a(new bvm(bvo.I, 600, $$2));
            $$3.c($$3.du());
            return false;
         }
      }

      return true;
   }
}
