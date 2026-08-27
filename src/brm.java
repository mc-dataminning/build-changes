import com.google.common.collect.ImmutableMap;

public class brm extends bnm<cdv> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = aty.c(34.0);
   private static final int i = aty.f(60.0F);

   public brm() {
      super(ImmutableMap.of(bux.o, buy.a, bux.aI, buy.b, bux.aJ, buy.c, bux.aK, buy.c), i);
   }

   protected boolean a(amp $$0, cdv $$1) {
      return $$1.a($$1.dO().c(bux.o).get(), 15.0, 20.0);
   }

   protected boolean a(amp $$0, cdv $$1, long $$2) {
      return true;
   }

   protected void b(amp $$0, cdv $$1, long $$2) {
      $$1.dO().a(bux.p, true, (long)i);
      $$1.dO().a(bux.aK, avc.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(arc.AM, 3.0F, 1.0F);
   }

   protected void c(amp $$0, cdv $$1, long $$2) {
      $$1.dO().c(bux.o).ifPresent($$1x -> $$1.I().a($$1x.dk()));
      if (!$$1.dO().a(bux.aK) && !$$1.dO().a(bux.aJ)) {
         $$1.dO().a(bux.aJ, avc.a, (long)(i - h));
         $$1.dO().c(bux.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            elb $$3 = $$1.dk().b(0.0, 1.6F, 0.0);
            elb $$4 = $$2x.br().d($$3);
            elb $$5 = $$4.d();

            for (int $$6 = 1; $$6 < aty.a($$4.f()) + 7; $$6++) {
               elb $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(jv.A, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(arc.AL, 3.0F, 1.0F);
            $$2x.a($$0.ah().e($$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.b(bnb.i));
            double $$9 = 2.5 * (1.0 - $$2x.b(bnb.i));
            $$2x.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(amp $$0, cdv $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(blv $$0, int $$1) {
      $$0.dO().a(bux.aI, avc.a, (long)$$1);
   }
}
