import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cns extends bxu<cno> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cns() {
      super(ImmutableMap.of(cff.o, cfg.a, cff.aY, cfg.b, cff.aW, cfg.b, cff.aX, cfg.b, cff.aV, cfg.a, cff.m, cfg.b, cff.ba, cfg.b), g + 1 + h);
   }

   protected boolean a(ash $$0, cno $$1) {
      return $$1.aw() != bwn.a ? false : $$1.eb().c(cff.o).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.eb().b(cff.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(ash $$0, cno $$1, long $$2) {
      return $$1.eb().a(cff.o) && $$1.eb().a(cff.aV);
   }

   protected void b(ash $$0, cno $$1, long $$2) {
      $$1.eb().c(cff.o).ifPresent($$1x -> $$1.b(bwn.q));
      $$1.eb().a(cff.aW, bbk.a, (long)g);
      $$1.a(axf.cG, 1.0F, 1.0F);
   }

   protected void c(ash $$0, cno $$1, long $$2) {
      if ($$1.aw() == bwn.q) {
         $$1.b(bwn.a);
      }

      $$1.eb().a(cff.aY, bbk.a, (long)i);
      $$1.eb().b(cff.aV);
   }

   protected void d(ash $$0, cno $$1, long $$2) {
      bxd<cno> $$3 = $$1.eb();
      bwb $$4 = $$3.c(cff.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fi.a.b, $$4.dt());
         if (!$$3.c(cff.aW).isPresent() && !$$3.c(cff.aX).isPresent()) {
            $$3.a(cff.aX, bbk.a, (long)h);
            double $$5 = $$4.dA() - $$1.dA();
            double $$6 = $$4.e($$4.bZ() ? 0.8 : 0.3) - $$1.gn();
            double $$7 = $$4.dG() - $$1.dG();
            cql.a(new crc($$1, $$0), $$0, cxk.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.al().a() * 4));
            $$1.a(axf.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cno $$0, bwb $$1) {
      double $$2 = $$0.dt().g($$1.dt());
      return $$2 < 256.0;
   }
}
