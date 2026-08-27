import com.google.common.collect.ImmutableMap;

public class bwl extends bsl<cje> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = axm.c(34.0);
   private static final int i = axm.f(60.0F);

   public bwl() {
      super(ImmutableMap.of(bzw.o, bzx.a, bzw.aJ, bzx.b, bzw.aK, bzx.c, bzw.aL, bzx.c), i);
   }

   protected boolean a(apu $$0, cje $$1) {
      return $$1.a($$1.dP().c(bzw.o).get(), 15.0, 20.0);
   }

   protected boolean a(apu $$0, cje $$1, long $$2) {
      return true;
   }

   protected void b(apu $$0, cje $$1, long $$2) {
      $$1.dP().a(bzw.p, true, (long)i);
      $$1.dP().a(bzw.aL, ayo.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(auo.BA, 3.0F, 1.0F);
   }

   protected void c(apu $$0, cje $$1, long $$2) {
      $$1.dP().c(bzw.o).ifPresent($$1x -> $$1.G().a($$1x.dk()));
      if (!$$1.dP().a(bzw.aL) && !$$1.dP().a(bzw.aK)) {
         $$1.dP().a(bzw.aK, ayo.a, (long)(i - h));
         $$1.dP().c(bzw.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            esj $$3 = $$1.dk().e($$1.dj().b(bqb.d, 0, $$1.dC()));
            esj $$4 = $$2x.bu().d($$3);
            esj $$5 = $$4.d();
            int $$6 = axm.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               esj $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(kn.B, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(auo.Bz, 3.0F, 1.0F);
            $$2x.a($$0.ai().e($$1), 10.0F);
            double $$9 = 0.5 * (1.0 - $$2x.g(bsa.n));
            double $$10 = 2.5 * (1.0 - $$2x.g(bsa.n));
            $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
         });
      }
   }

   protected void d(apu $$0, cje $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bqt $$0, int $$1) {
      $$0.dP().a(bzw.aJ, ayo.a, (long)$$1);
   }
}
