import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class ckq extends buu<ckm> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public ckq() {
      super(ImmutableMap.of(ccf.o, ccg.a, ccf.aY, ccg.b, ccf.aW, ccg.b, ccf.aX, ccg.b, ccf.aV, ccg.a, ccf.m, ccg.b, ccf.ba, ccg.b), h + 1 + i);
   }

   protected boolean a(aqm $$0, ckm $$1) {
      return $$1.as() != btn.a ? false : $$1.dU().c(ccf.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dU().b(ccf.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aqm $$0, ckm $$1, long $$2) {
      return $$1.dU().a(ccf.o) && $$1.dU().a(ccf.aV);
   }

   protected void b(aqm $$0, ckm $$1, long $$2) {
      $$1.dU().c(ccf.o).ifPresent($$1x -> $$1.b(btn.q));
      $$1.dU().a(ccf.aW, azk.a, (long)h);
      $$1.a(avh.cG, 1.0F, 1.0F);
   }

   protected void c(aqm $$0, ckm $$1, long $$2) {
      if ($$1.as() == btn.q) {
         $$1.b(btn.a);
      }

      $$1.dU().a(ccf.aY, azk.a, (long)j);
      $$1.dU().b(ccf.aV);
   }

   protected void d(aqm $$0, ckm $$1, long $$2) {
      bud<ckm> $$3 = $$1.dU();
      btb $$4 = $$3.c(ccf.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fc.a.b, $$4.do());
         if (!$$3.c(ccf.aW).isPresent() && !$$3.c(ccf.aX).isPresent()) {
            $$3.a(ccf.aX, azk.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dv() - $$1.dv();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dB() - $$1.dB();
               cnt $$8 = new cnt($$1, $$0);
               $$1.a(avh.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.al().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(ckm $$0, btb $$1) {
      ewf $$2 = $$0.g(1.0F);
      ewf $$3 = $$1.do().d($$0.do()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(ckm $$0, btb $$1) {
      double $$2 = $$0.do().g($$1.do());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
