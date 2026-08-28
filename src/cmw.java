import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cmw extends bwy<cms> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cmw() {
      super(ImmutableMap.of(cej.o, cek.a, cej.aY, cek.b, cej.aW, cek.b, cej.aX, cek.b, cej.aV, cek.a, cej.m, cek.b, cej.ba, cek.b), g + 1 + h);
   }

   protected boolean a(arc $$0, cms $$1) {
      return $$1.aw() != bvr.a ? false : $$1.ec().c(cej.o).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.ec().b(cej.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arc $$0, cms $$1, long $$2) {
      return $$1.ec().a(cej.o) && $$1.ec().a(cej.aV);
   }

   protected void b(arc $$0, cms $$1, long $$2) {
      $$1.ec().c(cej.o).ifPresent($$1x -> $$1.b(bvr.q));
      $$1.ec().a(cej.aW, bae.a, (long)g);
      $$1.a(avz.cG, 1.0F, 1.0F);
   }

   protected void c(arc $$0, cms $$1, long $$2) {
      if ($$1.aw() == bvr.q) {
         $$1.b(bvr.a);
      }

      $$1.ec().a(cej.aY, bae.a, (long)i);
      $$1.ec().b(cej.aV);
   }

   protected void d(arc $$0, cms $$1, long $$2) {
      bwh<cms> $$3 = $$1.ec();
      bvf $$4 = $$3.c(cej.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fj.a.b, $$4.du());
         if (!$$3.c(cej.aW).isPresent() && !$$3.c(cej.aX).isPresent()) {
            $$3.a(cej.aX, bae.a, (long)h);
            double $$5 = $$4.dB() - $$1.dB();
            double $$6 = $$4.e($$4.bZ() ? 0.8 : 0.3) - $$1.gq();
            double $$7 = $$4.dH() - $$1.dH();
            cpo.a(new cqf($$1, $$0), $$0, cwn.j, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.am().a() * 4));
            $$1.a(avz.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cms $$0, bvf $$1) {
      double $$2 = $$0.du().g($$1.du());
      return $$2 < 256.0;
   }
}
