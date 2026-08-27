import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cdw extends bof<cds> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cdw() {
      super(ImmutableMap.of(bvq.o, bvr.a, bvq.aY, bvr.b, bvq.aW, bvr.b, bvq.aX, bvr.b, bvq.aV, bvr.a, bvq.m, bvr.b, bvq.ba, bvr.b), h + 1 + i);
   }

   protected boolean a(ane $$0, cds $$1) {
      return $$1.ap() != bna.a ? false : $$1.dN().c(bvq.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dN().b(bvq.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(ane $$0, cds $$1, long $$2) {
      return $$1.dN().a(bvq.o) && $$1.dN().a(bvq.aV);
   }

   protected void b(ane $$0, cds $$1, long $$2) {
      $$1.dN().c(bvq.o).ifPresent($$1x -> $$1.b(bna.q));
      $$1.dN().a(bvq.aW, avt.a, (long)h);
      $$1.a(art.cy, 1.0F, 1.0F);
   }

   protected void c(ane $$0, cds $$1, long $$2) {
      if ($$1.ap() == bna.q) {
         $$1.b(bna.a);
      }

      $$1.dN().a(bvq.aY, avt.a, (long)j);
      $$1.dN().b(bvq.aV);
   }

   protected void d(ane $$0, cds $$1, long $$2) {
      bno<cds> $$3 = $$1.dN();
      bmo $$4 = $$3.c(bvq.o).orElse(null);
      if ($$4 != null) {
         $$1.a(ee.a.b, $$4.dj());
         if (!$$3.c(bvq.aW).isPresent() && !$$3.c(bvq.aX).isPresent()) {
            $$3.a(bvq.aX, avt.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dq() - $$1.dq();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dw() - $$1.dw();
               cgv $$8 = new cgv(bmc.bl, $$1, $$0);
               $$1.a(art.cB, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.ak().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cds $$0, bmo $$1) {
      emc $$2 = $$0.f(1.0F);
      emc $$3 = $$1.dj().d($$0.dj()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cds $$0, bmo $$1) {
      double $$2 = $$0.dj().g($$1.dj());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
