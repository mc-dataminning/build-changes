import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cnx extends bxz<cnt> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cnx() {
      super(ImmutableMap.of(cfk.o, cfl.a, cfk.aY, cfl.b, cfk.aW, cfl.b, cfk.aX, cfl.b, cfk.aV, cfl.a, cfk.m, cfl.b, cfk.ba, cfl.b), g + 1 + h);
   }

   protected boolean a(ash $$0, cnt $$1) {
      return $$1.aw() != bws.a ? false : $$1.ec().c(cfk.o).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.ec().b(cfk.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(ash $$0, cnt $$1, long $$2) {
      return $$1.ec().a(cfk.o) && $$1.ec().a(cfk.aV);
   }

   protected void b(ash $$0, cnt $$1, long $$2) {
      $$1.ec().c(cfk.o).ifPresent($$1x -> $$1.b(bws.q));
      $$1.ec().a(cfk.aW, bbk.a, (long)g);
      $$1.a(axf.cG, 1.0F, 1.0F);
   }

   protected void c(ash $$0, cnt $$1, long $$2) {
      if ($$1.aw() == bws.q) {
         $$1.b(bws.a);
      }

      $$1.ec().a(cfk.aY, bbk.a, (long)i);
      $$1.ec().b(cfk.aV);
   }

   protected void d(ash $$0, cnt $$1, long $$2) {
      bxi<cnt> $$3 = $$1.ec();
      bwg $$4 = $$3.c(cfk.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fi.a.b, $$4.du());
         if (!$$3.c(cfk.aW).isPresent() && !$$3.c(cfk.aX).isPresent()) {
            $$3.a(cfk.aX, bbk.a, (long)h);
            double $$5 = $$4.dB() - $$1.dB();
            double $$6 = $$4.e($$4.bZ() ? 0.8 : 0.3) - $$1.gp();
            double $$7 = $$4.dH() - $$1.dH();
            cqq.a(new crh($$1, $$0), $$0, cxp.j, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.al().a() * 4));
            $$1.a(axf.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cnt $$0, bwg $$1) {
      double $$2 = $$0.du().g($$1.du());
      return $$2 < 256.0;
   }
}
