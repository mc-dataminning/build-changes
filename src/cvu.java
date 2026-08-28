public class cvu extends cuk implements cvh {
   public cvu(cuk.a $$0) {
      super($$0);
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      cup $$3 = $$1.b($$2);
      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), awa.yx, awb.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cnu $$4 = new cnu($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(awk.c.b(this));
      $$3.a(1, $$1);
      return bqv.a($$3, $$0.x_());
   }

   @Override
   public cnp a(dby $$0, js $$1, cup $$2, je $$3) {
      cnu $$4 = new cnu($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }
}
