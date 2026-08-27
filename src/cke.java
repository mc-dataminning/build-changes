import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cke extends bug<cka> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cke() {
      super(ImmutableMap.of(cbr.o, cbs.a, cbr.aY, cbs.b, cbr.aW, cbs.b, cbr.aX, cbs.b, cbr.aV, cbs.a, cbr.m, cbs.b, cbr.ba, cbs.b), h + 1 + i);
   }

   protected boolean a(aqt $$0, cka $$1) {
      return $$1.ar() != bsz.a ? false : $$1.dZ().c(cbr.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dZ().b(cbr.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aqt $$0, cka $$1, long $$2) {
      return $$1.dZ().a(cbr.o) && $$1.dZ().a(cbr.aV);
   }

   protected void b(aqt $$0, cka $$1, long $$2) {
      $$1.dZ().c(cbr.o).ifPresent($$1x -> $$1.b(bsz.q));
      $$1.dZ().a(cbr.aW, azo.a, (long)h);
      $$1.a(avo.cL, 1.0F, 1.0F);
   }

   protected void c(aqt $$0, cka $$1, long $$2) {
      if ($$1.ar() == bsz.q) {
         $$1.b(bsz.a);
      }

      $$1.dZ().a(cbr.aY, azo.a, (long)j);
      $$1.dZ().b(cbr.aV);
   }

   protected void d(aqt $$0, cka $$1, long $$2) {
      btp<cka> $$3 = $$1.dZ();
      bso $$4 = $$3.c(cbr.o).orElse(null);
      if ($$4 != null) {
         $$1.a(et.a.b, $$4.ds());
         if (!$$3.c(cbr.aW).isPresent() && !$$3.c(cbr.aX).isPresent()) {
            $$3.a(cbr.aX, azo.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dz() - $$1.dz();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dF() - $$1.dF();
               cnk $$8 = new cnk($$1, $$0);
               $$1.a(avo.cO, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.al().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cka $$0, bso $$1) {
      ewu $$2 = $$0.f(1.0F);
      ewu $$3 = $$1.ds().d($$0.ds()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cka $$0, bso $$1) {
      double $$2 = $$0.ds().g($$1.ds());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
