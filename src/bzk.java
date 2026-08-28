import com.google.common.collect.ImmutableMap;

public class bzk extends bvk<cmd> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ayz.c(34.0);
   private static final int i = ayz.f(60.0F);

   public bzk() {
      super(ImmutableMap.of(ccv.o, ccw.a, ccv.aJ, ccw.b, ccv.aK, ccw.c, ccv.aL, ccw.c), i);
   }

   protected boolean a(arf $$0, cmd $$1) {
      return $$1.a($$1.dS().c(ccv.o).get(), 15.0, 20.0);
   }

   protected boolean a(arf $$0, cmd $$1, long $$2) {
      return true;
   }

   protected void b(arf $$0, cmd $$1, long $$2) {
      $$1.dS().a(ccv.p, true, (long)i);
      $$1.dS().a(ccv.aL, bac.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awa.BT, 3.0F, 1.0F);
   }

   protected void c(arf $$0, cmd $$1, long $$2) {
      $$1.dS().c(ccv.o).ifPresent($$1x -> $$1.G().a($$1x.dn()));
      if (!$$1.dS().a(ccv.aL) && !$$1.dS().a(ccv.aK)) {
         $$1.dS().a(ccv.aK, bac.a, (long)(i - h));
         $$1.dS().c(ccv.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            evt $$3 = $$1.dn().e($$1.dm().b(bsx.d, 0, $$1.dF()));
            evt $$4 = $$2x.bx().d($$3);
            evt $$5 = $$4.d();
            int $$6 = ayz.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               evt $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(li.B, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awa.BS, 3.0F, 1.0F);
            if ($$2x.a($$0.aj().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.g(buz.n));
               double $$10 = 2.5 * (1.0 - $$2x.g(buz.n));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(arf $$0, cmd $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(btr $$0, int $$1) {
      $$0.dS().a(ccv.aJ, bac.a, (long)$$1);
   }
}
