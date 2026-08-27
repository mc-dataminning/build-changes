import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cdn extends bob<cdk> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cdn() {
      super(ImmutableMap.of(bvm.o, bvn.a, bvm.aX, bvn.b, bvm.aV, bvn.b, bvm.aW, bvn.b, bvm.aU, bvn.a, bvm.m, bvn.b, bvm.aZ, bvn.b), h + 1 + i);
   }

   protected boolean a(and $$0, cdk $$1) {
      return $$1.ap() != bmw.a ? false : $$1.dO().c(bvm.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dO().b(bvm.aU);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(and $$0, cdk $$1, long $$2) {
      return $$1.dO().a(bvm.o) && $$1.dO().a(bvm.aU);
   }

   protected void b(and $$0, cdk $$1, long $$2) {
      $$1.dO().c(bvm.o).ifPresent($$1x -> $$1.b(bmw.q));
      $$1.dO().a(bvm.aV, avr.a, (long)h);
      $$1.a(arr.ck, 1.0F, 1.0F);
   }

   protected void c(and $$0, cdk $$1, long $$2) {
      if ($$1.ap() == bmw.q) {
         $$1.b(bmw.a);
      }

      $$1.dO().a(bvm.aX, avr.a, (long)j);
      $$1.dO().b(bvm.aU);
   }

   protected void d(and $$0, cdk $$1, long $$2) {
      bnk<cdk> $$3 = $$1.dO();
      bmk $$4 = $$3.c(bvm.o).orElse(null);
      if ($$4 != null) {
         $$1.a(ee.a.b, $$4.dk());
         if (!$$3.c(bvm.aV).isPresent() && !$$3.c(bvm.aW).isPresent()) {
            $$3.a(bvm.aW, avr.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dr() - $$1.dr();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dx() - $$1.dx();
               cgm $$8 = new cgm(bly.bk, $$1, $$0);
               $$1.a(arr.cn, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.ak().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cdk $$0, bmk $$1) {
      els $$2 = $$0.f(1.0F);
      els $$3 = $$1.dk().d($$0.dk()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cdk $$0, bmk $$1) {
      double $$2 = $$0.dk().g($$1.dk());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
