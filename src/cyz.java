public class cyz extends cxd implements cyb {
   public static float a = 1.5F;

   public cyz(cxd.a $$0) {
      super($$0);
   }

   @Override
   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      cxh $$3 = $$1.b($$2);
      if ($$0 instanceof ard $$4) {
         cqk.a(($$2x, $$3x, $$4x) -> new crc($$1, $$0, $$1.ds().a(), $$1.bD().b(), $$1.ds().c()), $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), awa.Dp, awb.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
      $$1.b(awk.c.b(this));
      $$3.a(1, $$1);
      return bsy.a;
   }

   @Override
   public cqk a(dgz $$0, kb $$1, cxh $$2, jn $$3) {
      azh $$4 = $$0.C_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fbx $$8 = new fbx($$5, $$6, $$7);
      crc $$9 = new crc($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.i($$8);
      return $$9;
   }

   @Override
   public void a(cqk $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cyb.a b() {
      return cyb.a.a().a(($$0, $$1) -> dmk.a($$0, 1.0, fbx.c)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
