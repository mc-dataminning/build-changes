import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cpl extends bza<cph> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cpl() {
      super(ImmutableMap.of(cgl.p, cgm.a, cgl.aZ, cgm.b, cgl.aX, cgm.b, cgl.aY, cgm.b, cgl.aW, cgm.a, cgl.n, cgm.b, cgl.bb, cgm.b), g + 1 + h);
   }

   protected boolean a(arq $$0, cph $$1) {
      return $$1.at() != bxv.a ? false : $$1.eb().c(cgl.p).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.eb().b(cgl.aW);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arq $$0, cph $$1, long $$2) {
      return $$1.eb().a(cgl.p) && $$1.eb().a(cgl.aW);
   }

   protected void b(arq $$0, cph $$1, long $$2) {
      $$1.eb().c(cgl.p).ifPresent($$1x -> $$1.b(bxv.q));
      $$1.eb().a(cgl.aX, bau.a, (long)g);
      $$1.a(awn.cG, 1.0F, 1.0F);
   }

   protected void c(arq $$0, cph $$1, long $$2) {
      if ($$1.at() == bxv.q) {
         $$1.b(bxv.a);
      }

      $$1.eb().a(cgl.aZ, bau.a, (long)i);
      $$1.eb().b(cgl.aW);
   }

   protected void d(arq $$0, cph $$1, long $$2) {
      byj<cph> $$3 = $$1.eb();
      bxj $$4 = $$3.c(cgl.p).orElse(null);
      if ($$4 != null) {
         $$1.a(ev.a.b, $$4.ds());
         if (!$$3.c(cgl.aX).isPresent() && !$$3.c(cgl.aY).isPresent()) {
            $$3.a(cgl.aY, bau.a, (long)h);
            double $$5 = $$4.dz() - $$1.dz();
            double $$6 = $$4.e($$4.bX() ? 0.8 : 0.3) - $$1.x();
            double $$7 = $$4.dF() - $$1.dF();
            cse.a(new csw($$1, $$0), $$0, czk.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.an().a() * 4));
            $$1.a(awn.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cph $$0, bxj $$1) {
      double $$2 = $$0.ds().g($$1.ds());
      return $$2 < 256.0;
   }
}
