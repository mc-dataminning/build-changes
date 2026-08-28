import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class clf extends bvk<clb> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public clf() {
      super(ImmutableMap.of(ccv.o, ccw.a, ccv.aY, ccw.b, ccv.aW, ccw.b, ccv.aX, ccw.b, ccv.aV, ccw.a, ccv.m, ccw.b, ccv.ba, ccw.b), h + 1 + i);
   }

   protected boolean a(arf $$0, clb $$1) {
      return $$1.ar() != bud.a ? false : $$1.dS().c(ccv.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dS().b(ccv.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arf $$0, clb $$1, long $$2) {
      return $$1.dS().a(ccv.o) && $$1.dS().a(ccv.aV);
   }

   protected void b(arf $$0, clb $$1, long $$2) {
      $$1.dS().c(ccv.o).ifPresent($$1x -> $$1.b(bud.q));
      $$1.dS().a(ccv.aW, bac.a, (long)h);
      $$1.a(awa.cG, 1.0F, 1.0F);
   }

   protected void c(arf $$0, clb $$1, long $$2) {
      if ($$1.ar() == bud.q) {
         $$1.b(bud.a);
      }

      $$1.dS().a(ccv.aY, bac.a, (long)j);
      $$1.dS().b(ccv.aV);
   }

   protected void d(arf $$0, clb $$1, long $$2) {
      but<clb> $$3 = $$1.dS();
      btr $$4 = $$3.c(ccv.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fb.a.b, $$4.dn());
         if (!$$3.c(ccv.aW).isPresent() && !$$3.c(ccv.aX).isPresent()) {
            $$3.a(ccv.aX, bac.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.du() - $$1.du();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dA() - $$1.dA();
               coi $$8 = new coi($$1, $$0);
               $$1.a(awa.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.al().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(clb $$0, btr $$1) {
      evt $$2 = $$0.f(1.0F);
      evt $$3 = $$1.dn().d($$0.dn()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(clb $$0, btr $$1) {
      double $$2 = $$0.dn().g($$1.dn());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
