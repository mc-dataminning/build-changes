import com.google.common.collect.ImmutableMap;

public class bzf extends bvf<clz> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ayn.c(34.0);
   private static final int i = ayn.f(60.0F);

   public bzf() {
      super(ImmutableMap.of(ccq.o, ccr.a, ccq.aJ, ccr.b, ccq.aK, ccr.c, ccq.aL, ccr.c), i);
   }

   protected boolean a(aqt $$0, clz $$1) {
      return $$1.a($$1.dU().c(ccq.o).get(), 15.0, 20.0);
   }

   protected boolean a(aqt $$0, clz $$1, long $$2) {
      return true;
   }

   protected void b(aqt $$0, clz $$1, long $$2) {
      $$1.dU().a(ccq.p, true, (long)i);
      $$1.dU().a(ccq.aL, azr.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(avo.BX, 3.0F, 1.0F);
   }

   protected void c(aqt $$0, clz $$1, long $$2) {
      $$1.dU().c(ccq.o).ifPresent($$1x -> $$1.F().a($$1x.do()));
      if (!$$1.dU().a(ccq.aL) && !$$1.dU().a(ccq.aK)) {
         $$1.dU().a(ccq.aK, azr.a, (long)(i - h));
         $$1.dU().c(ccq.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            eww $$3 = $$1.do().e($$1.dn().b(bsr.d, 0, $$1.dG()));
            eww $$4 = $$2x.by().d($$3);
            eww $$5 = $$4.d();
            int $$6 = ayn.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               eww $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(lm.B, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(avo.BW, 3.0F, 1.0F);
            if ($$2x.a($$0.aj().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.g(buu.p));
               double $$10 = 2.5 * (1.0 - $$2x.g(buu.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(aqt $$0, clz $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(btl $$0, int $$1) {
      $$0.dU().a(ccq.aJ, azr.a, (long)$$1);
   }
}
