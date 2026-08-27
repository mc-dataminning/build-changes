import com.google.common.collect.ImmutableMap;

public class bua extends bqa<cgp> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = awi.c(34.0);
   private static final int i = awi.f(60.0F);

   public bua() {
      super(ImmutableMap.of(bxl.o, bxm.a, bxl.aJ, bxm.b, bxl.aK, bxm.c, bxl.aL, bxm.c), i);
   }

   protected boolean a(aow $$0, cgp $$1) {
      return $$1.a($$1.dO().c(bxl.o).get(), 15.0, 20.0);
   }

   protected boolean a(aow $$0, cgp $$1, long $$2) {
      return true;
   }

   protected void b(aow $$0, cgp $$1, long $$2) {
      $$1.dO().a(bxl.p, true, (long)i);
      $$1.dO().a(bxl.aL, axk.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(atl.Bc, 3.0F, 1.0F);
   }

   protected void c(aow $$0, cgp $$1, long $$2) {
      $$1.dO().c(bxl.o).ifPresent($$1x -> $$1.I().a($$1x.dk()));
      if (!$$1.dO().a(bxl.aL) && !$$1.dO().a(bxl.aK)) {
         $$1.dO().a(bxl.aK, axk.a, (long)(i - h));
         $$1.dO().c(bxl.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            enz $$3 = $$1.dk().e($$1.dj().b(bnr.d, 0, $$1.dC()));
            enz $$4 = $$2x.br().d($$3);
            enz $$5 = $$4.d();
            int $$6 = awi.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               enz $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(jz.A, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(atl.Bb, 3.0F, 1.0F);
            $$2x.a($$0.ah().e($$1), 10.0F);
            double $$9 = 0.5 * (1.0 - $$2x.g(bpp.k));
            double $$10 = 2.5 * (1.0 - $$2x.g(bpp.k));
            $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
         });
      }
   }

   protected void d(aow $$0, cgp $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(boi $$0, int $$1) {
      $$0.dO().a(bxl.aJ, axk.a, (long)$$1);
   }
}
