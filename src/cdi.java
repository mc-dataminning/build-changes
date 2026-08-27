import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cdi extends bnw<cdf> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cdi() {
      super(ImmutableMap.of(bvh.o, bvi.a, bvh.aX, bvi.b, bvh.aV, bvi.b, bvh.aW, bvi.b, bvh.aU, bvi.a, bvh.m, bvi.b, bvh.aZ, bvi.b), h + 1 + i);
   }

   protected boolean a(amz $$0, cdf $$1) {
      return $$1.aC() && $$1.ap() == bmr.a ? $$1.dO().c(bvh.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dO().b(bvh.aU);
         }

         return $$1x;
      }).orElse(false) : false;
   }

   protected boolean a(amz $$0, cdf $$1, long $$2) {
      return $$1.dO().a(bvh.o) && $$1.dO().a(bvh.aU);
   }

   protected void b(amz $$0, cdf $$1, long $$2) {
      $$1.dO().c(bvh.o).ifPresent($$1x -> $$1.b(bmr.q));
      $$1.dO().a(bvh.aV, avm.a, (long)h);
      $$1.a(arm.ck, 1.0F, 1.0F);
   }

   protected void c(amz $$0, cdf $$1, long $$2) {
      if ($$1.ap() == bmr.q) {
         $$1.b(bmr.a);
      }

      $$1.dO().a(bvh.aX, avm.a, (long)j);
      $$1.dO().b(bvh.aU);
   }

   protected void d(amz $$0, cdf $$1, long $$2) {
      bnf<cdf> $$3 = $$1.dO();
      bmf $$4 = $$3.c(bvh.o).orElse(null);
      if ($$4 != null && $$1.aC()) {
         $$1.a(ee.a.b, $$4.dk());
         if (!$$3.c(bvh.aV).isPresent() && !$$3.c(bvh.aW).isPresent()) {
            $$3.a(bvh.aW, avm.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dr() - $$1.dr();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dx() - $$1.dx();
               cgg $$8 = new cgg(blt.bk, $$1, $$0);
               $$1.a(arm.cn, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.ak().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cdf $$0, bmf $$1) {
      elm $$2 = $$0.f(1.0F);
      elm $$3 = $$1.dk().d($$0.dk()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cdf $$0, bmf $$1) {
      double $$2 = $$0.dk().g($$1.dk());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
