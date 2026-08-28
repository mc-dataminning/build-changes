public class cyn extends cxd implements cyb {
   public static float a = 1.5F;

   public cyn(cxd.a $$0) {
      super($$0);
   }

   @Override
   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      cxh $$3 = $$1.b($$2);
      $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), awa.zy, awb.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
      if ($$0 instanceof ard $$4) {
         cqk.a(cqp::new, $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$1.b(awk.c.b(this));
      $$3.a(1, $$1);
      return bsy.a;
   }

   @Override
   public cqk a(dgz $$0, kb $$1, cxh $$2, jn $$3) {
      return new cqp($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }
}
