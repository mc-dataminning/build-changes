import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cpe extends byv<cpa> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cpe() {
      super(ImmutableMap.of(cgg.p, cgh.a, cgg.aZ, cgh.b, cgg.aX, cgh.b, cgg.aY, cgh.b, cgg.aW, cgh.a, cgg.n, cgh.b, cgg.bb, cgh.b), g + 1 + h);
   }

   protected boolean a(arq $$0, cpa $$1) {
      return $$1.aw() != bxq.a ? false : $$1.ec().c(cgg.p).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.ec().b(cgg.aW);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arq $$0, cpa $$1, long $$2) {
      return $$1.ec().a(cgg.p) && $$1.ec().a(cgg.aW);
   }

   protected void b(arq $$0, cpa $$1, long $$2) {
      $$1.ec().c(cgg.p).ifPresent($$1x -> $$1.b(bxq.q));
      $$1.ec().a(cgg.aX, bau.a, (long)g);
      $$1.a(awn.cG, 1.0F, 1.0F);
   }

   protected void c(arq $$0, cpa $$1, long $$2) {
      if ($$1.aw() == bxq.q) {
         $$1.b(bxq.a);
      }

      $$1.ec().a(cgg.aZ, bau.a, (long)i);
      $$1.ec().b(cgg.aW);
   }

   protected void d(arq $$0, cpa $$1, long $$2) {
      bye<cpa> $$3 = $$1.ec();
      bxe $$4 = $$3.c(cgg.p).orElse(null);
      if ($$4 != null) {
         $$1.a(eu.a.b, $$4.dt());
         if (!$$3.c(cgg.aX).isPresent() && !$$3.c(cgg.aY).isPresent()) {
            $$3.a(cgg.aY, bau.a, (long)h);
            double $$5 = $$4.dA() - $$1.dA();
            double $$6 = $$4.e($$4.bZ() ? 0.8 : 0.3) - $$1.x();
            double $$7 = $$4.dG() - $$1.dG();
            crx.a(new csp($$1, $$0), $$0, czd.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.an().a() * 4));
            $$1.a(awn.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cpa $$0, bxe $$1) {
      double $$2 = $$0.dt().g($$1.dt());
      return $$2 < 256.0;
   }
}
