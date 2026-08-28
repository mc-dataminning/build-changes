import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cmy extends bxa<cmu> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cmy() {
      super(ImmutableMap.of(cel.o, cem.a, cel.aY, cem.b, cel.aW, cem.b, cel.aX, cem.b, cel.aV, cem.a, cel.m, cem.b, cel.ba, cem.b), g + 1 + h);
   }

   protected boolean a(arp $$0, cmu $$1) {
      return $$1.aw() != bvt.a ? false : $$1.eb().c(cel.o).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.eb().b(cel.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arp $$0, cmu $$1, long $$2) {
      return $$1.eb().a(cel.o) && $$1.eb().a(cel.aV);
   }

   protected void b(arp $$0, cmu $$1, long $$2) {
      $$1.eb().c(cel.o).ifPresent($$1x -> $$1.b(bvt.q));
      $$1.eb().a(cel.aW, bas.a, (long)g);
      $$1.a(awn.cG, 1.0F, 1.0F);
   }

   protected void c(arp $$0, cmu $$1, long $$2) {
      if ($$1.aw() == bvt.q) {
         $$1.b(bvt.a);
      }

      $$1.eb().a(cel.aY, bas.a, (long)i);
      $$1.eb().b(cel.aV);
   }

   protected void d(arp $$0, cmu $$1, long $$2) {
      bwj<cmu> $$3 = $$1.eb();
      bvh $$4 = $$3.c(cel.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fi.a.b, $$4.dt());
         if (!$$3.c(cel.aW).isPresent() && !$$3.c(cel.aX).isPresent()) {
            $$3.a(cel.aX, bas.a, (long)h);
            double $$5 = $$4.dA() - $$1.dA();
            double $$6 = $$4.e($$4.bZ() ? 0.8 : 0.3) - $$1.go();
            double $$7 = $$4.dG() - $$1.dG();
            cpn.a(new cqe($$1, $$0), $$0, cwm.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.ak().a() * 4));
            $$1.a(awn.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cmu $$0, bvh $$1) {
      double $$2 = $$0.dt().g($$1.dt());
      return $$2 < 256.0;
   }
}
