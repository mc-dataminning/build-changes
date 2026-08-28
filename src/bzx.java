import com.google.common.collect.ImmutableMap;

public class bzx extends bvx<cmt> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = azc.c(34.0);
   private static final int i = azc.f(60.0F);

   public bzx() {
      super(ImmutableMap.of(cdi.o, cdj.a, cdi.aJ, cdj.b, cdi.aK, cdj.c, cdi.aL, cdj.c), i);
   }

   protected boolean a(arg $$0, cmt $$1) {
      return $$1.a($$1.dX().c(cdi.o).get(), 15.0, 20.0);
   }

   protected boolean a(arg $$0, cmt $$1, long $$2) {
      return true;
   }

   protected void b(arg $$0, cmt $$1, long $$2) {
      $$1.dX().a(cdi.p, true, (long)i);
      $$1.dX().a(cdi.aL, bah.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awd.Cd, 3.0F, 1.0F);
   }

   protected void c(arg $$0, cmt $$1, long $$2) {
      $$1.dX().c(cdi.o).ifPresent($$1x -> $$1.K().a($$1x.dq()));
      if (!$$1.dX().a(cdi.aL) && !$$1.dX().a(cdi.aK)) {
         $$1.dX().a(cdi.aK, bah.a, (long)(i - h));
         $$1.dX().c(cdi.o).filter($$1::c).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            eye $$3 = $$1.dq().e($$1.dp().b(btk.d, 0, $$1.dI()));
            eye $$4 = $$2x.bC().d($$3);
            eye $$5 = $$4.d();
            int $$6 = azc.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               eye $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(ln.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awd.Cc, 3.0F, 1.0F);
            if ($$2x.a($$0.ak().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bvm.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bvm.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(arg $$0, cmt $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(buf $$0, int $$1) {
      $$0.dX().a(cdi.aJ, bah.a, (long)$$1);
   }
}
