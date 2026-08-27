import com.google.common.collect.ImmutableMap;

public class bup extends bqp<che> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = awm.c(34.0);
   private static final int i = awm.f(60.0F);

   public bup() {
      super(ImmutableMap.of(bya.o, byb.a, bya.aJ, byb.b, bya.aK, byb.c, bya.aL, byb.c), i);
   }

   protected boolean a(apa $$0, che $$1) {
      return $$1.a($$1.dM().c(bya.o).get(), 15.0, 20.0);
   }

   protected boolean a(apa $$0, che $$1, long $$2) {
      return true;
   }

   protected void b(apa $$0, che $$1, long $$2) {
      $$1.dM().a(bya.p, true, (long)i);
      $$1.dM().a(bya.aL, axo.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(atp.Bp, 3.0F, 1.0F);
   }

   protected void c(apa $$0, che $$1, long $$2) {
      $$1.dM().c(bya.o).ifPresent($$1x -> $$1.I().a($$1x.dh()));
      if (!$$1.dM().a(bya.aL) && !$$1.dM().a(bya.aK)) {
         $$1.dM().a(bya.aK, axo.a, (long)(i - h));
         $$1.dM().c(bya.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            eov $$3 = $$1.dh().e($$1.dg().b(bog.d, 0, $$1.dz()));
            eov $$4 = $$2x.br().d($$3);
            eov $$5 = $$4.d();
            int $$6 = awm.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               eov $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(kb.A, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(atp.Bo, 3.0F, 1.0F);
            $$2x.a($$0.ah().e($$1), 10.0F);
            double $$9 = 0.5 * (1.0 - $$2x.g(bqe.k));
            double $$10 = 2.5 * (1.0 - $$2x.g(bqe.k));
            $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
         });
      }
   }

   protected void d(apa $$0, che $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(box $$0, int $$1) {
      $$0.dM().a(bya.aJ, axo.a, (long)$$1);
   }
}
