import com.google.common.collect.ImmutableMap;

public class boo extends bkp<caq> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = arp.c(34.0);
   private static final int i = arp.f(60.0F);

   public boo() {
      super(ImmutableMap.of(brz.o, bsa.a, brz.aI, bsa.b, brz.aJ, bsa.c, brz.aK, bsa.c), i);
   }

   protected boolean a(akk $$0, caq $$1) {
      return $$1.a($$1.dM().c(brz.o).get(), 15.0, 20.0);
   }

   protected boolean a(akk $$0, caq $$1, long $$2) {
      return true;
   }

   protected void b(akk $$0, caq $$1, long $$2) {
      $$1.dM().a(brz.p, true, (long)i);
      $$1.dM().a(brz.aK, asp.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(aow.zM, 3.0F, 1.0F);
   }

   protected void c(akk $$0, caq $$1, long $$2) {
      $$1.dM().c(brz.o).ifPresent($$1x -> $$1.D().a($$1x.di()));
      if (!$$1.dM().a(brz.aK) && !$$1.dM().a(brz.aJ)) {
         $$1.dM().a(brz.aJ, asp.a, (long)(i - h));
         $$1.dM().c(brz.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            ehd $$3 = $$1.di().b(0.0, 1.6F, 0.0);
            ehd $$4 = $$2x.bp().d($$3);
            ehd $$5 = $$4.d();

            for (int $$6 = 1; $$6 < arp.a($$4.f()) + 7; $$6++) {
               ehd $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(iv.y, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(aow.zL, 3.0F, 1.0F);
            $$2x.a($$0.ag().e($$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.b(bke.c));
            double $$9 = 2.5 * (1.0 - $$2x.b(bke.c));
            $$2x.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(akk $$0, caq $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(biy $$0, int $$1) {
      $$0.dM().a(brz.aI, asp.a, (long)$$1);
   }
}
