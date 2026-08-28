import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cqb extends bzn<cpx> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cqb() {
      super(ImmutableMap.of(cgy.p, cgz.a, cgy.aZ, cgz.b, cgy.aX, cgz.b, cgy.aY, cgz.b, cgy.aW, cgz.a, cgy.n, cgz.b, cgy.bb, cgz.b), g + 1 + h);
   }

   protected boolean a(aru $$0, cpx $$1) {
      return $$1.at() != byi.a ? false : $$1.ec().c(cgy.p).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.ec().b(cgy.aW);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aru $$0, cpx $$1, long $$2) {
      return $$1.ec().a(cgy.p) && $$1.ec().a(cgy.aW);
   }

   protected void b(aru $$0, cpx $$1, long $$2) {
      $$1.ec().c(cgy.p).ifPresent($$1x -> $$1.b(byi.q));
      $$1.ec().a(cgy.aX, bay.a, (long)g);
      $$1.a(awr.cG, 1.0F, 1.0F);
   }

   protected void c(aru $$0, cpx $$1, long $$2) {
      if ($$1.at() == byi.q) {
         $$1.b(byi.a);
      }

      $$1.ec().a(cgy.aZ, bay.a, (long)i);
      $$1.ec().b(cgy.aW);
   }

   protected void d(aru $$0, cpx $$1, long $$2) {
      byw<cpx> $$3 = $$1.ec();
      bxw $$4 = $$3.c(cgy.p).orElse(null);
      if ($$4 != null) {
         $$1.a(ew.a.b, $$4.dt());
         if (!$$3.c(cgy.aX).isPresent() && !$$3.c(cgy.aY).isPresent()) {
            $$3.a(cgy.aY, bay.a, (long)h);
            double $$5 = $$4.dA() - $$1.dA();
            double $$6 = $$4.e($$4.bY() ? 0.8 : 0.3) - $$1.x();
            double $$7 = $$4.dG() - $$1.dG();
            csu.a(new ctm($$1, $$0), $$0, daa.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.an().a() * 4));
            $$1.a(awr.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cpx $$0, bxw $$1) {
      double $$2 = $$0.dt().g($$1.dt());
      return $$2 < 256.0;
   }
}
