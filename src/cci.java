import com.google.common.collect.ImmutableMap;

public class cci extends byi<cpl> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = azk.c(34.0);
   private static final int i = azk.f(60.0F);

   public cci() {
      super(ImmutableMap.of(cft.p, cfu.a, cft.aK, cfu.b, cft.aL, cfu.c, cft.aM, cfu.c), i);
   }

   protected boolean a(arn $$0, cpl $$1) {
      return $$1.a($$1.eb().c(cft.p).get(), 15.0, 20.0);
   }

   protected boolean a(arn $$0, cpl $$1, long $$2) {
      return true;
   }

   protected void b(arn $$0, cpl $$1, long $$2) {
      $$1.eb().a(cft.q, true, (long)i);
      $$1.eb().a(cft.aM, baq.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awk.CV, 3.0F, 1.0F);
   }

   protected void c(arn $$0, cpl $$1, long $$2) {
      $$1.eb().c(cft.p).ifPresent($$1x -> $$1.J().a($$1x.dt()));
      if (!$$1.eb().a(cft.aM) && !$$1.eb().a(cft.aL)) {
         $$1.eb().a(cft.aL, baq.a, (long)(i - h));
         $$1.eb().c(cft.p).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            fcu $$3 = $$1.dt().e($$1.ds().b(bvt.d, 0, $$1.dL()));
            fcu $$4 = $$2x.bE().d($$3);
            fcu $$5 = $$4.d();
            int $$6 = azk.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               fcu $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(lv.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awk.CU, 3.0F, 1.0F);
            if ($$2x.a($$0, $$0.al().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bxx.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bxx.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(arn $$0, cpl $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bwr $$0, int $$1) {
      $$0.eb().a(cft.aK, baq.a, (long)$$1);
   }
}
