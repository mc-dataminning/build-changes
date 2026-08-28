class bvs extends bvh {
   protected bvs(bvi $$0, int $$1) {
      super($$0, $$1, lx.y);
   }

   @Override
   public void a(arq $$0, bxe $$1, int $$2, bwf.e $$3) {
      if ($$3 == bwf.e.a) {
         double $$4 = $$1.dA();
         double $$5 = $$1.dC() + (double)($$1.dr() / 2.0F);
         double $$6 = $$1.dG();
         float $$7 = 3.0F + $$1.dY().i() * 2.0F;
         $$0.a($$1, null, cso.d, $$4, $$5, $$6, $$7, false, dja.a.e, lx.A, lx.z, awn.cQ);
      }
   }
}
