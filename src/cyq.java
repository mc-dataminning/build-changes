public class cyq extends czg implements dae {
   public cyq(czg.a $$0) {
      super($$0);
   }

   @Override
   public bug a(djh $$0, crj $$1, buf $$2) {
      czk $$3 = $$1.b($$2);
      $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), awn.je, awo.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
      if ($$0 instanceof arq $$4) {
         cse.a(csp::new, $$4, $$3, $$1, -20.0F, 0.7F, 1.0F);
      }

      $$1.b(awx.c.b(this));
      $$3.a(1, $$1);
      return bug.a;
   }

   @Override
   public cse a(djh $$0, jp $$1, czk $$2, jb $$3) {
      return new csp($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }

   @Override
   public dae.a a() {
      return dae.a.a().a(dae.a.a.c() * 0.5F).b(dae.a.a.d() * 1.25F).a();
   }
}
