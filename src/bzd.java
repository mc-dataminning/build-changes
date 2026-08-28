import com.google.common.collect.ImmutableMap;

public class bzd extends bvd<clw> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ayu.c(34.0);
   private static final int i = ayu.f(60.0F);

   public bzd() {
      super(ImmutableMap.of(cco.o, ccp.a, cco.aJ, ccp.b, cco.aK, ccp.c, cco.aL, ccp.c), i);
   }

   protected boolean a(arb $$0, clw $$1) {
      return $$1.a($$1.dS().c(cco.o).get(), 15.0, 20.0);
   }

   protected boolean a(arb $$0, clw $$1, long $$2) {
      return true;
   }

   protected void b(arb $$0, clw $$1, long $$2) {
      $$1.dS().a(cco.p, true, (long)i);
      $$1.dS().a(cco.aL, azx.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(avw.BT, 3.0F, 1.0F);
   }

   protected void c(arb $$0, clw $$1, long $$2) {
      $$1.dS().c(cco.o).ifPresent($$1x -> $$1.G().a($$1x.dn()));
      if (!$$1.dS().a(cco.aL) && !$$1.dS().a(cco.aK)) {
         $$1.dS().a(cco.aK, azx.a, (long)(i - h));
         $$1.dS().c(cco.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            evm $$3 = $$1.dn().e($$1.dm().b(bsq.d, 0, $$1.dF()));
            evm $$4 = $$2x.bx().d($$3);
            evm $$5 = $$4.d();
            int $$6 = ayu.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               evm $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(lj.B, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(avw.BS, 3.0F, 1.0F);
            if ($$2x.a($$0.aj().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.g(bus.n));
               double $$10 = 2.5 * (1.0 - $$2x.g(bus.n));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(arb $$0, clw $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(btk $$0, int $$1) {
      $$0.dS().a(cco.aJ, azx.a, (long)$$1);
   }
}
