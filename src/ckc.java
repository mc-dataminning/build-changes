import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class ckc extends buh<cjy> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public ckc() {
      super(ImmutableMap.of(cbs.o, cbt.a, cbs.aY, cbt.b, cbs.aW, cbt.b, cbs.aX, cbt.b, cbs.aV, cbt.a, cbs.m, cbt.b, cbs.ba, cbt.b), h + 1 + i);
   }

   protected boolean a(aqm $$0, cjy $$1) {
      return $$1.ar() != bta.a ? false : $$1.dS().c(cbs.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dS().b(cbs.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aqm $$0, cjy $$1, long $$2) {
      return $$1.dS().a(cbs.o) && $$1.dS().a(cbs.aV);
   }

   protected void b(aqm $$0, cjy $$1, long $$2) {
      $$1.dS().c(cbs.o).ifPresent($$1x -> $$1.b(bta.q));
      $$1.dS().a(cbs.aW, azf.a, (long)h);
      $$1.a(avh.cG, 1.0F, 1.0F);
   }

   protected void c(aqm $$0, cjy $$1, long $$2) {
      if ($$1.ar() == bta.q) {
         $$1.b(bta.a);
      }

      $$1.dS().a(cbs.aY, azf.a, (long)j);
      $$1.dS().b(cbs.aV);
   }

   protected void d(aqm $$0, cjy $$1, long $$2) {
      btq<cjy> $$3 = $$1.dS();
      bso $$4 = $$3.c(cbs.o).orElse(null);
      if ($$4 != null) {
         $$1.a(eq.a.b, $$4.dn());
         if (!$$3.c(cbs.aW).isPresent() && !$$3.c(cbs.aX).isPresent()) {
            $$3.a(cbs.aX, azf.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.du() - $$1.du();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dA() - $$1.dA();
               cnf $$8 = new cnf($$1, $$0);
               $$1.a(avh.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.ak().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cjy $$0, bso $$1) {
      euk $$2 = $$0.f(1.0F);
      euk $$3 = $$1.dn().d($$0.dn()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cjy $$0, bso $$1) {
      double $$2 = $$0.dn().g($$1.dn());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
