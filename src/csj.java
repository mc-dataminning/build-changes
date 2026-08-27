public class csj extends ctj implements cug {
   public csj(ctj.a $$0) {
      super($$0);
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      cto $$3 = $$1.b($$2);
      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avh.hN, avi.h, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cmx $$4 = new cmx($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avr.c.b(this));
      $$3.a(1, $$1);
      return bpv.a($$3, $$0.x_());
   }

   @Override
   public cmo a(dax $$0, jh $$1, cto $$2, it $$3) {
      cmx $$4 = new cmx($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }
}
