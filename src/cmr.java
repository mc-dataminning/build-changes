import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cmr extends bwt<cmn> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cmr() {
      super(ImmutableMap.of(cee.o, cef.a, cee.aY, cef.b, cee.aW, cef.b, cee.aX, cef.b, cee.aV, cef.a, cee.m, cef.b, cee.ba, cef.b), g + 1 + h);
   }

   protected boolean a(arn $$0, cmn $$1) {
      return $$1.ay() != bvm.a ? false : $$1.ed().c(cee.o).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.ed().b(cee.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arn $$0, cmn $$1, long $$2) {
      return $$1.ed().a(cee.o) && $$1.ed().a(cee.aV);
   }

   protected void b(arn $$0, cmn $$1, long $$2) {
      $$1.ed().c(cee.o).ifPresent($$1x -> $$1.b(bvm.q));
      $$1.ed().a(cee.aW, bap.a, (long)g);
      $$1.a(awl.cG, 1.0F, 1.0F);
   }

   protected void c(arn $$0, cmn $$1, long $$2) {
      if ($$1.ay() == bvm.q) {
         $$1.b(bvm.a);
      }

      $$1.ed().a(cee.aY, bap.a, (long)i);
      $$1.ed().b(cee.aV);
   }

   protected void d(arn $$0, cmn $$1, long $$2) {
      bwc<cmn> $$3 = $$1.ed();
      bva $$4 = $$3.c(cee.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fi.a.b, $$4.dv());
         if (!$$3.c(cee.aW).isPresent() && !$$3.c(cee.aX).isPresent()) {
            $$3.a(cee.aX, bap.a, (long)h);
            double $$5 = $$4.dC() - $$1.dC();
            double $$6 = $$4.e($$4.ca() ? 0.8 : 0.3) - $$1.gw();
            double $$7 = $$4.dI() - $$1.dI();
            cpg.a(new cpx($$1, $$0), $$0, cwb.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.ak().a() * 4));
            $$1.a(awl.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cmn $$0, bva $$1) {
      double $$2 = $$0.dv().g($$1.dv());
      return $$2 < 256.0;
   }
}
