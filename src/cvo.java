public class cvo extends cur implements cus {
   public cvo(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      if (!$$0.B) {
         cnl $$4 = new cnl($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), -20.0F, 0.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avp.c.b(this));
      $$3.a(1, $$1);
      return bqe.a($$3, $$0.x_());
   }

   @Override
   public cmz a(dcd $$0, jt $$1, cua $$2, jf $$3) {
      cnl $$4 = new cnl($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cus.a c() {
      return cus.a.a().a(cus.a.a.c() * 0.5F).b(cus.a.a.d() * 1.25F).a();
   }
}
