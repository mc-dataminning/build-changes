import com.mojang.serialization.MapCodec;

public class doh extends dij {
   public static final MapCodec<doh> a = b(doh::new);

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   protected doh(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      if (!$$0.a(cwj.sm)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bsh.a;
      } else {
         jm $$7 = $$6.c();
         jm $$8 = $$7.o() == jm.a.b ? $$4.cQ().g() : $$7;
         $$2.a(null, $$3, awo.uV, awp.e, 1.0F, 1.0F);
         $$2.a($$3, dil.ee.m().b(djd.b, $$8), 11);
         ckz $$9 = new ckz(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cwf(cwj.sp, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bve.d($$5));
         $$2.a($$4, eak.M, $$3);
         $$4.b(awy.c.b(cwj.sm));
         return bsh.a;
      }
   }
}
