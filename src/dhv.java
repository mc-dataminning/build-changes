import com.mojang.serialization.MapCodec;

public class dhv extends dby {
   public static final MapCodec<dhv> a = b(dhv::new);

   @Override
   public MapCodec<dhv> a() {
      return a;
   }

   protected dhv(doy.d $$0) {
      super($$0);
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      if (!$$0.a(crm.rU)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return boc.a($$2.B);
      } else {
         ih $$7 = $$6.b();
         ih $$8 = $$7.o() == ih.a.b ? $$4.cE().g() : $$7;
         $$2.a(null, $$3, aum.uA, aun.e, 1.0F, 1.0F);
         $$2.a($$3, dca.ee.n().a(dcs.b, $$8), 11);
         cgd $$9 = new cgd(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new crj(crm.rX, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bqo.d($$5));
         $$2.a($$4, dts.M, $$3);
         $$4.b(auw.c.b(crm.rU));
         return boc.a($$2.B);
      }
   }
}
