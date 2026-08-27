import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cgg extends bqp<cgc> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cgg() {
      super(ImmutableMap.of(bya.o, byb.a, bya.aY, byb.b, bya.aW, byb.b, bya.aX, byb.b, bya.aV, byb.a, bya.m, byb.b, bya.ba, byb.b), h + 1 + i);
   }

   protected boolean a(apa $$0, cgc $$1) {
      return $$1.ap() != bpi.a ? false : $$1.dM().c(bya.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dM().b(bya.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(apa $$0, cgc $$1, long $$2) {
      return $$1.dM().a(bya.o) && $$1.dM().a(bya.aV);
   }

   protected void b(apa $$0, cgc $$1, long $$2) {
      $$1.dM().c(bya.o).ifPresent($$1x -> $$1.b(bpi.q));
      $$1.dM().a(bya.aW, axo.a, (long)h);
      $$1.a(atp.cz, 1.0F, 1.0F);
   }

   protected void c(apa $$0, cgc $$1, long $$2) {
      if ($$1.ap() == bpi.q) {
         $$1.b(bpi.a);
      }

      $$1.dM().a(bya.aY, axo.a, (long)j);
      $$1.dM().b(bya.aV);
   }

   protected void d(apa $$0, cgc $$1, long $$2) {
      bpy<cgc> $$3 = $$1.dM();
      box $$4 = $$3.c(bya.o).orElse(null);
      if ($$4 != null) {
         $$1.a(eg.a.b, $$4.dh());
         if (!$$3.c(bya.aW).isPresent() && !$$3.c(bya.aX).isPresent()) {
            $$3.a(bya.aX, axo.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.do() - $$1.do();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.du() - $$1.du();
               cjg $$8 = new cjg(bol.bl, $$1, $$0);
               $$1.a(atp.cC, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.aj().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cgc $$0, box $$1) {
      eov $$2 = $$0.f(1.0F);
      eov $$3 = $$1.dh().d($$0.dh()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cgc $$0, box $$1) {
      double $$2 = $$0.dh().g($$1.dh());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
