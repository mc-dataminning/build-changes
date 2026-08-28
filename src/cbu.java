import com.google.common.collect.ImmutableMap;

public class cbu extends bxu<cov> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = bae.c(34.0);
   private static final int i = bae.f(60.0F);

   public cbu() {
      super(ImmutableMap.of(cff.o, cfg.a, cff.aJ, cfg.b, cff.aK, cfg.c, cff.aL, cfg.c), i);
   }

   protected boolean a(ash $$0, cov $$1) {
      return $$1.a($$1.eb().c(cff.o).get(), 15.0, 20.0);
   }

   protected boolean a(ash $$0, cov $$1, long $$2) {
      return true;
   }

   protected void b(ash $$0, cov $$1, long $$2) {
      $$1.eb().a(cff.p, true, (long)i);
      $$1.eb().a(cff.aL, bbk.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(axf.Cv, 3.0F, 1.0F);
   }

   protected void c(ash $$0, cov $$1, long $$2) {
      $$1.eb().c(cff.o).ifPresent($$1x -> $$1.H().a($$1x.dt()));
      if (!$$1.eb().a(cff.aL) && !$$1.eb().a(cff.aK)) {
         $$1.eb().a(cff.aK, bbk.a, (long)(i - h));
         $$1.eb().c(cff.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            fbs $$3 = $$1.dt().e($$1.ds().b(bvg.d, 0, $$1.dL()));
            fbs $$4 = $$2x.bF().d($$3);
            fbs $$5 = $$4.d();
            int $$6 = bae.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               fbs $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(ls.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(axf.Cu, 3.0F, 1.0F);
            if ($$2x.a($$0, $$0.aj().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bxj.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bxj.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(ash $$0, cov $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bwb $$0, int $$1) {
      $$0.eb().a(cff.aJ, bbk.a, (long)$$1);
   }
}
