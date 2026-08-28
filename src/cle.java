import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cle extends bvj<cla> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cle() {
      super(ImmutableMap.of(ccu.o, ccv.a, ccu.aY, ccv.b, ccu.aW, ccv.b, ccu.aX, ccv.b, ccu.aV, ccv.a, ccu.m, ccv.b, ccu.ba, ccv.b), h + 1 + i);
   }

   protected boolean a(arf $$0, cla $$1) {
      return $$1.ar() != buc.a ? false : $$1.dS().c(ccu.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dS().b(ccu.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arf $$0, cla $$1, long $$2) {
      return $$1.dS().a(ccu.o) && $$1.dS().a(ccu.aV);
   }

   protected void b(arf $$0, cla $$1, long $$2) {
      $$1.dS().c(ccu.o).ifPresent($$1x -> $$1.b(buc.q));
      $$1.dS().a(ccu.aW, bac.a, (long)h);
      $$1.a(awa.cG, 1.0F, 1.0F);
   }

   protected void c(arf $$0, cla $$1, long $$2) {
      if ($$1.ar() == buc.q) {
         $$1.b(buc.a);
      }

      $$1.dS().a(ccu.aY, bac.a, (long)j);
      $$1.dS().b(ccu.aV);
   }

   protected void d(arf $$0, cla $$1, long $$2) {
      bus<cla> $$3 = $$1.dS();
      btq $$4 = $$3.c(ccu.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fb.a.b, $$4.dn());
         if (!$$3.c(ccu.aW).isPresent() && !$$3.c(ccu.aX).isPresent()) {
            $$3.a(ccu.aX, bac.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.du() - $$1.du();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dA() - $$1.dA();
               coh $$8 = new coh($$1, $$0);
               $$1.a(awa.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.al().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cla $$0, btq $$1) {
      evs $$2 = $$0.f(1.0F);
      evs $$3 = $$1.dn().d($$0.dn()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cla $$0, btq $$1) {
      double $$2 = $$0.dn().g($$1.dn());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
