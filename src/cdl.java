import com.google.common.collect.ImmutableMap;

public class cdl extends bzl<cra> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = azo.c(34.0);
   private static final int i = azo.f(60.0F);

   public cdl() {
      super(ImmutableMap.of(cgw.p, cgx.a, cgw.aK, cgx.b, cgw.aL, cgx.c, cgw.aM, cgx.c), i);
   }

   protected boolean a(ars $$0, cra $$1) {
      return $$1.a($$1.ec().c(cgw.p).get(), 15.0, 20.0);
   }

   protected boolean a(ars $$0, cra $$1, long $$2) {
      return true;
   }

   protected void b(ars $$0, cra $$1, long $$2) {
      $$1.ec().a(cgw.q, true, (long)i);
      $$1.ec().a(cgw.aM, baw.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awp.Db, 3.0F, 1.0F);
   }

   protected void c(ars $$0, cra $$1, long $$2) {
      $$1.ec().c(cgw.p).ifPresent($$1x -> $$1.J().a($$1x.dt()));
      if (!$$1.ec().a(cgw.aM) && !$$1.ec().a(cgw.aL)) {
         $$1.ec().a(cgw.aL, baw.a, (long)(i - h));
         $$1.ec().c(cgw.p).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            ffq $$3 = $$1.dt().e($$1.ds().b(bwu.d, 0, $$1.dL()));
            ffq $$4 = $$2x.bD().d($$3);
            ffq $$5 = $$4.d();
            int $$6 = azo.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               ffq $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(ly.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awp.Da, 3.0F, 1.0F);
            if ($$2x.a($$0, $$0.al().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bza.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bza.p));
               $$2x.i($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(ars $$0, cra $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bxu $$0, int $$1) {
      $$0.ec().a(cgw.aK, baw.a, (long)$$1);
   }
}
