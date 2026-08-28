import com.google.common.collect.ImmutableMap;

public class cbq extends bxq<cor> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = azu.c(34.0);
   private static final int i = azu.f(60.0F);

   public cbq() {
      super(ImmutableMap.of(cfb.o, cfc.a, cfb.aJ, cfc.b, cfb.aK, cfc.c, cfb.aL, cfc.c), i);
   }

   protected boolean a(arx $$0, cor $$1) {
      return $$1.a($$1.ec().c(cfb.o).get(), 15.0, 20.0);
   }

   protected boolean a(arx $$0, cor $$1, long $$2) {
      return true;
   }

   protected void b(arx $$0, cor $$1, long $$2) {
      $$1.ec().a(cfb.p, true, (long)i);
      $$1.ec().a(cfb.aL, bba.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awv.CM, 3.0F, 1.0F);
   }

   protected void c(arx $$0, cor $$1, long $$2) {
      $$1.ec().c(cfb.o).ifPresent($$1x -> $$1.H().a($$1x.du()));
      if (!$$1.ec().a(cfb.aL) && !$$1.ec().a(cfb.aK)) {
         $$1.ec().a(cfb.aK, bba.a, (long)(i - h));
         $$1.ec().c(cfb.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            fbr $$3 = $$1.du().e($$1.dt().b(bvc.d, 0, $$1.dM()));
            fbr $$4 = $$2x.bF().d($$3);
            fbr $$5 = $$4.d();
            int $$6 = azu.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               fbr $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(ls.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awv.CL, 3.0F, 1.0F);
            if ($$2x.a($$0, $$0.ak().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bxf.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bxf.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(arx $$0, cor $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bvx $$0, int $$1) {
      $$0.ec().a(cfb.aJ, bba.a, (long)$$1);
   }
}
