public class clj extends cmc {
   public clj(cmc.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cmh $$0) {
      return true;
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arc.ic, ard.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cft $$4 = new cft($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dE(), $$1.dC(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(arm.c.b(this));
      if (!$$1.fT().d) {
         $$3.h(1);
      }

      return bjm.a($$3, $$0.y_());
   }
}
