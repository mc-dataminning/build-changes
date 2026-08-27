import com.google.common.collect.ImmutableMap;

public class bww extends bsw<cjp> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = axw.c(34.0);
   private static final int i = axw.f(60.0F);

   public bww() {
      super(ImmutableMap.of(cah.o, cai.a, cah.aJ, cai.b, cah.aK, cai.c, cah.aL, cai.c), i);
   }

   protected boolean a(aqe $$0, cjp $$1) {
      return $$1.a($$1.dQ().c(cah.o).get(), 15.0, 20.0);
   }

   protected boolean a(aqe $$0, cjp $$1, long $$2) {
      return true;
   }

   protected void b(aqe $$0, cjp $$1, long $$2) {
      $$1.dQ().a(cah.p, true, (long)i);
      $$1.dQ().a(cah.aL, ayy.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(auz.BH, 3.0F, 1.0F);
   }

   protected void c(aqe $$0, cjp $$1, long $$2) {
      $$1.dQ().c(cah.o).ifPresent($$1x -> $$1.G().a($$1x.dl()));
      if (!$$1.dQ().a(cah.aL) && !$$1.dQ().a(cah.aK)) {
         $$1.dQ().a(cah.aK, ayy.a, (long)(i - h));
         $$1.dQ().c(cah.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            etf $$3 = $$1.dl().e($$1.dk().b(bqm.d, 0, $$1.dD()));
            etf $$4 = $$2x.bv().d($$3);
            etf $$5 = $$4.d();
            int $$6 = axw.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               etf $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(kw.A, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(auz.BG, 3.0F, 1.0F);
            $$2x.a($$0.ai().e($$1), 10.0F);
            double $$9 = 0.5 * (1.0 - $$2x.g(bsl.n));
            double $$10 = 2.5 * (1.0 - $$2x.g(bsl.n));
            $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
         });
      }
   }

   protected void d(aqe $$0, cjp $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bre $$0, int $$1) {
      $$0.dQ().a(cah.aJ, ayy.a, (long)$$1);
   }
}
