import com.google.common.collect.ImmutableMap;

public class byu extends buu<clo> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ayg.c(34.0);
   private static final int i = ayg.f(60.0F);

   public byu() {
      super(ImmutableMap.of(ccf.o, ccg.a, ccf.aJ, ccg.b, ccf.aK, ccg.c, ccf.aL, ccg.c), i);
   }

   protected boolean a(aqm $$0, clo $$1) {
      return $$1.a($$1.dU().c(ccf.o).get(), 15.0, 20.0);
   }

   protected boolean a(aqm $$0, clo $$1, long $$2) {
      return true;
   }

   protected void b(aqm $$0, clo $$1, long $$2) {
      $$1.dU().a(ccf.p, true, (long)i);
      $$1.dU().a(ccf.aL, azk.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(avh.BW, 3.0F, 1.0F);
   }

   protected void c(aqm $$0, clo $$1, long $$2) {
      $$1.dU().c(ccf.o).ifPresent($$1x -> $$1.G().a($$1x.do()));
      if (!$$1.dU().a(ccf.aL) && !$$1.dU().a(ccf.aK)) {
         $$1.dU().a(ccf.aK, azk.a, (long)(i - h));
         $$1.dU().c(ccf.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            ewf $$3 = $$1.do().e($$1.dn().b(bsh.d, 0, $$1.dG()));
            ewf $$4 = $$2x.by().d($$3);
            ewf $$5 = $$4.d();
            int $$6 = ayg.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               ewf $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(lj.B, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(avh.BV, 3.0F, 1.0F);
            if ($$2x.a($$0.aj().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.g(buj.p));
               double $$10 = 2.5 * (1.0 - $$2x.g(buj.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(aqm $$0, clo $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(btb $$0, int $$1) {
      $$0.dU().a(ccf.aJ, azk.a, (long)$$1);
   }
}
