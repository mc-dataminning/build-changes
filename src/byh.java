import com.google.common.collect.ImmutableMap;

public class byh extends buh<cla> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ayd.c(34.0);
   private static final int i = ayd.f(60.0F);

   public byh() {
      super(ImmutableMap.of(cbs.o, cbt.a, cbs.aJ, cbt.b, cbs.aK, cbt.c, cbs.aL, cbt.c), i);
   }

   protected boolean a(aqm $$0, cla $$1) {
      return $$1.a($$1.dS().c(cbs.o).get(), 15.0, 20.0);
   }

   protected boolean a(aqm $$0, cla $$1, long $$2) {
      return true;
   }

   protected void b(aqm $$0, cla $$1, long $$2) {
      $$1.dS().a(cbs.p, true, (long)i);
      $$1.dS().a(cbs.aL, azf.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(avh.BT, 3.0F, 1.0F);
   }

   protected void c(aqm $$0, cla $$1, long $$2) {
      $$1.dS().c(cbs.o).ifPresent($$1x -> $$1.G().a($$1x.dn()));
      if (!$$1.dS().a(cbs.aL) && !$$1.dS().a(cbs.aK)) {
         $$1.dS().a(cbs.aK, azf.a, (long)(i - h));
         $$1.dS().c(cbs.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            euk $$3 = $$1.dn().e($$1.dm().b(brv.d, 0, $$1.dF()));
            euk $$4 = $$2x.bx().d($$3);
            euk $$5 = $$4.d();
            int $$6 = ayd.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               euk $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(ky.B, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(avh.BS, 3.0F, 1.0F);
            $$2x.a($$0.ai().e($$1), 10.0F);
            double $$9 = 0.5 * (1.0 - $$2x.g(btw.n));
            double $$10 = 2.5 * (1.0 - $$2x.g(btw.n));
            $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
         });
      }
   }

   protected void d(aqm $$0, cla $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bso $$0, int $$1) {
      $$0.dS().a(cbs.aJ, azf.a, (long)$$1);
   }
}
