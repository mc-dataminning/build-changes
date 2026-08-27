public class clz extends cms {
   public clz(cms.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cmx $$0) {
      return true;
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      cmx $$3 = $$1.b($$2);
      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arr.ic, ars.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cgj $$4 = new cgj($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dE(), $$1.dC(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(asb.c.b(this));
      if (!$$1.fT().d) {
         $$3.h(1);
      }

      return bkb.a($$3, $$0.y_());
   }
}
