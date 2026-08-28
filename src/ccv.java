import com.google.common.collect.ImmutableMap;

public class ccv extends byv<cqf> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = azm.c(34.0);
   private static final int i = azm.f(60.0F);

   public ccv() {
      super(ImmutableMap.of(cgg.p, cgh.a, cgg.aK, cgh.b, cgg.aL, cgh.c, cgg.aM, cgh.c), i);
   }

   protected boolean a(arq $$0, cqf $$1) {
      return $$1.a($$1.ec().c(cgg.p).get(), 15.0, 20.0);
   }

   protected boolean a(arq $$0, cqf $$1, long $$2) {
      return true;
   }

   protected void b(arq $$0, cqf $$1, long $$2) {
      $$1.ec().a(cgg.q, true, (long)i);
      $$1.ec().a(cgg.aM, bau.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awn.Db, 3.0F, 1.0F);
   }

   protected void c(arq $$0, cqf $$1, long $$2) {
      $$1.ec().c(cgg.p).ifPresent($$1x -> $$1.J().a($$1x.dt()));
      if (!$$1.ec().a(cgg.aM) && !$$1.ec().a(cgg.aL)) {
         $$1.ec().a(cgg.aL, bau.a, (long)(i - h));
         $$1.ec().c(cgg.p).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            feq $$3 = $$1.dt().e($$1.ds().b(bwg.d, 0, $$1.dL()));
            feq $$4 = $$2x.bE().d($$3);
            feq $$5 = $$4.d();
            int $$6 = azm.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               feq $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(lx.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awn.Da, 3.0F, 1.0F);
            if ($$2x.a($$0, $$0.al().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(byk.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(byk.p));
               $$2x.i($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(arq $$0, cqf $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bxe $$0, int $$1) {
      $$0.ec().a(cgg.aK, bau.a, (long)$$1);
   }
}
