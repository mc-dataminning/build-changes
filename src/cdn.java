import com.google.common.collect.ImmutableMap;

public class cdn extends bzn<crc> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = azq.c(34.0);
   private static final int i = azq.f(60.0F);

   public cdn() {
      super(ImmutableMap.of(cgy.p, cgz.a, cgy.aK, cgz.b, cgy.aL, cgz.c, cgy.aM, cgz.c), i);
   }

   protected boolean a(aru $$0, crc $$1) {
      return $$1.a($$1.ec().c(cgy.p).get(), 15.0, 20.0);
   }

   protected boolean a(aru $$0, crc $$1, long $$2) {
      return true;
   }

   protected void b(aru $$0, crc $$1, long $$2) {
      $$1.ec().a(cgy.q, true, (long)i);
      $$1.ec().a(cgy.aM, bay.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awr.Db, 3.0F, 1.0F);
   }

   protected void c(aru $$0, crc $$1, long $$2) {
      $$1.ec().c(cgy.p).ifPresent($$1x -> $$1.J().a($$1x.dt()));
      if (!$$1.ec().a(cgy.aM) && !$$1.ec().a(cgy.aL)) {
         $$1.ec().a(cgy.aL, bay.a, (long)(i - h));
         $$1.ec().c(cgy.p).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            ffs $$3 = $$1.dt().e($$1.ds().b(bww.d, 0, $$1.dL()));
            ffs $$4 = $$2x.bD().d($$3);
            ffs $$5 = $$4.d();
            int $$6 = azq.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               ffs $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(lz.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awr.Da, 3.0F, 1.0F);
            if ($$2x.a($$0, $$0.al().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bzc.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bzc.p));
               $$2x.i($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(aru $$0, crc $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bxw $$0, int $$1) {
      $$0.ec().a(cgy.aK, bay.a, (long)$$1);
   }
}
