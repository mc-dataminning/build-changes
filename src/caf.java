import com.google.common.collect.ImmutableMap;

public class caf extends bwf<cnb> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = azf.c(34.0);
   private static final int i = azf.f(60.0F);

   public caf() {
      super(ImmutableMap.of(cdq.o, cdr.a, cdq.aJ, cdr.b, cdq.aK, cdr.c, cdq.aL, cdr.c), i);
   }

   protected boolean a(arj $$0, cnb $$1) {
      return $$1.a($$1.dY().c(cdq.o).get(), 15.0, 20.0);
   }

   protected boolean a(arj $$0, cnb $$1, long $$2) {
      return true;
   }

   protected void b(arj $$0, cnb $$1, long $$2) {
      $$1.dY().a(cdq.p, true, (long)i);
      $$1.dY().a(cdq.aL, bak.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awg.Cd, 3.0F, 1.0F);
   }

   protected void c(arj $$0, cnb $$1, long $$2) {
      $$1.dY().c(cdq.o).ifPresent($$1x -> $$1.K().a($$1x.dq()));
      if (!$$1.dY().a(cdq.aL) && !$$1.dY().a(cdq.aK)) {
         $$1.dY().a(cdq.aK, bak.a, (long)(i - h));
         $$1.dY().c(cdq.o).filter($$1::c).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            eyw $$3 = $$1.dq().e($$1.dp().b(bts.d, 0, $$1.dI()));
            eyw $$4 = $$2x.bC().d($$3);
            eyw $$5 = $$4.d();
            int $$6 = azf.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               eyw $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(lo.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awg.Cc, 3.0F, 1.0F);
            if ($$2x.a($$0.ak().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bvu.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bvu.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(arj $$0, cnb $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bun $$0, int $$1) {
      $$0.dY().a(cdq.aJ, bak.a, (long)$$1);
   }
}
