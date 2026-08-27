import com.google.common.collect.ImmutableMap;

public class bon extends bko<cap> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = aro.c(34.0);
   private static final int i = aro.f(60.0F);

   public bon() {
      super(ImmutableMap.of(bry.o, brz.a, bry.aI, brz.b, bry.aJ, brz.c, bry.aK, brz.c), i);
   }

   protected boolean a(aki $$0, cap $$1) {
      return $$1.a($$1.dM().c(bry.o).get(), 15.0, 20.0);
   }

   protected boolean a(aki $$0, cap $$1, long $$2) {
      return true;
   }

   protected void b(aki $$0, cap $$1, long $$2) {
      $$1.dM().a(bry.p, true, (long)i);
      $$1.dM().a(bry.aK, asn.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(aou.zH, 3.0F, 1.0F);
   }

   protected void c(aki $$0, cap $$1, long $$2) {
      $$1.dM().c(bry.o).ifPresent($$1x -> $$1.D().a($$1x.di()));
      if (!$$1.dM().a(bry.aK) && !$$1.dM().a(bry.aJ)) {
         $$1.dM().a(bry.aJ, asn.a, (long)(i - h));
         $$1.dM().c(bry.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            ehf $$3 = $$1.di().b(0.0, 1.6F, 0.0);
            ehf $$4 = $$2x.bp().d($$3);
            ehf $$5 = $$4.d();

            for (int $$6 = 1; $$6 < aro.a($$4.f()) + 7; $$6++) {
               ehf $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(iw.y, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(aou.zG, 3.0F, 1.0F);
            $$2x.a($$0.ag().e($$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.b(bkd.c));
            double $$9 = 2.5 * (1.0 - $$2x.b(bkd.c));
            $$2x.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(aki $$0, cap $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(biw $$0, int $$1) {
      $$0.dM().a(bry.aI, asn.a, (long)$$1);
   }
}
