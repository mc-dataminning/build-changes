import com.google.common.collect.ImmutableMap;

public class cdw extends bzw<crl> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = azz.c(34.0);
   private static final int i = azz.f(60.0F);

   public cdw() {
      super(ImmutableMap.of(chh.p, chi.a, chh.aK, chi.b, chh.aL, chi.c, chh.aM, chi.c), i);
   }

   protected boolean a(asb $$0, crl $$1) {
      return $$1.a($$1.ec().c(chh.p).get(), 15.0, 20.0);
   }

   protected boolean a(asb $$0, crl $$1, long $$2) {
      return true;
   }

   protected void b(asb $$0, crl $$1, long $$2) {
      $$1.ec().a(chh.q, true, (long)i);
      $$1.ec().a(chh.aM, bbh.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awy.Db, 3.0F, 1.0F);
   }

   protected void c(asb $$0, crl $$1, long $$2) {
      $$1.ec().c(chh.p).ifPresent($$1x -> $$1.J().a($$1x.dt()));
      if (!$$1.ec().a(chh.aM) && !$$1.ec().a(chh.aL)) {
         $$1.ec().a(chh.aL, bbh.a, (long)(i - h));
         $$1.ec().c(chh.p).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            fgc $$3 = $$1.dt().e($$1.ds().b(bxf.d, 0, $$1.dL()));
            fgc $$4 = $$2x.bD().d($$3);
            fgc $$5 = $$4.d();
            int $$6 = azz.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               fgc $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(lz.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awy.Da, 3.0F, 1.0F);
            if ($$2x.a($$0, $$0.al().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bzl.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bzl.p));
               $$2x.i($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(asb $$0, crl $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(byf $$0, int $$1) {
      $$0.ec().a(chh.aK, bbh.a, (long)$$1);
   }
}
