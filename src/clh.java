public class clh extends cmc {
   public clh(cmc.a $$0) {
      super($$0);
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arc.hP, ard.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      $$1.gn().a(this, 20);
      if (!$$0.B) {
         cfs $$4 = new cfs($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dE(), $$1.dC(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(arm.c.b(this));
      if (!$$1.fT().d) {
         $$3.h(1);
      }

      return bjm.a($$3, $$0.y_());
   }
}
