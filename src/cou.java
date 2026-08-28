import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cou extends byq<coq> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cou() {
      super(ImmutableMap.of(cgb.p, cgc.a, cgb.aZ, cgc.b, cgb.aX, cgc.b, cgb.aY, cgc.b, cgb.aW, cgc.a, cgb.n, cgc.b, cgb.bb, cgc.b), g + 1 + h);
   }

   protected boolean a(aro $$0, coq $$1) {
      return $$1.aw() != bxl.a ? false : $$1.eb().c(cgb.p).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.eb().b(cgb.aW);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aro $$0, coq $$1, long $$2) {
      return $$1.eb().a(cgb.p) && $$1.eb().a(cgb.aW);
   }

   protected void b(aro $$0, coq $$1, long $$2) {
      $$1.eb().c(cgb.p).ifPresent($$1x -> $$1.b(bxl.q));
      $$1.eb().a(cgb.aX, bas.a, (long)g);
      $$1.a(awl.cG, 1.0F, 1.0F);
   }

   protected void c(aro $$0, coq $$1, long $$2) {
      if ($$1.aw() == bxl.q) {
         $$1.b(bxl.a);
      }

      $$1.eb().a(cgb.aZ, bas.a, (long)i);
      $$1.eb().b(cgb.aW);
   }

   protected void d(aro $$0, coq $$1, long $$2) {
      bxz<coq> $$3 = $$1.eb();
      bwz $$4 = $$3.c(cgb.p).orElse(null);
      if ($$4 != null) {
         $$1.a(eu.a.b, $$4.dt());
         if (!$$3.c(cgb.aX).isPresent() && !$$3.c(cgb.aY).isPresent()) {
            $$3.a(cgb.aY, bas.a, (long)h);
            double $$5 = $$4.dA() - $$1.dA();
            double $$6 = $$4.e($$4.bZ() ? 0.8 : 0.3) - $$1.x();
            double $$7 = $$4.dG() - $$1.dG();
            crm.a(new cse($$1, $$0), $$0, cys.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.an().a() * 4));
            $$1.a(awl.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(coq $$0, bwz $$1) {
      double $$2 = $$0.dt().g($$1.dt());
      return $$2 < 256.0;
   }
}
