import com.google.common.collect.ImmutableMap;

public class bwg extends bsg<cix> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = axk.c(34.0);
   private static final int i = axk.f(60.0F);

   public bwg() {
      super(ImmutableMap.of(bzr.o, bzs.a, bzr.aJ, bzs.b, bzr.aK, bzs.c, bzr.aL, bzs.c), i);
   }

   protected boolean a(aps $$0, cix $$1) {
      return $$1.a($$1.dP().c(bzr.o).get(), 15.0, 20.0);
   }

   protected boolean a(aps $$0, cix $$1, long $$2) {
      return true;
   }

   protected void b(aps $$0, cix $$1, long $$2) {
      $$1.dP().a(bzr.p, true, (long)i);
      $$1.dP().a(bzr.aL, aym.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(aum.BA, 3.0F, 1.0F);
   }

   protected void c(aps $$0, cix $$1, long $$2) {
      $$1.dP().c(bzr.o).ifPresent($$1x -> $$1.G().a($$1x.dk()));
      if (!$$1.dP().a(bzr.aL) && !$$1.dP().a(bzr.aK)) {
         $$1.dP().a(bzr.aK, aym.a, (long)(i - h));
         $$1.dP().c(bzr.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            esa $$3 = $$1.dk().e($$1.dj().b(bpw.d, 0, $$1.dC()));
            esa $$4 = $$2x.bu().d($$3);
            esa $$5 = $$4.d();
            int $$6 = axk.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               esa $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(kl.B, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(aum.Bz, 3.0F, 1.0F);
            $$2x.a($$0.ai().e($$1), 10.0F);
            double $$9 = 0.5 * (1.0 - $$2x.g(brv.n));
            double $$10 = 2.5 * (1.0 - $$2x.g(brv.n));
            $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
         });
      }
   }

   protected void d(aps $$0, cix $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bqo $$0, int $$1) {
      $$0.dP().a(bzr.aJ, aym.a, (long)$$1);
   }
}
