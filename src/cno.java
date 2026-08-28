import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cno extends bxq<cnk> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cno() {
      super(ImmutableMap.of(cfb.o, cfc.a, cfb.aY, cfc.b, cfb.aW, cfc.b, cfb.aX, cfc.b, cfb.aV, cfc.a, cfb.m, cfc.b, cfb.ba, cfc.b), g + 1 + h);
   }

   protected boolean a(arx $$0, cnk $$1) {
      return $$1.aw() != bwj.a ? false : $$1.ec().c(cfb.o).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.ec().b(cfb.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arx $$0, cnk $$1, long $$2) {
      return $$1.ec().a(cfb.o) && $$1.ec().a(cfb.aV);
   }

   protected void b(arx $$0, cnk $$1, long $$2) {
      $$1.ec().c(cfb.o).ifPresent($$1x -> $$1.b(bwj.q));
      $$1.ec().a(cfb.aW, bba.a, (long)g);
      $$1.a(awv.cG, 1.0F, 1.0F);
   }

   protected void c(arx $$0, cnk $$1, long $$2) {
      if ($$1.aw() == bwj.q) {
         $$1.b(bwj.a);
      }

      $$1.ec().a(cfb.aY, bba.a, (long)i);
      $$1.ec().b(cfb.aV);
   }

   protected void d(arx $$0, cnk $$1, long $$2) {
      bwz<cnk> $$3 = $$1.ec();
      bvx $$4 = $$3.c(cfb.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fi.a.b, $$4.du());
         if (!$$3.c(cfb.aW).isPresent() && !$$3.c(cfb.aX).isPresent()) {
            $$3.a(cfb.aX, bba.a, (long)h);
            double $$5 = $$4.dB() - $$1.dB();
            double $$6 = $$4.e($$4.bZ() ? 0.8 : 0.3) - $$1.gp();
            double $$7 = $$4.dH() - $$1.dH();
            cqh.a(new cqy($$1, $$0), $$0, cxg.j, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.am().a() * 4));
            $$1.a(awv.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cnk $$0, bvx $$1) {
      double $$2 = $$0.du().g($$1.du());
      return $$2 < 256.0;
   }
}
