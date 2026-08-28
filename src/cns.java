import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cns extends bxr<cno> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cns() {
      super(ImmutableMap.of(cfc.o, cfd.a, cfc.aY, cfd.b, cfc.aW, cfd.b, cfc.aX, cfd.b, cfc.aV, cfd.a, cfc.m, cfd.b, cfc.ba, cfd.b), g + 1 + h);
   }

   protected boolean a(ard $$0, cno $$1) {
      return $$1.aw() != bwk.a ? false : $$1.ea().c(cfc.o).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.ea().b(cfc.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(ard $$0, cno $$1, long $$2) {
      return $$1.ea().a(cfc.o) && $$1.ea().a(cfc.aV);
   }

   protected void b(ard $$0, cno $$1, long $$2) {
      $$1.ea().c(cfc.o).ifPresent($$1x -> $$1.b(bwk.q));
      $$1.ea().a(cfc.aW, baf.a, (long)g);
      $$1.a(awa.cG, 1.0F, 1.0F);
   }

   protected void c(ard $$0, cno $$1, long $$2) {
      if ($$1.aw() == bwk.q) {
         $$1.b(bwk.a);
      }

      $$1.ea().a(cfc.aY, baf.a, (long)i);
      $$1.ea().b(cfc.aV);
   }

   protected void d(ard $$0, cno $$1, long $$2) {
      bxa<cno> $$3 = $$1.ea();
      bvy $$4 = $$3.c(cfc.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fj.a.b, $$4.ds());
         if (!$$3.c(cfc.aW).isPresent() && !$$3.c(cfc.aX).isPresent()) {
            $$3.a(cfc.aX, baf.a, (long)h);
            double $$5 = $$4.dz() - $$1.dz();
            double $$6 = $$4.e($$4.bY() ? 0.8 : 0.3) - $$1.x();
            double $$7 = $$4.dF() - $$1.dF();
            cqk.a(new crb($$1, $$0), $$0, cxh.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.an().a() * 4));
            $$1.a(awa.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cno $$0, bvy $$1) {
      double $$2 = $$0.ds().g($$1.ds());
      return $$2 < 256.0;
   }
}
