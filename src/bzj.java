import com.google.common.collect.ImmutableMap;

public class bzj extends bvj<cmc> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ayz.c(34.0);
   private static final int i = ayz.f(60.0F);

   public bzj() {
      super(ImmutableMap.of(ccu.o, ccv.a, ccu.aJ, ccv.b, ccu.aK, ccv.c, ccu.aL, ccv.c), i);
   }

   protected boolean a(arf $$0, cmc $$1) {
      return $$1.a($$1.dS().c(ccu.o).get(), 15.0, 20.0);
   }

   protected boolean a(arf $$0, cmc $$1, long $$2) {
      return true;
   }

   protected void b(arf $$0, cmc $$1, long $$2) {
      $$1.dS().a(ccu.p, true, (long)i);
      $$1.dS().a(ccu.aL, bac.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awa.BT, 3.0F, 1.0F);
   }

   protected void c(arf $$0, cmc $$1, long $$2) {
      $$1.dS().c(ccu.o).ifPresent($$1x -> $$1.G().a($$1x.dn()));
      if (!$$1.dS().a(ccu.aL) && !$$1.dS().a(ccu.aK)) {
         $$1.dS().a(ccu.aK, bac.a, (long)(i - h));
         $$1.dS().c(ccu.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            evs $$3 = $$1.dn().e($$1.dm().b(bsw.d, 0, $$1.dF()));
            evs $$4 = $$2x.bx().d($$3);
            evs $$5 = $$4.d();
            int $$6 = ayz.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               evs $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(li.B, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awa.BS, 3.0F, 1.0F);
            if ($$2x.a($$0.aj().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.g(buy.n));
               double $$10 = 2.5 * (1.0 - $$2x.g(buy.n));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(arf $$0, cmc $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(btq $$0, int $$1) {
      $$0.dS().a(ccu.aJ, bac.a, (long)$$1);
   }
}
