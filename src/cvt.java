public class cvt extends cwk implements cxj {
   public cvt(cwk.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dgh $$0, cow $$1, bsi $$2) {
      cwo $$3 = $$1.b($$2);
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.jb, awb.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      if ($$0 instanceof ard $$4) {
         cpp.a(cqa::new, $$4, $$3, $$1, -20.0F, 0.7F, 1.0F);
      }

      $$1.b(awk.c.b(this));
      $$3.a(1, $$1);
      return bsj.a;
   }

   @Override
   public cpp a(dgh $$0, kb $$1, cwo $$2, jn $$3) {
      return new cqa($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }

   @Override
   public cxj.a b() {
      return cxj.a.a().a(cxj.a.a.c() * 0.5F).b(cxj.a.a.d() * 1.25F).a();
   }
}
