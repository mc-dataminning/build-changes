import com.google.common.collect.ImmutableMap;

public class bsb extends bob<cel> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = aun.c(34.0);
   private static final int i = aun.f(60.0F);

   public bsb() {
      super(ImmutableMap.of(bvm.o, bvn.a, bvm.aI, bvn.b, bvm.aJ, bvn.c, bvm.aK, bvn.c), i);
   }

   protected boolean a(and $$0, cel $$1) {
      return $$1.a($$1.dO().c(bvm.o).get(), 15.0, 20.0);
   }

   protected boolean a(and $$0, cel $$1, long $$2) {
      return true;
   }

   protected void b(and $$0, cel $$1, long $$2) {
      $$1.dO().a(bvm.p, true, (long)i);
      $$1.dO().a(bvm.aK, avr.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(arr.AM, 3.0F, 1.0F);
   }

   protected void c(and $$0, cel $$1, long $$2) {
      $$1.dO().c(bvm.o).ifPresent($$1x -> $$1.I().a($$1x.dk()));
      if (!$$1.dO().a(bvm.aK) && !$$1.dO().a(bvm.aJ)) {
         $$1.dO().a(bvm.aJ, avr.a, (long)(i - h));
         $$1.dO().c(bvm.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            els $$3 = $$1.dk().b(0.0, 1.6F, 0.0);
            els $$4 = $$2x.br().d($$3);
            els $$5 = $$4.d();

            for (int $$6 = 1; $$6 < aun.a($$4.f()) + 7; $$6++) {
               els $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(jx.A, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(arr.AL, 3.0F, 1.0F);
            $$2x.a($$0.ai().e($$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.b(bnq.i));
            double $$9 = 2.5 * (1.0 - $$2x.b(bnq.i));
            $$2x.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(and $$0, cel $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bmk $$0, int $$1) {
      $$0.dO().a(bvm.aI, avr.a, (long)$$1);
   }
}
