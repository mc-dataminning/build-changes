import com.google.common.collect.ImmutableMap;

public class byr extends bur<cll> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = aye.c(34.0);
   private static final int i = aye.f(60.0F);

   public byr() {
      super(ImmutableMap.of(ccc.o, ccd.a, ccc.aJ, ccd.b, ccc.aK, ccd.c, ccc.aL, ccd.c), i);
   }

   protected boolean a(aqk $$0, cll $$1) {
      return $$1.a($$1.dT().c(ccc.o).get(), 15.0, 20.0);
   }

   protected boolean a(aqk $$0, cll $$1, long $$2) {
      return true;
   }

   protected void b(aqk $$0, cll $$1, long $$2) {
      $$1.dT().a(ccc.p, true, (long)i);
      $$1.dT().a(ccc.aL, azh.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(avf.BW, 3.0F, 1.0F);
   }

   protected void c(aqk $$0, cll $$1, long $$2) {
      $$1.dT().c(ccc.o).ifPresent($$1x -> $$1.G().a($$1x.dn()));
      if (!$$1.dT().a(ccc.aL) && !$$1.dT().a(ccc.aK)) {
         $$1.dT().a(ccc.aK, azh.a, (long)(i - h));
         $$1.dT().c(ccc.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            evz $$3 = $$1.dn().e($$1.dm().b(bse.d, 0, $$1.dF()));
            evz $$4 = $$2x.bx().d($$3);
            evz $$5 = $$4.d();
            int $$6 = aye.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               evz $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(lj.B, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(avf.BV, 3.0F, 1.0F);
            if ($$2x.a($$0.aj().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.g(bug.p));
               double $$10 = 2.5 * (1.0 - $$2x.g(bug.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(aqk $$0, cll $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bsy $$0, int $$1) {
      $$0.dT().a(ccc.aJ, azh.a, (long)$$1);
   }
}
