import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class ckn extends bur<ckj> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public ckn() {
      super(ImmutableMap.of(ccc.o, ccd.a, ccc.aY, ccd.b, ccc.aW, ccd.b, ccc.aX, ccd.b, ccc.aV, ccd.a, ccc.m, ccd.b, ccc.ba, ccd.b), h + 1 + i);
   }

   protected boolean a(aqk $$0, ckj $$1) {
      return $$1.ar() != btk.a ? false : $$1.dT().c(ccc.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dT().b(ccc.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aqk $$0, ckj $$1, long $$2) {
      return $$1.dT().a(ccc.o) && $$1.dT().a(ccc.aV);
   }

   protected void b(aqk $$0, ckj $$1, long $$2) {
      $$1.dT().c(ccc.o).ifPresent($$1x -> $$1.b(btk.q));
      $$1.dT().a(ccc.aW, azh.a, (long)h);
      $$1.a(avf.cG, 1.0F, 1.0F);
   }

   protected void c(aqk $$0, ckj $$1, long $$2) {
      if ($$1.ar() == btk.q) {
         $$1.b(btk.a);
      }

      $$1.dT().a(ccc.aY, azh.a, (long)j);
      $$1.dT().b(ccc.aV);
   }

   protected void d(aqk $$0, ckj $$1, long $$2) {
      bua<ckj> $$3 = $$1.dT();
      bsy $$4 = $$3.c(ccc.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fc.a.b, $$4.dn());
         if (!$$3.c(ccc.aW).isPresent() && !$$3.c(ccc.aX).isPresent()) {
            $$3.a(ccc.aX, azh.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.du() - $$1.du();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dA() - $$1.dA();
               cnq $$8 = new cnq($$1, $$0);
               $$1.a(avf.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.al().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(ckj $$0, bsy $$1) {
      evz $$2 = $$0.g(1.0F);
      evz $$3 = $$1.dn().d($$0.dn()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(ckj $$0, bsy $$1) {
      double $$2 = $$0.dn().g($$1.dn());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
