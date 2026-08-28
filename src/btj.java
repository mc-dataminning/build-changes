class btj extends bto {
   protected btj(btp $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(arp $$0, bvh $$1, int $$2) {
      if ($$1 instanceof arq $$3 && !$$3.Y_() && $$0.ak() != bsh.a && $$0.c($$3.dv())) {
         cqh $$4 = $$0.d($$3.dv());
         if ($$4 == null || $$4.m() < $$4.l()) {
            $$3.a(new btq(bts.I, 600, $$2));
            $$3.c($$3.dv());
            return false;
         }
      }

      return true;
   }
}
