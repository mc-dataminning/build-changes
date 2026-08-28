import com.google.common.collect.ImmutableMap;

public class cct extends byt<cqb> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = azm.c(34.0);
   private static final int i = azm.f(60.0F);

   public cct() {
      super(ImmutableMap.of(cge.p, cgf.a, cge.aK, cgf.b, cge.aL, cgf.c, cge.aM, cgf.c), i);
   }

   protected boolean a(arq $$0, cqb $$1) {
      return $$1.a($$1.eb().c(cge.p).get(), 15.0, 20.0);
   }

   protected boolean a(arq $$0, cqb $$1, long $$2) {
      return true;
   }

   protected void b(arq $$0, cqb $$1, long $$2) {
      $$1.eb().a(cge.q, true, (long)i);
      $$1.eb().a(cge.aM, bau.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awn.CY, 3.0F, 1.0F);
   }

   protected void c(arq $$0, cqb $$1, long $$2) {
      $$1.eb().c(cge.p).ifPresent($$1x -> $$1.J().a($$1x.dt()));
      if (!$$1.eb().a(cge.aM) && !$$1.eb().a(cge.aL)) {
         $$1.eb().a(cge.aL, bau.a, (long)(i - h));
         $$1.eb().c(cge.p).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            fei $$3 = $$1.dt().e($$1.ds().b(bwe.d, 0, $$1.dL()));
            fei $$4 = $$2x.bE().d($$3);
            fei $$5 = $$4.d();
            int $$6 = azm.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               fei $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(lx.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awn.CX, 3.0F, 1.0F);
            if ($$2x.a($$0, $$0.al().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(byi.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(byi.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(arq $$0, cqb $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bxc $$0, int $$1) {
      $$0.eb().a(cge.aK, bau.a, (long)$$1);
   }
}
