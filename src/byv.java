import com.google.common.collect.ImmutableMap;

public class byv extends buv<clp> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ayg.c(34.0);
   private static final int i = ayg.f(60.0F);

   public byv() {
      super(ImmutableMap.of(ccg.o, cch.a, ccg.aJ, cch.b, ccg.aK, cch.c, ccg.aL, cch.c), i);
   }

   protected boolean a(aqm $$0, clp $$1) {
      return $$1.a($$1.dV().c(ccg.o).get(), 15.0, 20.0);
   }

   protected boolean a(aqm $$0, clp $$1, long $$2) {
      return true;
   }

   protected void b(aqm $$0, clp $$1, long $$2) {
      $$1.dV().a(ccg.p, true, (long)i);
      $$1.dV().a(ccg.aL, azk.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(avh.BW, 3.0F, 1.0F);
   }

   protected void c(aqm $$0, clp $$1, long $$2) {
      $$1.dV().c(ccg.o).ifPresent($$1x -> $$1.F().a($$1x.dp()));
      if (!$$1.dV().a(ccg.aL) && !$$1.dV().a(ccg.aK)) {
         $$1.dV().a(ccg.aK, azk.a, (long)(i - h));
         $$1.dV().c(ccg.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            ewh $$3 = $$1.dp().e($$1.do().b(bsi.d, 0, $$1.dH()));
            ewh $$4 = $$2x.bz().d($$3);
            ewh $$5 = $$4.d();
            int $$6 = ayg.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               ewh $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(lj.B, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(avh.BV, 3.0F, 1.0F);
            if ($$2x.a($$0.aj().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.g(buk.p));
               double $$10 = 2.5 * (1.0 - $$2x.g(buk.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(aqm $$0, clp $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(btc $$0, int $$1) {
      $$0.dV().a(ccg.aJ, azk.a, (long)$$1);
   }
}
