import com.mojang.serialization.MapCodec;

public class dth extends dnc {
   public static final MapCodec<dth> a = b(dth::new);

   @Override
   public MapCodec<dth> a() {
      return a;
   }

   protected dth(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      if (!$$0.a(dac.td)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bur.a;
      } else {
         jb $$7 = $$6.c();
         jb $$8 = $$7.o() == jb.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, awp.vK, awq.e, 1.0F, 1.0F);
         $$2.a($$3, dne.ev.m().b(dny.b, $$8), 11);
         coc $$9 = new coc(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new czy(dac.tg, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bxu.d($$5));
         $$2.a($$4, ege.M, $$3);
         $$4.b(awz.c.b(dac.td));
         return bur.a;
      }
   }
}
