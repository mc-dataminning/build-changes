import com.google.common.collect.ImmutableMap;

public class bpz extends bma<ccb> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = asy.c(34.0);
   private static final int i = asy.f(60.0F);

   public bpz() {
      super(ImmutableMap.of(btk.o, btl.a, btk.aI, btl.b, btk.aJ, btl.c, btk.aK, btl.c), i);
   }

   protected boolean a(alq $$0, ccb $$1) {
      return $$1.a($$1.dN().c(btk.o).get(), 15.0, 20.0);
   }

   protected boolean a(alq $$0, ccb $$1, long $$2) {
      return true;
   }

   protected void b(alq $$0, ccb $$1, long $$2) {
      $$1.dN().a(btk.p, true, (long)i);
      $$1.dN().a(btk.aK, atz.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(aqd.zO, 3.0F, 1.0F);
   }

   protected void c(alq $$0, ccb $$1, long $$2) {
      $$1.dN().c(btk.o).ifPresent($$1x -> $$1.G().a($$1x.dj()));
      if (!$$1.dN().a(btk.aK) && !$$1.dN().a(btk.aJ)) {
         $$1.dN().a(btk.aJ, atz.a, (long)(i - h));
         $$1.dN().c(btk.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            eif $$3 = $$1.dj().b(0.0, 1.6F, 0.0);
            eif $$4 = $$2x.bp().d($$3);
            eif $$5 = $$4.d();

            for (int $$6 = 1; $$6 < asy.a($$4.f()) + 7; $$6++) {
               eif $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(js.y, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(aqd.zN, 3.0F, 1.0F);
            $$2x.a($$0.ag().e($$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.b(blp.i));
            double $$9 = 2.5 * (1.0 - $$2x.b(blp.i));
            $$2x.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(alq $$0, ccb $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bkj $$0, int $$1) {
      $$0.dN().a(btk.aI, atz.a, (long)$$1);
   }
}
