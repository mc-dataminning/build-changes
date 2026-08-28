import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cmv extends bwx<cmr> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cmv() {
      super(ImmutableMap.of(cei.o, cej.a, cei.aY, cej.b, cei.aW, cej.b, cei.aX, cej.b, cei.aV, cej.a, cei.m, cej.b, cei.ba, cej.b), g + 1 + h);
   }

   protected boolean a(arq $$0, cmr $$1) {
      return $$1.ay() != bvq.a ? false : $$1.ee().c(cei.o).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.ee().b(cei.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arq $$0, cmr $$1, long $$2) {
      return $$1.ee().a(cei.o) && $$1.ee().a(cei.aV);
   }

   protected void b(arq $$0, cmr $$1, long $$2) {
      $$1.ee().c(cei.o).ifPresent($$1x -> $$1.b(bvq.q));
      $$1.ee().a(cei.aW, bat.a, (long)g);
      $$1.a(awo.cG, 1.0F, 1.0F);
   }

   protected void c(arq $$0, cmr $$1, long $$2) {
      if ($$1.ay() == bvq.q) {
         $$1.b(bvq.a);
      }

      $$1.ee().a(cei.aY, bat.a, (long)i);
      $$1.ee().b(cei.aV);
   }

   protected void d(arq $$0, cmr $$1, long $$2) {
      bwg<cmr> $$3 = $$1.ee();
      bve $$4 = $$3.c(cei.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fi.a.b, $$4.dw());
         if (!$$3.c(cei.aW).isPresent() && !$$3.c(cei.aX).isPresent()) {
            $$3.a(cei.aX, bat.a, (long)h);
            double $$5 = $$4.dD() - $$1.dD();
            double $$6 = $$4.e($$4.cb() ? 0.8 : 0.3) - $$1.gx();
            double $$7 = $$4.dJ() - $$1.dJ();
            cpk.a(new cqb($$1, $$0), $$0, cwf.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.ak().a() * 4));
            $$1.a(awo.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cmr $$0, bve $$1) {
      double $$2 = $$0.dw().g($$1.dw());
      return $$2 < 256.0;
   }
}
