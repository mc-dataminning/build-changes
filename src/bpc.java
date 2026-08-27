import com.google.common.collect.ImmutableMap;

public class bpc extends bld<cbe> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = asb.c(34.0);
   private static final int i = asb.f(60.0F);

   public bpc() {
      super(ImmutableMap.of(bsn.o, bso.a, bsn.aI, bso.b, bsn.aJ, bso.c, bsn.aK, bso.c), i);
   }

   protected boolean a(akt $$0, cbe $$1) {
      return $$1.a($$1.dN().c(bsn.o).get(), 15.0, 20.0);
   }

   protected boolean a(akt $$0, cbe $$1, long $$2) {
      return true;
   }

   protected void b(akt $$0, cbe $$1, long $$2) {
      $$1.dN().a(bsn.p, true, (long)i);
      $$1.dN().a(bsn.aK, atc.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(apg.zM, 3.0F, 1.0F);
   }

   protected void c(akt $$0, cbe $$1, long $$2) {
      $$1.dN().c(bsn.o).ifPresent($$1x -> $$1.G().a($$1x.dj()));
      if (!$$1.dN().a(bsn.aK) && !$$1.dN().a(bsn.aJ)) {
         $$1.dN().a(bsn.aJ, atc.a, (long)(i - h));
         $$1.dN().c(bsn.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            ehh $$3 = $$1.dj().b(0.0, 1.6F, 0.0);
            ehh $$4 = $$2x.bp().d($$3);
            ehh $$5 = $$4.d();

            for (int $$6 = 1; $$6 < asb.a($$4.f()) + 7; $$6++) {
               ehh $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(iv.y, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(apg.zL, 3.0F, 1.0F);
            $$2x.a($$0.ag().e($$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.b(bks.i));
            double $$9 = 2.5 * (1.0 - $$2x.b(bks.i));
            $$2x.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(akt $$0, cbe $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bjm $$0, int $$1) {
      $$0.dN().a(bsn.aI, atc.a, (long)$$1);
   }
}
