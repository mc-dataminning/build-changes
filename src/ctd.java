public class ctd extends ctv implements cus {
   public ctd(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avf.iG, avg.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cnk $$4 = new cnk($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avp.c.b(this));
      $$3.a(1, $$1);
      return bqe.a($$3, $$0.x_());
   }

   @Override
   public cmz a(dcd $$0, jt $$1, cua $$2, jf $$3) {
      cnk $$4 = new cnk($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cus.a c() {
      return cus.a.a().a(cus.a.a.c() * 0.5F).b(cus.a.a.d() * 1.25F).a();
   }
}
