import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cpa extends byt<cow> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cpa() {
      super(ImmutableMap.of(cge.p, cgf.a, cge.aZ, cgf.b, cge.aX, cgf.b, cge.aY, cgf.b, cge.aW, cgf.a, cge.n, cgf.b, cge.bb, cgf.b), g + 1 + h);
   }

   protected boolean a(arq $$0, cow $$1) {
      return $$1.aw() != bxo.a ? false : $$1.eb().c(cge.p).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.eb().b(cge.aW);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arq $$0, cow $$1, long $$2) {
      return $$1.eb().a(cge.p) && $$1.eb().a(cge.aW);
   }

   protected void b(arq $$0, cow $$1, long $$2) {
      $$1.eb().c(cge.p).ifPresent($$1x -> $$1.b(bxo.q));
      $$1.eb().a(cge.aX, bau.a, (long)g);
      $$1.a(awn.cG, 1.0F, 1.0F);
   }

   protected void c(arq $$0, cow $$1, long $$2) {
      if ($$1.aw() == bxo.q) {
         $$1.b(bxo.a);
      }

      $$1.eb().a(cge.aZ, bau.a, (long)i);
      $$1.eb().b(cge.aW);
   }

   protected void d(arq $$0, cow $$1, long $$2) {
      byc<cow> $$3 = $$1.eb();
      bxc $$4 = $$3.c(cge.p).orElse(null);
      if ($$4 != null) {
         $$1.a(eu.a.b, $$4.dt());
         if (!$$3.c(cge.aX).isPresent() && !$$3.c(cge.aY).isPresent()) {
            $$3.a(cge.aY, bau.a, (long)h);
            double $$5 = $$4.dA() - $$1.dA();
            double $$6 = $$4.e($$4.bZ() ? 0.8 : 0.3) - $$1.x();
            double $$7 = $$4.dG() - $$1.dG();
            crs.a(new csk($$1, $$0), $$0, cyy.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.an().a() * 4));
            $$1.a(awn.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cow $$0, bxc $$1) {
      double $$2 = $$0.dt().g($$1.dt());
      return $$2 < 256.0;
   }
}
