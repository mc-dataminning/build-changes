class bth extends btm {
   protected bth(btn $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(arc $$0, bvf $$1, int $$2) {
      if ($$1 instanceof ard $$3 && !$$3.Z_() && $$0.am() != bsf.a && $$0.c($$3.dw())) {
         cqi $$4 = $$0.d($$3.dw());
         if ($$4 == null || $$4.m() < $$4.l()) {
            $$3.a(new bto(btq.I, 600, $$2));
            $$3.c($$3.dw());
            return false;
         }
      }

      return true;
   }
}
