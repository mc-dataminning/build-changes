import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cdo extends boc<cdl> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cdo() {
      super(ImmutableMap.of(bvn.o, bvo.a, bvn.aX, bvo.b, bvn.aV, bvo.b, bvn.aW, bvo.b, bvn.aU, bvo.a, bvn.m, bvo.b, bvn.aZ, bvo.b), h + 1 + i);
   }

   protected boolean a(and $$0, cdl $$1) {
      return $$1.ap() != bmx.a ? false : $$1.dO().c(bvn.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dO().b(bvn.aU);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(and $$0, cdl $$1, long $$2) {
      return $$1.dO().a(bvn.o) && $$1.dO().a(bvn.aU);
   }

   protected void b(and $$0, cdl $$1, long $$2) {
      $$1.dO().c(bvn.o).ifPresent($$1x -> $$1.b(bmx.q));
      $$1.dO().a(bvn.aV, avs.a, (long)h);
      $$1.a(ars.ck, 1.0F, 1.0F);
   }

   protected void c(and $$0, cdl $$1, long $$2) {
      if ($$1.ap() == bmx.q) {
         $$1.b(bmx.a);
      }

      $$1.dO().a(bvn.aX, avs.a, (long)j);
      $$1.dO().b(bvn.aU);
   }

   protected void d(and $$0, cdl $$1, long $$2) {
      bnl<cdl> $$3 = $$1.dO();
      bml $$4 = $$3.c(bvn.o).orElse(null);
      if ($$4 != null) {
         $$1.a(ee.a.b, $$4.dk());
         if (!$$3.c(bvn.aV).isPresent() && !$$3.c(bvn.aW).isPresent()) {
            $$3.a(bvn.aW, avs.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dr() - $$1.dr();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dx() - $$1.dx();
               cgn $$8 = new cgn(blz.bk, $$1, $$0);
               $$1.a(ars.cn, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.ak().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cdl $$0, bml $$1) {
      elt $$2 = $$0.f(1.0F);
      elt $$3 = $$1.dk().d($$0.dk()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cdl $$0, bml $$1) {
      double $$2 = $$0.dk().g($$1.dk());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
