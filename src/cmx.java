import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cmx extends bwz<cmt> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cmx() {
      super(ImmutableMap.of(cek.o, cel.a, cek.aY, cel.b, cek.aW, cel.b, cek.aX, cel.b, cek.aV, cel.a, cek.m, cel.b, cek.ba, cel.b), g + 1 + h);
   }

   protected boolean a(arc $$0, cmt $$1) {
      return $$1.aw() != bvs.a ? false : $$1.ec().c(cek.o).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.ec().b(cek.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arc $$0, cmt $$1, long $$2) {
      return $$1.ec().a(cek.o) && $$1.ec().a(cek.aV);
   }

   protected void b(arc $$0, cmt $$1, long $$2) {
      $$1.ec().c(cek.o).ifPresent($$1x -> $$1.b(bvs.q));
      $$1.ec().a(cek.aW, baf.a, (long)g);
      $$1.a(awa.cG, 1.0F, 1.0F);
   }

   protected void c(arc $$0, cmt $$1, long $$2) {
      if ($$1.aw() == bvs.q) {
         $$1.b(bvs.a);
      }

      $$1.ec().a(cek.aY, baf.a, (long)i);
      $$1.ec().b(cek.aV);
   }

   protected void d(arc $$0, cmt $$1, long $$2) {
      bwi<cmt> $$3 = $$1.ec();
      bvg $$4 = $$3.c(cek.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fj.a.b, $$4.du());
         if (!$$3.c(cek.aW).isPresent() && !$$3.c(cek.aX).isPresent()) {
            $$3.a(cek.aX, baf.a, (long)h);
            double $$5 = $$4.dB() - $$1.dB();
            double $$6 = $$4.e($$4.bZ() ? 0.8 : 0.3) - $$1.gq();
            double $$7 = $$4.dH() - $$1.dH();
            cpq.a(new cqh($$1, $$0), $$0, cwp.j, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.am().a() * 4));
            $$1.a(awa.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cmt $$0, bvg $$1) {
      double $$2 = $$0.du().g($$1.du());
      return $$2 < 256.0;
   }
}
