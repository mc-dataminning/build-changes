import com.google.common.collect.ImmutableMap;

public class bqo extends bmp<ccq> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ati.c(34.0);
   private static final int i = ati.f(60.0F);

   public bqo() {
      super(ImmutableMap.of(btz.o, bua.a, btz.aI, bua.b, btz.aJ, bua.c, btz.aK, bua.c), i);
   }

   protected boolean a(ama $$0, ccq $$1) {
      return $$1.a($$1.dN().c(btz.o).get(), 15.0, 20.0);
   }

   protected boolean a(ama $$0, ccq $$1, long $$2) {
      return true;
   }

   protected void b(ama $$0, ccq $$1, long $$2) {
      $$1.dN().a(btz.p, true, (long)i);
      $$1.dN().a(btz.aK, auj.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(aqn.zQ, 3.0F, 1.0F);
   }

   protected void c(ama $$0, ccq $$1, long $$2) {
      $$1.dN().c(btz.o).ifPresent($$1x -> $$1.G().a($$1x.dj()));
      if (!$$1.dN().a(btz.aK) && !$$1.dN().a(btz.aJ)) {
         $$1.dN().a(btz.aJ, auj.a, (long)(i - h));
         $$1.dN().c(btz.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            eji $$3 = $$1.dj().b(0.0, 1.6F, 0.0);
            eji $$4 = $$2x.bp().d($$3);
            eji $$5 = $$4.d();

            for (int $$6 = 1; $$6 < ati.a($$4.f()) + 7; $$6++) {
               eji $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(js.y, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(aqn.zP, 3.0F, 1.0F);
            $$2x.a($$0.ag().e($$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.b(bme.i));
            double $$9 = 2.5 * (1.0 - $$2x.b(bme.i));
            $$2x.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(ama $$0, ccq $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bky $$0, int $$1) {
      $$0.dN().a(btz.aI, auj.a, (long)$$1);
   }
}
