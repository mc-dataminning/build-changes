public class cyu extends cya implements cyb {
   public static float a = 0.5F;

   public cyu(cxd.a $$0) {
      super($$0);
   }

   @Override
   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      cxh $$3 = $$1.b($$2);
      if ($$0 instanceof ard $$4) {
         cqk.a(cqw::new, $$4, $$3, $$1, -20.0F, a, 1.0F);
      }

      $$1.b(awk.c.b(this));
      $$3.a(1, $$1);
      return bsy.a;
   }

   @Override
   public cqk a(dgz $$0, kb $$1, cxh $$2, jn $$3) {
      return new cqw($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }

   @Override
   public cyb.a b() {
      return cyb.a.a().a(cyb.a.a.c() * 0.5F).b(cyb.a.a.d() * 1.25F).a();
   }
}
