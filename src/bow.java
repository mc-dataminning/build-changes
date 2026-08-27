import com.google.common.collect.ImmutableMap;

public class bow extends bkx<cay> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = arx.c(34.0);
   private static final int i = arx.f(60.0F);

   public bow() {
      super(ImmutableMap.of(bsh.o, bsi.a, bsh.aI, bsi.b, bsh.aJ, bsi.c, bsh.aK, bsi.c), i);
   }

   protected boolean a(akr $$0, cay $$1) {
      return $$1.a($$1.dN().c(bsh.o).get(), 15.0, 20.0);
   }

   protected boolean a(akr $$0, cay $$1, long $$2) {
      return true;
   }

   protected void b(akr $$0, cay $$1, long $$2) {
      $$1.dN().a(bsh.p, true, (long)i);
      $$1.dN().a(bsh.aK, asx.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(ape.zM, 3.0F, 1.0F);
   }

   protected void c(akr $$0, cay $$1, long $$2) {
      $$1.dN().c(bsh.o).ifPresent($$1x -> $$1.G().a($$1x.dj()));
      if (!$$1.dN().a(bsh.aK) && !$$1.dN().a(bsh.aJ)) {
         $$1.dN().a(bsh.aJ, asx.a, (long)(i - h));
         $$1.dN().c(bsh.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            ehn $$3 = $$1.dj().b(0.0, 1.6F, 0.0);
            ehn $$4 = $$2x.bp().d($$3);
            ehn $$5 = $$4.d();

            for (int $$6 = 1; $$6 < arx.a($$4.f()) + 7; $$6++) {
               ehn $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(ix.y, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(ape.zL, 3.0F, 1.0F);
            $$2x.a($$0.ag().e($$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.b(bkm.c));
            double $$9 = 2.5 * (1.0 - $$2x.b(bkm.c));
            $$2x.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(akr $$0, cay $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bjg $$0, int $$1) {
      $$0.dN().a(bsh.aI, asx.a, (long)$$1);
   }
}
