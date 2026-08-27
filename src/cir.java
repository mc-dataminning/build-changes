import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cir extends bsw<cin> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cir() {
      super(ImmutableMap.of(cah.o, cai.a, cah.aY, cai.b, cah.aW, cai.b, cah.aX, cai.b, cah.aV, cai.a, cah.m, cai.b, cah.ba, cai.b), h + 1 + i);
   }

   protected boolean a(aqe $$0, cin $$1) {
      return $$1.ap() != brp.a ? false : $$1.dQ().c(cah.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dQ().b(cah.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aqe $$0, cin $$1, long $$2) {
      return $$1.dQ().a(cah.o) && $$1.dQ().a(cah.aV);
   }

   protected void b(aqe $$0, cin $$1, long $$2) {
      $$1.dQ().c(cah.o).ifPresent($$1x -> $$1.b(brp.q));
      $$1.dQ().a(cah.aW, ayy.a, (long)h);
      $$1.a(auz.cG, 1.0F, 1.0F);
   }

   protected void c(aqe $$0, cin $$1, long $$2) {
      if ($$1.ap() == brp.q) {
         $$1.b(brp.a);
      }

      $$1.dQ().a(cah.aY, ayy.a, (long)j);
      $$1.dQ().b(cah.aV);
   }

   protected void d(aqe $$0, cin $$1, long $$2) {
      bsf<cin> $$3 = $$1.dQ();
      bre $$4 = $$3.c(cah.o).orElse(null);
      if ($$4 != null) {
         $$1.a(eo.a.b, $$4.dl());
         if (!$$3.c(cah.aW).isPresent() && !$$3.c(cah.aX).isPresent()) {
            $$3.a(cah.aX, ayy.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.ds() - $$1.ds();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dy() - $$1.dy();
               clu $$8 = new clu($$1, $$0);
               $$1.a(auz.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.ak().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cin $$0, bre $$1) {
      etf $$2 = $$0.f(1.0F);
      etf $$3 = $$1.dl().d($$0.dl()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cin $$0, bre $$1) {
      double $$2 = $$0.dl().g($$1.dl());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
