import com.google.common.collect.ImmutableMap;

public class brb extends bnc<cdd> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = atq.c(34.0);
   private static final int i = atq.f(60.0F);

   public brb() {
      super(ImmutableMap.of(bum.o, bun.a, bum.aI, bun.b, bum.aJ, bun.c, bum.aK, bun.c), i);
   }

   protected boolean a(ami $$0, cdd $$1) {
      return $$1.a($$1.dP().c(bum.o).get(), 15.0, 20.0);
   }

   protected boolean a(ami $$0, cdd $$1, long $$2) {
      return true;
   }

   protected void b(ami $$0, cdd $$1, long $$2) {
      $$1.dP().a(bum.p, true, (long)i);
      $$1.dP().a(bum.aK, aus.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(aqv.Ar, 3.0F, 1.0F);
   }

   protected void c(ami $$0, cdd $$1, long $$2) {
      $$1.dP().c(bum.o).ifPresent($$1x -> $$1.I().a($$1x.dl()));
      if (!$$1.dP().a(bum.aK) && !$$1.dP().a(bum.aJ)) {
         $$1.dP().a(bum.aJ, aus.a, (long)(i - h));
         $$1.dP().c(bum.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            ejz $$3 = $$1.dl().b(0.0, 1.6F, 0.0);
            ejz $$4 = $$2x.br().d($$3);
            ejz $$5 = $$4.d();

            for (int $$6 = 1; $$6 < atq.a($$4.f()) + 7; $$6++) {
               ejz $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(jw.y, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(aqv.Aq, 3.0F, 1.0F);
            $$2x.a($$0.ah().e($$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.b(bmr.i));
            double $$9 = 2.5 * (1.0 - $$2x.b(bmr.i));
            $$2x.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(ami $$0, cdd $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bll $$0, int $$1) {
      $$0.dP().a(bum.aI, aus.a, (long)$$1);
   }
}
