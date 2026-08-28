import com.mojang.serialization.MapCodec;

public class doo extends diq {
   public static final MapCodec<doo> a = b(doo::new);

   @Override
   public MapCodec<doo> a() {
      return a;
   }

   protected doo(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      if (!$$0.a(cwq.sm)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bsk.a;
      } else {
         jm $$7 = $$6.c();
         jm $$8 = $$7.o() == jm.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, awn.uV, awo.e, 1.0F, 1.0F);
         $$2.a($$3, dis.ee.m().b(djk.b, $$8), 11);
         clc $$9 = new clc(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cwm(cwq.sp, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bvh.d($$5));
         $$2.a($$4, ear.M, $$3);
         $$4.b(awx.c.b(cwq.sm));
         return bsk.a;
      }
   }
}
