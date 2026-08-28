import com.google.common.collect.ImmutableMap;

public class cao extends bwo<cnk> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = azj.c(34.0);
   private static final int i = azj.f(60.0F);

   public cao() {
      super(ImmutableMap.of(cdz.o, cea.a, cdz.aJ, cea.b, cdz.aK, cea.c, cdz.aL, cea.c), i);
   }

   protected boolean a(arm $$0, cnk $$1) {
      return $$1.a($$1.ed().c(cdz.o).get(), 15.0, 20.0);
   }

   protected boolean a(arm $$0, cnk $$1, long $$2) {
      return true;
   }

   protected void b(arm $$0, cnk $$1, long $$2) {
      $$1.ed().a(cdz.p, true, (long)i);
      $$1.ed().a(cdz.aL, bao.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awk.Cb, 3.0F, 1.0F);
   }

   protected void c(arm $$0, cnk $$1, long $$2) {
      $$1.ed().c(cdz.o).ifPresent($$1x -> $$1.K().a($$1x.dv()));
      if (!$$1.ed().a(cdz.aL) && !$$1.ed().a(cdz.aK)) {
         $$1.ed().a(cdz.aK, bao.a, (long)(i - h));
         $$1.ed().c(cdz.o).filter($$1::c).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            ezh $$3 = $$1.dv().e($$1.du().b(bua.d, 0, $$1.dN()));
            ezh $$4 = $$2x.bG().d($$3);
            ezh $$5 = $$4.d();
            int $$6 = azj.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               ezh $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(lq.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awk.Ca, 3.0F, 1.0F);
            if ($$2x.a($$0.ak().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bwd.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bwd.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(arm $$0, cnk $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(buv $$0, int $$1) {
      $$0.ed().a(cdz.aJ, bao.a, (long)$$1);
   }
}
