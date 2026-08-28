import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cmm extends bwo<cmi> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cmm() {
      super(ImmutableMap.of(cdz.o, cea.a, cdz.aY, cea.b, cdz.aW, cea.b, cdz.aX, cea.b, cdz.aV, cea.a, cdz.m, cea.b, cdz.ba, cea.b), g + 1 + h);
   }

   protected boolean a(arm $$0, cmi $$1) {
      return $$1.ax() != bvh.a ? false : $$1.ed().c(cdz.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.ed().b(cdz.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arm $$0, cmi $$1, long $$2) {
      return $$1.ed().a(cdz.o) && $$1.ed().a(cdz.aV);
   }

   protected void b(arm $$0, cmi $$1, long $$2) {
      $$1.ed().c(cdz.o).ifPresent($$1x -> $$1.b(bvh.q));
      $$1.ed().a(cdz.aW, bao.a, (long)g);
      $$1.a(awk.cG, 1.0F, 1.0F);
   }

   protected void c(arm $$0, cmi $$1, long $$2) {
      if ($$1.ax() == bvh.q) {
         $$1.b(bvh.a);
      }

      $$1.ed().a(cdz.aY, bao.a, (long)i);
      $$1.ed().b(cdz.aV);
   }

   protected void d(arm $$0, cmi $$1, long $$2) {
      bvx<cmi> $$3 = $$1.ed();
      buv $$4 = $$3.c(cdz.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fh.a.b, $$4.dv());
         if (!$$3.c(cdz.aW).isPresent() && !$$3.c(cdz.aX).isPresent()) {
            $$3.a(cdz.aX, bao.a, (long)h);
            if (a($$1, $$4)) {
               double $$5 = $$4.dC() - $$1.dC();
               double $$6 = $$4.e($$4.ca() ? 0.8 : 0.3) - $$1.gx();
               double $$7 = $$4.dI() - $$1.dI();
               cpb.a(new cps($$1, $$0), $$0, cvx.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.am().a() * 4));
               $$1.a(awk.cJ, 1.5F, 1.0F);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cmi $$0, buv $$1) {
      ezh $$2 = $$0.g(1.0F);
      ezh $$3 = $$1.dv().d($$0.dv()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cmi $$0, buv $$1) {
      double $$2 = $$0.dv().g($$1.dv());
      return $$2 < 256.0;
   }
}
