import com.google.common.collect.ImmutableMap;

public class brw extends bnw<cef> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = aui.c(34.0);
   private static final int i = aui.f(60.0F);

   public brw() {
      super(ImmutableMap.of(bvh.o, bvi.a, bvh.aI, bvi.b, bvh.aJ, bvi.c, bvh.aK, bvi.c), i);
   }

   protected boolean a(amz $$0, cef $$1) {
      return $$1.a($$1.dO().c(bvh.o).get(), 15.0, 20.0);
   }

   protected boolean a(amz $$0, cef $$1, long $$2) {
      return true;
   }

   protected void b(amz $$0, cef $$1, long $$2) {
      $$1.dO().a(bvh.p, true, (long)i);
      $$1.dO().a(bvh.aK, avm.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(arm.AM, 3.0F, 1.0F);
   }

   protected void c(amz $$0, cef $$1, long $$2) {
      $$1.dO().c(bvh.o).ifPresent($$1x -> $$1.I().a($$1x.dk()));
      if (!$$1.dO().a(bvh.aK) && !$$1.dO().a(bvh.aJ)) {
         $$1.dO().a(bvh.aJ, avm.a, (long)(i - h));
         $$1.dO().c(bvh.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            elm $$3 = $$1.dk().b(0.0, 1.6F, 0.0);
            elm $$4 = $$2x.br().d($$3);
            elm $$5 = $$4.d();

            for (int $$6 = 1; $$6 < aui.a($$4.f()) + 7; $$6++) {
               elm $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(jx.A, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(arm.AL, 3.0F, 1.0F);
            $$2x.a($$0.ai().e($$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.b(bnl.i));
            double $$9 = 2.5 * (1.0 - $$2x.b(bnl.i));
            $$2x.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(amz $$0, cef $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bmf $$0, int $$1) {
      $$0.dO().a(bvh.aI, avm.a, (long)$$1);
   }
}
