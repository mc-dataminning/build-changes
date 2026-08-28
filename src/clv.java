import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class clv extends bvx<clr> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public clv() {
      super(ImmutableMap.of(cdi.o, cdj.a, cdi.aY, cdj.b, cdi.aW, cdj.b, cdi.aX, cdj.b, cdi.aV, cdj.a, cdi.m, cdj.b, cdi.ba, cdj.b), g + 1 + h);
   }

   protected boolean a(arg $$0, clr $$1) {
      return $$1.av() != bur.a ? false : $$1.dX().c(cdi.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dX().b(cdi.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arg $$0, clr $$1, long $$2) {
      return $$1.dX().a(cdi.o) && $$1.dX().a(cdi.aV);
   }

   protected void b(arg $$0, clr $$1, long $$2) {
      $$1.dX().c(cdi.o).ifPresent($$1x -> $$1.b(bur.q));
      $$1.dX().a(cdi.aW, bah.a, (long)g);
      $$1.a(awd.cG, 1.0F, 1.0F);
   }

   protected void c(arg $$0, clr $$1, long $$2) {
      if ($$1.av() == bur.q) {
         $$1.b(bur.a);
      }

      $$1.dX().a(cdi.aY, bah.a, (long)i);
      $$1.dX().b(cdi.aV);
   }

   protected void d(arg $$0, clr $$1, long $$2) {
      bvg<clr> $$3 = $$1.dX();
      buf $$4 = $$3.c(cdi.o).orElse(null);
      if ($$4 != null) {
         $$1.a(ff.a.b, $$4.dq());
         if (!$$3.c(cdi.aW).isPresent() && !$$3.c(cdi.aX).isPresent()) {
            $$3.a(cdi.aX, bah.a, (long)h);
            if (a($$1, $$4)) {
               double $$5 = $$4.dx() - $$1.dx();
               double $$6 = $$4.e($$4.bW() ? 0.8 : 0.3) - $$1.e(0.5);
               double $$7 = $$4.dD() - $$1.dD();
               coi.a(new cpa($$1, $$0), $$0, cvl.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.am().a() * 4));
               $$1.a(awd.cJ, 1.5F, 1.0F);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(clr $$0, buf $$1) {
      eye $$2 = $$0.g(1.0F);
      eye $$3 = $$1.dq().d($$0.dq()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(clr $$0, buf $$1) {
      double $$2 = $$0.dq().g($$1.dq());
      return $$2 < 256.0;
   }
}
