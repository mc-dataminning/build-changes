import com.mojang.serialization.MapCodec;

public class dpp extends djm {
   public static final MapCodec<dpp> a = b(dpp::new);

   @Override
   public MapCodec<dpp> a() {
      return a;
   }

   protected dpp(dww.d $$0) {
      super($$0);
   }

   @Override
   protected bsk a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsj $$5, faw $$6) {
      if (!$$0.a(cwt.sS)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bsk.a;
      } else {
         jn $$7 = $$6.c();
         jn $$8 = $$7.o() == jn.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, awa.vw, awb.e, 1.0F, 1.0F);
         $$2.a($$3, djo.er.m().b(dkh.b, $$8), 11);
         clc $$9 = new clc(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cwp(cwt.sV, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bvh.d($$5));
         $$2.a($$4, ebt.M, $$3);
         $$4.b(awk.c.b(cwt.sS));
         return bsk.a;
      }
   }
}
