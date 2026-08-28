import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class clc extends bvh<cky> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public clc() {
      super(ImmutableMap.of(ccs.o, cct.a, ccs.aY, cct.b, ccs.aW, cct.b, ccs.aX, cct.b, ccs.aV, cct.a, ccs.m, cct.b, ccs.ba, cct.b), h + 1 + i);
   }

   protected boolean a(are $$0, cky $$1) {
      return $$1.ar() != bua.a ? false : $$1.dS().c(ccs.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dS().b(ccs.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(are $$0, cky $$1, long $$2) {
      return $$1.dS().a(ccs.o) && $$1.dS().a(ccs.aV);
   }

   protected void b(are $$0, cky $$1, long $$2) {
      $$1.dS().c(ccs.o).ifPresent($$1x -> $$1.b(bua.q));
      $$1.dS().a(ccs.aW, bab.a, (long)h);
      $$1.a(avz.cG, 1.0F, 1.0F);
   }

   protected void c(are $$0, cky $$1, long $$2) {
      if ($$1.ar() == bua.q) {
         $$1.b(bua.a);
      }

      $$1.dS().a(ccs.aY, bab.a, (long)j);
      $$1.dS().b(ccs.aV);
   }

   protected void d(are $$0, cky $$1, long $$2) {
      buq<cky> $$3 = $$1.dS();
      bto $$4 = $$3.c(ccs.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fb.a.b, $$4.dn());
         if (!$$3.c(ccs.aW).isPresent() && !$$3.c(ccs.aX).isPresent()) {
            $$3.a(ccs.aX, bab.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.du() - $$1.du();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dA() - $$1.dA();
               cof $$8 = new cof($$1, $$0);
               $$1.a(avz.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.al().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cky $$0, bto $$1) {
      evq $$2 = $$0.f(1.0F);
      evq $$3 = $$1.dn().d($$0.dn()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cky $$0, bto $$1) {
      double $$2 = $$0.dn().g($$1.dn());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
