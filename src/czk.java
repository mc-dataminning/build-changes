public class czk extends cyr implements cys {
   public static float a = 0.5F;

   public czk(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = $$1.b($$2);
      if ($$0 instanceof arn $$4) {
         crb.a(crn::new, $$4, $$3, $$1, -20.0F, a, 1.0F);
      }

      $$1.b(awu.c.b(this));
      $$3.a(1, $$1);
      return btq.a;
   }

   @Override
   public crb a(dhp $$0, kc $$1, cxy $$2, jo $$3) {
      return new crn($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }

   @Override
   public cys.a b() {
      return cys.a.a().a(cys.a.a.c() * 0.5F).b(cys.a.a.d() * 1.25F).a();
   }
}
