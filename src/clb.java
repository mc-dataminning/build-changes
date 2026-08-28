import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class clb extends bvf<ckx> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public clb() {
      super(ImmutableMap.of(ccq.o, ccr.a, ccq.aY, ccr.b, ccq.aW, ccr.b, ccq.aX, ccr.b, ccq.aV, ccr.a, ccq.m, ccr.b, ccq.ba, ccr.b), h + 1 + i);
   }

   protected boolean a(aqt $$0, ckx $$1) {
      return $$1.at() != bty.a ? false : $$1.dU().c(ccq.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dU().b(ccq.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aqt $$0, ckx $$1, long $$2) {
      return $$1.dU().a(ccq.o) && $$1.dU().a(ccq.aV);
   }

   protected void b(aqt $$0, ckx $$1, long $$2) {
      $$1.dU().c(ccq.o).ifPresent($$1x -> $$1.b(bty.q));
      $$1.dU().a(ccq.aW, azr.a, (long)h);
      $$1.a(avo.cG, 1.0F, 1.0F);
   }

   protected void c(aqt $$0, ckx $$1, long $$2) {
      if ($$1.at() == bty.q) {
         $$1.b(bty.a);
      }

      $$1.dU().a(ccq.aY, azr.a, (long)j);
      $$1.dU().b(ccq.aV);
   }

   protected void d(aqt $$0, ckx $$1, long $$2) {
      buo<ckx> $$3 = $$1.dU();
      btl $$4 = $$3.c(ccq.o).orElse(null);
      if ($$4 != null) {
         $$1.a(ff.a.b, $$4.do());
         if (!$$3.c(ccq.aW).isPresent() && !$$3.c(ccq.aX).isPresent()) {
            $$3.a(ccq.aX, azr.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dv() - $$1.dv();
               double $$6 = $$4.e($$4.bS() ? 0.8 : 0.3) - $$1.e(0.5);
               double $$7 = $$4.dB() - $$1.dB();
               coe $$8 = new coe($$1, $$0);
               $$1.a(avo.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.al().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(ckx $$0, btl $$1) {
      eww $$2 = $$0.g(1.0F);
      eww $$3 = $$1.do().d($$0.do()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(ckx $$0, btl $$1) {
      double $$2 = $$0.do().g($$1.do());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
