import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class ccy extends bnm<ccv> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public ccy() {
      super(ImmutableMap.of(bux.o, buy.a, bux.aX, buy.b, bux.aV, buy.b, bux.aW, buy.b, bux.aU, buy.a, bux.m, buy.b, bux.aZ, buy.b), h + 1 + i);
   }

   protected boolean a(amp $$0, ccv $$1) {
      return $$1.aC() && $$1.ap() == bmh.a ? $$1.dO().c(bux.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dO().b(bux.aU);
         }

         return $$1x;
      }).orElse(false) : false;
   }

   protected boolean a(amp $$0, ccv $$1, long $$2) {
      return $$1.dO().a(bux.o) && $$1.dO().a(bux.aU);
   }

   protected void b(amp $$0, ccv $$1, long $$2) {
      $$1.dO().c(bux.o).ifPresent($$1x -> $$1.b(bmh.q));
      $$1.dO().a(bux.aV, avc.a, (long)h);
      $$1.a(arc.ck, 1.0F, 1.0F);
   }

   protected void c(amp $$0, ccv $$1, long $$2) {
      if ($$1.ap() == bmh.q) {
         $$1.b(bmh.a);
      }

      $$1.dO().a(bux.aX, avc.a, (long)j);
      $$1.dO().b(bux.aU);
   }

   protected void d(amp $$0, ccv $$1, long $$2) {
      bmv<ccv> $$3 = $$1.dO();
      blv $$4 = $$3.c(bux.o).orElse(null);
      if ($$4 != null && $$1.aC()) {
         $$1.a(ed.a.b, $$4.dk());
         if (!$$3.c(bux.aV).isPresent() && !$$3.c(bux.aW).isPresent()) {
            $$3.a(bux.aW, avc.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dr() - $$1.dr();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dx() - $$1.dx();
               cfw $$8 = new cfw(blj.bk, $$1, $$0);
               $$1.a(arc.cn, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.aj().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(ccv $$0, blv $$1) {
      elb $$2 = $$0.f(1.0F);
      elb $$3 = $$1.dk().d($$0.dk()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(ccv $$0, blv $$1) {
      double $$2 = $$0.dk().g($$1.dk());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
