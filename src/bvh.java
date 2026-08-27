import com.google.common.collect.ImmutableMap;

public class bvh extends brh<chy> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = aww.c(34.0);
   private static final int i = aww.f(60.0F);

   public bvh() {
      super(ImmutableMap.of(bys.o, byt.a, bys.aJ, byt.b, bys.aK, byt.c, bys.aL, byt.c), i);
   }

   protected boolean a(apf $$0, chy $$1) {
      return $$1.a($$1.dP().c(bys.o).get(), 15.0, 20.0);
   }

   protected boolean a(apf $$0, chy $$1, long $$2) {
      return true;
   }

   protected void b(apf $$0, chy $$1, long $$2) {
      $$1.dP().a(bys.p, true, (long)i);
      $$1.dP().a(bys.aL, axy.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(aty.Bx, 3.0F, 1.0F);
   }

   protected void c(apf $$0, chy $$1, long $$2) {
      $$1.dP().c(bys.o).ifPresent($$1x -> $$1.G().a($$1x.dk()));
      if (!$$1.dP().a(bys.aL) && !$$1.dP().a(bys.aK)) {
         $$1.dP().a(bys.aK, axy.a, (long)(i - h));
         $$1.dP().c(bys.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            ept $$3 = $$1.dk().e($$1.dj().b(boy.d, 0, $$1.dC()));
            ept $$4 = $$2x.bu().d($$3);
            ept $$5 = $$4.d();
            int $$6 = aww.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               ept $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(kc.B, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(aty.Bw, 3.0F, 1.0F);
            $$2x.a($$0.ah().e($$1), 10.0F);
            double $$9 = 0.5 * (1.0 - $$2x.g(bqw.n));
            double $$10 = 2.5 * (1.0 - $$2x.g(bqw.n));
            $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
         });
      }
   }

   protected void d(apf $$0, chy $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bpp $$0, int $$1) {
      $$0.dP().a(bys.aJ, axy.a, (long)$$1);
   }
}
