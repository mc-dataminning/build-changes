import com.google.common.collect.ImmutableMap;

public class byj extends buj<clc> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ayf.c(34.0);
   private static final int i = ayf.f(60.0F);

   public byj() {
      super(ImmutableMap.of(cbu.o, cbv.a, cbu.aJ, cbv.b, cbu.aK, cbv.c, cbu.aL, cbv.c), i);
   }

   protected boolean a(aqn $$0, clc $$1) {
      return $$1.a($$1.dS().c(cbu.o).get(), 15.0, 20.0);
   }

   protected boolean a(aqn $$0, clc $$1, long $$2) {
      return true;
   }

   protected void b(aqn $$0, clc $$1, long $$2) {
      $$1.dS().a(cbu.p, true, (long)i);
      $$1.dS().a(cbu.aL, azh.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(avi.BT, 3.0F, 1.0F);
   }

   protected void c(aqn $$0, clc $$1, long $$2) {
      $$1.dS().c(cbu.o).ifPresent($$1x -> $$1.G().a($$1x.dn()));
      if (!$$1.dS().a(cbu.aL) && !$$1.dS().a(cbu.aK)) {
         $$1.dS().a(cbu.aK, azh.a, (long)(i - h));
         $$1.dS().c(cbu.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            eum $$3 = $$1.dn().e($$1.dm().b(brx.d, 0, $$1.dF()));
            eum $$4 = $$2x.bx().d($$3);
            eum $$5 = $$4.d();
            int $$6 = ayf.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               eum $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(ky.B, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(avi.BS, 3.0F, 1.0F);
            $$2x.a($$0.ai().e($$1), 10.0F);
            double $$9 = 0.5 * (1.0 - $$2x.g(bty.n));
            double $$10 = 2.5 * (1.0 - $$2x.g(bty.n));
            $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
         });
      }
   }

   protected void d(aqn $$0, clc $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bsq $$0, int $$1) {
      $$0.dS().a(cbu.aJ, azh.a, (long)$$1);
   }
}
