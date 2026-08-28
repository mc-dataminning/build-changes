import com.google.common.collect.ImmutableMap;

public class bzg extends bvg<clz> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ayx.c(34.0);
   private static final int i = ayx.f(60.0F);

   public bzg() {
      super(ImmutableMap.of(ccr.o, ccs.a, ccr.aJ, ccs.b, ccr.aK, ccs.c, ccr.aL, ccs.c), i);
   }

   protected boolean a(are $$0, clz $$1) {
      return $$1.a($$1.dS().c(ccr.o).get(), 15.0, 20.0);
   }

   protected boolean a(are $$0, clz $$1, long $$2) {
      return true;
   }

   protected void b(are $$0, clz $$1, long $$2) {
      $$1.dS().a(ccr.p, true, (long)i);
      $$1.dS().a(ccr.aL, baa.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(avz.BT, 3.0F, 1.0F);
   }

   protected void c(are $$0, clz $$1, long $$2) {
      $$1.dS().c(ccr.o).ifPresent($$1x -> $$1.G().a($$1x.dn()));
      if (!$$1.dS().a(ccr.aL) && !$$1.dS().a(ccr.aK)) {
         $$1.dS().a(ccr.aK, baa.a, (long)(i - h));
         $$1.dS().c(ccr.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            evp $$3 = $$1.dn().e($$1.dm().b(bst.d, 0, $$1.dF()));
            evp $$4 = $$2x.bx().d($$3);
            evp $$5 = $$4.d();
            int $$6 = ayx.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               evp $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(li.B, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(avz.BS, 3.0F, 1.0F);
            if ($$2x.a($$0.aj().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.g(buv.n));
               double $$10 = 2.5 * (1.0 - $$2x.g(buv.n));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(are $$0, clz $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(btn $$0, int $$1) {
      $$0.dS().a(ccr.aJ, baa.a, (long)$$1);
   }
}
