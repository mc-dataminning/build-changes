public class cye extends cxj implements cxk {
   public static float a = 0.5F;

   public cye(cwl.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(dgi $$0, cox $$1, bsj $$2) {
      cwp $$3 = $$1.b($$2);
      if ($$0 instanceof ard $$4) {
         cpq.a(cqc::new, $$4, $$3, $$1, -20.0F, a, 1.0F);
      }

      $$1.b(awk.c.b(this));
      $$3.a(1, $$1);
      return bsk.a;
   }

   @Override
   public cpq a(dgi $$0, kb $$1, cwp $$2, jn $$3) {
      return new cqc($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }

   @Override
   public cxk.a b() {
      return cxk.a.a().a(cxk.a.a.c() * 0.5F).b(cxk.a.a.d() * 1.25F).a();
   }
}
