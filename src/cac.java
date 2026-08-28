import com.google.common.collect.ImmutableMap;

public class cac extends bwc<cmy> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = azd.c(34.0);
   private static final int i = azd.f(60.0F);

   public cac() {
      super(ImmutableMap.of(cdn.o, cdo.a, cdn.aJ, cdo.b, cdn.aK, cdo.c, cdn.aL, cdo.c), i);
   }

   protected boolean a(arh $$0, cmy $$1) {
      return $$1.a($$1.dX().c(cdn.o).get(), 15.0, 20.0);
   }

   protected boolean a(arh $$0, cmy $$1, long $$2) {
      return true;
   }

   protected void b(arh $$0, cmy $$1, long $$2) {
      $$1.dX().a(cdn.p, true, (long)i);
      $$1.dX().a(cdn.aL, bai.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awe.Cd, 3.0F, 1.0F);
   }

   protected void c(arh $$0, cmy $$1, long $$2) {
      $$1.dX().c(cdn.o).ifPresent($$1x -> $$1.K().a($$1x.dq()));
      if (!$$1.dX().a(cdn.aL) && !$$1.dX().a(cdn.aK)) {
         $$1.dX().a(cdn.aK, bai.a, (long)(i - h));
         $$1.dX().c(cdn.o).filter($$1::c).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            eys $$3 = $$1.dq().e($$1.dp().b(btp.d, 0, $$1.dI()));
            eys $$4 = $$2x.bC().d($$3);
            eys $$5 = $$4.d();
            int $$6 = azd.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               eys $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(ln.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awe.Cc, 3.0F, 1.0F);
            if ($$2x.a($$0.ak().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bvr.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bvr.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(arh $$0, cmy $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(buk $$0, int $$1) {
      $$0.dX().a(cdn.aJ, bai.a, (long)$$1);
   }
}
