public class cyv extends cya implements cyb {
   public static float a = 0.5F;

   public cyv(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      if ($$0 instanceof arx $$4) {
         cqh.a(cqt::new, $$4, $$3, $$1, -20.0F, a, 1.0F);
      }

      $$1.b(axf.c.b(this));
      $$3.a(1, $$1);
      return bta.a;
   }

   @Override
   public cqh a(dgz $$0, ka $$1, cxg $$2, jm $$3) {
      return new cqt($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }

   @Override
   public cyb.a b() {
      return cyb.a.a().a(cyb.a.a.c() * 0.5F).b(cyb.a.a.d() * 1.25F).a();
   }
}
