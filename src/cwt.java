public class cwt extends cvg implements cwh {
   public cwt(cvg.a $$0) {
      super($$0);
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      cvl $$3 = $$1.b($$2);
      $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), awd.yG, awe.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
      if ($$0 instanceof arg $$4) {
         coi.a(coo::new, $$4, $$3, $$1, 0.0F, 1.5F, 1.0F);
      }

      $$1.b(awn.c.b(this));
      $$3.a(1, $$1);
      return brk.a;
   }

   @Override
   public coi a(dds $$0, jx $$1, cvl $$2, jj $$3) {
      return new coo($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }
}
