import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cma extends bwc<clw> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cma() {
      super(ImmutableMap.of(cdn.o, cdo.a, cdn.aY, cdo.b, cdn.aW, cdo.b, cdn.aX, cdo.b, cdn.aV, cdo.a, cdn.m, cdo.b, cdn.ba, cdo.b), g + 1 + h);
   }

   protected boolean a(arh $$0, clw $$1) {
      return $$1.av() != buw.a ? false : $$1.dX().c(cdn.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dX().b(cdn.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arh $$0, clw $$1, long $$2) {
      return $$1.dX().a(cdn.o) && $$1.dX().a(cdn.aV);
   }

   protected void b(arh $$0, clw $$1, long $$2) {
      $$1.dX().c(cdn.o).ifPresent($$1x -> $$1.b(buw.q));
      $$1.dX().a(cdn.aW, bai.a, (long)g);
      $$1.a(awe.cG, 1.0F, 1.0F);
   }

   protected void c(arh $$0, clw $$1, long $$2) {
      if ($$1.av() == buw.q) {
         $$1.b(buw.a);
      }

      $$1.dX().a(cdn.aY, bai.a, (long)i);
      $$1.dX().b(cdn.aV);
   }

   protected void d(arh $$0, clw $$1, long $$2) {
      bvl<clw> $$3 = $$1.dX();
      buk $$4 = $$3.c(cdn.o).orElse(null);
      if ($$4 != null) {
         $$1.a(ff.a.b, $$4.dq());
         if (!$$3.c(cdn.aW).isPresent() && !$$3.c(cdn.aX).isPresent()) {
            $$3.a(cdn.aX, bai.a, (long)h);
            if (a($$1, $$4)) {
               double $$5 = $$4.dx() - $$1.dx();
               double $$6 = $$4.e($$4.bW() ? 0.8 : 0.3) - $$1.gr();
               double $$7 = $$4.dD() - $$1.dD();
               coo.a(new cpf($$1, $$0), $$0, cvp.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.am().a() * 4));
               $$1.a(awe.cJ, 1.5F, 1.0F);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(clw $$0, buk $$1) {
      eys $$2 = $$0.g(1.0F);
      eys $$3 = $$1.dq().d($$0.dq()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(clw $$0, buk $$1) {
      double $$2 = $$0.dq().g($$1.dq());
      return $$2 < 256.0;
   }
}
