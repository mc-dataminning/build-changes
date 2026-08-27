import com.google.common.collect.ImmutableMap;

public class bor extends bks<cat> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ars.c(34.0);
   private static final int i = ars.f(60.0F);

   public bor() {
      super(ImmutableMap.of(bsc.o, bsd.a, bsc.aI, bsd.b, bsc.aJ, bsd.c, bsc.aK, bsd.c), i);
   }

   protected boolean a(akn $$0, cat $$1) {
      return $$1.a($$1.dM().c(bsc.o).get(), 15.0, 20.0);
   }

   protected boolean a(akn $$0, cat $$1, long $$2) {
      return true;
   }

   protected void b(akn $$0, cat $$1, long $$2) {
      $$1.dM().a(bsc.p, true, (long)i);
      $$1.dM().a(bsc.aK, ass.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(aoz.zM, 3.0F, 1.0F);
   }

   protected void c(akn $$0, cat $$1, long $$2) {
      $$1.dM().c(bsc.o).ifPresent($$1x -> $$1.D().a($$1x.di()));
      if (!$$1.dM().a(bsc.aK) && !$$1.dM().a(bsc.aJ)) {
         $$1.dM().a(bsc.aJ, ass.a, (long)(i - h));
         $$1.dM().c(bsc.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            ehi $$3 = $$1.di().b(0.0, 1.6F, 0.0);
            ehi $$4 = $$2x.bp().d($$3);
            ehi $$5 = $$4.d();

            for (int $$6 = 1; $$6 < ars.a($$4.f()) + 7; $$6++) {
               ehi $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(ix.y, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(aoz.zL, 3.0F, 1.0F);
            $$2x.a($$0.ag().e($$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.b(bkh.c));
            double $$9 = 2.5 * (1.0 - $$2x.b(bkh.c));
            $$2x.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(akn $$0, cat $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bjb $$0, int $$1) {
      $$0.dM().a(bsc.aI, ass.a, (long)$$1);
   }
}
