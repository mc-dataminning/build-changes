import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cpz extends bzl<cpv> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cpz() {
      super(ImmutableMap.of(cgw.p, cgx.a, cgw.aZ, cgx.b, cgw.aX, cgx.b, cgw.aY, cgx.b, cgw.aW, cgx.a, cgw.n, cgx.b, cgw.bb, cgx.b), g + 1 + h);
   }

   protected boolean a(ars $$0, cpv $$1) {
      return $$1.at() != byg.a ? false : $$1.ec().c(cgw.p).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.ec().b(cgw.aW);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(ars $$0, cpv $$1, long $$2) {
      return $$1.ec().a(cgw.p) && $$1.ec().a(cgw.aW);
   }

   protected void b(ars $$0, cpv $$1, long $$2) {
      $$1.ec().c(cgw.p).ifPresent($$1x -> $$1.b(byg.q));
      $$1.ec().a(cgw.aX, baw.a, (long)g);
      $$1.a(awp.cG, 1.0F, 1.0F);
   }

   protected void c(ars $$0, cpv $$1, long $$2) {
      if ($$1.at() == byg.q) {
         $$1.b(byg.a);
      }

      $$1.ec().a(cgw.aZ, baw.a, (long)i);
      $$1.ec().b(cgw.aW);
   }

   protected void d(ars $$0, cpv $$1, long $$2) {
      byu<cpv> $$3 = $$1.ec();
      bxu $$4 = $$3.c(cgw.p).orElse(null);
      if ($$4 != null) {
         $$1.a(ev.a.b, $$4.dt());
         if (!$$3.c(cgw.aX).isPresent() && !$$3.c(cgw.aY).isPresent()) {
            $$3.a(cgw.aY, baw.a, (long)h);
            double $$5 = $$4.dA() - $$1.dA();
            double $$6 = $$4.e($$4.bY() ? 0.8 : 0.3) - $$1.x();
            double $$7 = $$4.dG() - $$1.dG();
            css.a(new ctk($$1, $$0), $$0, czy.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.an().a() * 4));
            $$1.a(awp.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cpv $$0, bxu $$1) {
      double $$2 = $$0.dt().g($$1.dt());
      return $$2 < 256.0;
   }
}
