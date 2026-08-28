import com.mojang.serialization.MapCodec;

public class dqh extends dke {
   public static final MapCodec<dqh> a = b(dqh::new);

   @Override
   public MapCodec<dqh> a() {
      return a;
   }

   protected dqh(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      if (!$$0.a(cxl.sU)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bsy.a;
      } else {
         jn $$7 = $$6.c();
         jn $$8 = $$7.o() == jn.a.b ? $$4.cN().g() : $$7;
         $$2.a(null, $$3, awa.vG, awb.e, 1.0F, 1.0F);
         $$2.a($$3, dkg.er.m().b(dkz.b, $$8), 11);
         clw $$9 = new clw(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cxh(cxl.sX, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bvy.d($$5));
         $$2.a($$4, ecp.M, $$3);
         $$4.b(awk.c.b(cxl.sU));
         return bsy.a;
      }
   }
}
