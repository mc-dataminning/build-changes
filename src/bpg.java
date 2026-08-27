class bpg extends bpk {
   protected bpg(bpl $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(bqt $$0, int $$1) {
      if ($$0 instanceof apv $$2 && !$$0.N_()) {
         apu $$3 = $$2.z();
         if ($$3.ak() != boc.a && $$3.c($$0.dm())) {
            $$3.z().a($$2);
         }
      }

      return true;
   }
}
