import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class coj extends byi<cof> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public coj() {
      super(ImmutableMap.of(cft.p, cfu.a, cft.aZ, cfu.b, cft.aX, cfu.b, cft.aY, cfu.b, cft.aW, cfu.a, cft.n, cfu.b, cft.bb, cfu.b), g + 1 + h);
   }

   protected boolean a(arn $$0, cof $$1) {
      return $$1.aw() != bxd.a ? false : $$1.eb().c(cft.p).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.eb().b(cft.aW);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arn $$0, cof $$1, long $$2) {
      return $$1.eb().a(cft.p) && $$1.eb().a(cft.aW);
   }

   protected void b(arn $$0, cof $$1, long $$2) {
      $$1.eb().c(cft.p).ifPresent($$1x -> $$1.b(bxd.q));
      $$1.eb().a(cft.aX, baq.a, (long)g);
      $$1.a(awk.cG, 1.0F, 1.0F);
   }

   protected void c(arn $$0, cof $$1, long $$2) {
      if ($$1.aw() == bxd.q) {
         $$1.b(bxd.a);
      }

      $$1.eb().a(cft.aZ, baq.a, (long)i);
      $$1.eb().b(cft.aW);
   }

   protected void d(arn $$0, cof $$1, long $$2) {
      bxr<cof> $$3 = $$1.eb();
      bwr $$4 = $$3.c(cft.p).orElse(null);
      if ($$4 != null) {
         $$1.a(fj.a.b, $$4.dt());
         if (!$$3.c(cft.aX).isPresent() && !$$3.c(cft.aY).isPresent()) {
            $$3.a(cft.aY, baq.a, (long)h);
            double $$5 = $$4.dA() - $$1.dA();
            double $$6 = $$4.e($$4.bZ() ? 0.8 : 0.3) - $$1.x();
            double $$7 = $$4.dG() - $$1.dG();
            crb.a(new crs($$1, $$0), $$0, cxy.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.an().a() * 4));
            $$1.a(awk.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cof $$0, bwr $$1) {
      double $$2 = $$0.dt().g($$1.dt());
      return $$2 < 256.0;
   }
}
