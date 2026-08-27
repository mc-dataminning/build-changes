import com.google.common.collect.ImmutableMap;

public class bxs extends bts<ckl> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = axz.c(34.0);
   private static final int i = axz.f(60.0F);

   public bxs() {
      super(ImmutableMap.of(cbd.o, cbe.a, cbd.aJ, cbe.b, cbd.aK, cbe.c, cbd.aL, cbe.c), i);
   }

   protected boolean a(aqh $$0, ckl $$1) {
      return $$1.a($$1.dQ().c(cbd.o).get(), 15.0, 20.0);
   }

   protected boolean a(aqh $$0, ckl $$1, long $$2) {
      return true;
   }

   protected void b(aqh $$0, ckl $$1, long $$2) {
      $$1.dQ().a(cbd.p, true, (long)i);
      $$1.dQ().a(cbd.aL, azb.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(avc.BI, 3.0F, 1.0F);
   }

   protected void c(aqh $$0, ckl $$1, long $$2) {
      $$1.dQ().c(cbd.o).ifPresent($$1x -> $$1.G().a($$1x.dl()));
      if (!$$1.dQ().a(cbd.aL) && !$$1.dQ().a(cbd.aK)) {
         $$1.dQ().a(cbd.aK, azb.a, (long)(i - h));
         $$1.dQ().c(cbd.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            etp $$3 = $$1.dl().e($$1.dk().b(bri.d, 0, $$1.dD()));
            etp $$4 = $$2x.bv().d($$3);
            etp $$5 = $$4.d();
            int $$6 = axz.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               etp $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(kx.A, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(avc.BH, 3.0F, 1.0F);
            $$2x.a($$0.ai().e($$1), 10.0F);
            double $$9 = 0.5 * (1.0 - $$2x.g(bth.n));
            double $$10 = 2.5 * (1.0 - $$2x.g(bth.n));
            $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
         });
      }
   }

   protected void d(aqh $$0, ckl $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bsa $$0, int $$1) {
      $$0.dQ().a(cbd.aJ, azb.a, (long)$$1);
   }
}
