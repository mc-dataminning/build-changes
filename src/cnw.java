import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cnw extends bxy<cns> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cnw() {
      super(ImmutableMap.of(cfj.o, cfk.a, cfj.aY, cfk.b, cfj.aW, cfk.b, cfj.aX, cfk.b, cfj.aV, cfk.a, cfj.m, cfk.b, cfj.ba, cfk.b), g + 1 + h);
   }

   protected boolean a(ash $$0, cns $$1) {
      return $$1.aw() != bwr.a ? false : $$1.eb().c(cfj.o).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.eb().b(cfj.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(ash $$0, cns $$1, long $$2) {
      return $$1.eb().a(cfj.o) && $$1.eb().a(cfj.aV);
   }

   protected void b(ash $$0, cns $$1, long $$2) {
      $$1.eb().c(cfj.o).ifPresent($$1x -> $$1.b(bwr.q));
      $$1.eb().a(cfj.aW, bbk.a, (long)g);
      $$1.a(axf.cG, 1.0F, 1.0F);
   }

   protected void c(ash $$0, cns $$1, long $$2) {
      if ($$1.aw() == bwr.q) {
         $$1.b(bwr.a);
      }

      $$1.eb().a(cfj.aY, bbk.a, (long)i);
      $$1.eb().b(cfj.aV);
   }

   protected void d(ash $$0, cns $$1, long $$2) {
      bxh<cns> $$3 = $$1.eb();
      bwf $$4 = $$3.c(cfj.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fi.a.b, $$4.dt());
         if (!$$3.c(cfj.aW).isPresent() && !$$3.c(cfj.aX).isPresent()) {
            $$3.a(cfj.aX, bbk.a, (long)h);
            double $$5 = $$4.dA() - $$1.dA();
            double $$6 = $$4.e($$4.bZ() ? 0.8 : 0.3) - $$1.gn();
            double $$7 = $$4.dG() - $$1.dG();
            cqp.a(new crg($$1, $$0), $$0, cxo.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.al().a() * 4));
            $$1.a(axf.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cns $$0, bwf $$1) {
      double $$2 = $$0.dt().g($$1.dt());
      return $$2 < 256.0;
   }
}
