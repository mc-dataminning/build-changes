public class cyc extends cxh implements cxi {
   public static float a = 0.5F;

   public cyc(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = $$1.b($$2);
      if ($$0 instanceof arc $$4) {
         cpo.a(cqa::new, $$4, $$3, $$1, -20.0F, a, 1.0F);
      }

      $$1.b(awj.c.b(this));
      $$3.a(1, $$1);
      return bsi.a;
   }

   @Override
   public cpo a(dgg $$0, kb $$1, cwn $$2, jn $$3) {
      return new cqa($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }

   @Override
   public cxi.a b() {
      return cxi.a.a().a(cxi.a.a.c() * 0.5F).b(cxi.a.a.d() * 1.25F).a();
   }
}
