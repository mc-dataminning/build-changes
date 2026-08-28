class bva extends bvf {
   protected bva(bvg $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(arq $$0, bxc $$1, int $$2) {
      if ($$1 instanceof arr $$3 && !$$3.U_() && $$0.an() != bty.a && $$0.c($$3.dv())) {
         csn $$4 = $$0.d($$3.dv());
         if ($$4 == null || $$4.l() < $$4.k()) {
            $$3.a(new bvh(bvj.I, 600, $$2));
            $$3.c($$3.dv());
            return false;
         }
      }

      return true;
   }
}
