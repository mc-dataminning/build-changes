import com.google.common.collect.ImmutableMap;

public class bqw extends bmx<ccy> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = atm.c(34.0);
   private static final int i = atm.f(60.0F);

   public bqw() {
      super(ImmutableMap.of(buh.o, bui.a, buh.aI, bui.b, buh.aJ, bui.c, buh.aK, bui.c), i);
   }

   protected boolean a(ame $$0, ccy $$1) {
      return $$1.a($$1.dP().c(buh.o).get(), 15.0, 20.0);
   }

   protected boolean a(ame $$0, ccy $$1, long $$2) {
      return true;
   }

   protected void b(ame $$0, ccy $$1, long $$2) {
      $$1.dP().a(buh.p, true, (long)i);
      $$1.dP().a(buh.aK, auo.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(aqr.Ar, 3.0F, 1.0F);
   }

   protected void c(ame $$0, ccy $$1, long $$2) {
      $$1.dP().c(buh.o).ifPresent($$1x -> $$1.I().a($$1x.dl()));
      if (!$$1.dP().a(buh.aK) && !$$1.dP().a(buh.aJ)) {
         $$1.dP().a(buh.aJ, auo.a, (long)(i - h));
         $$1.dP().c(buh.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            eju $$3 = $$1.dl().b(0.0, 1.6F, 0.0);
            eju $$4 = $$2x.br().d($$3);
            eju $$5 = $$4.d();

            for (int $$6 = 1; $$6 < atm.a($$4.f()) + 7; $$6++) {
               eju $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(js.y, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(aqr.Aq, 3.0F, 1.0F);
            $$2x.a($$0.ah().e($$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.b(bmm.i));
            double $$9 = 2.5 * (1.0 - $$2x.b(bmm.i));
            $$2x.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(ame $$0, ccy $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(blg $$0, int $$1) {
      $$0.dP().a(buh.aI, auo.a, (long)$$1);
   }
}
