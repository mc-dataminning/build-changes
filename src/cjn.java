import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cjn extends bts<cjj> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cjn() {
      super(ImmutableMap.of(cbd.o, cbe.a, cbd.aY, cbe.b, cbd.aW, cbe.b, cbd.aX, cbe.b, cbd.aV, cbe.a, cbd.m, cbe.b, cbd.ba, cbe.b), h + 1 + i);
   }

   protected boolean a(aqh $$0, cjj $$1) {
      return $$1.ap() != bsl.a ? false : $$1.dQ().c(cbd.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dQ().b(cbd.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aqh $$0, cjj $$1, long $$2) {
      return $$1.dQ().a(cbd.o) && $$1.dQ().a(cbd.aV);
   }

   protected void b(aqh $$0, cjj $$1, long $$2) {
      $$1.dQ().c(cbd.o).ifPresent($$1x -> $$1.b(bsl.q));
      $$1.dQ().a(cbd.aW, azb.a, (long)h);
      $$1.a(avc.cG, 1.0F, 1.0F);
   }

   protected void c(aqh $$0, cjj $$1, long $$2) {
      if ($$1.ap() == bsl.q) {
         $$1.b(bsl.a);
      }

      $$1.dQ().a(cbd.aY, azb.a, (long)j);
      $$1.dQ().b(cbd.aV);
   }

   protected void d(aqh $$0, cjj $$1, long $$2) {
      btb<cjj> $$3 = $$1.dQ();
      bsa $$4 = $$3.c(cbd.o).orElse(null);
      if ($$4 != null) {
         $$1.a(ep.a.b, $$4.dl());
         if (!$$3.c(cbd.aW).isPresent() && !$$3.c(cbd.aX).isPresent()) {
            $$3.a(cbd.aX, azb.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.ds() - $$1.ds();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dy() - $$1.dy();
               cmq $$8 = new cmq($$1, $$0);
               $$1.a(avc.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.ak().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cjj $$0, bsa $$1) {
      etp $$2 = $$0.f(1.0F);
      etp $$3 = $$1.dl().d($$0.dl()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cjj $$0, bsa $$1) {
      double $$2 = $$0.dl().g($$1.dl());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
