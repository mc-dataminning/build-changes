import com.google.common.collect.ImmutableMap;

public class bsf extends bof<ceu> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = aup.c(34.0);
   private static final int i = aup.f(60.0F);

   public bsf() {
      super(ImmutableMap.of(bvq.o, bvr.a, bvq.aJ, bvr.b, bvq.aK, bvr.c, bvq.aL, bvr.c), i);
   }

   protected boolean a(ane $$0, ceu $$1) {
      return $$1.a($$1.dN().c(bvq.o).get(), 15.0, 20.0);
   }

   protected boolean a(ane $$0, ceu $$1, long $$2) {
      return true;
   }

   protected void b(ane $$0, ceu $$1, long $$2) {
      $$1.dN().a(bvq.p, true, (long)i);
      $$1.dN().a(bvq.aL, avt.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(art.Bb, 3.0F, 1.0F);
   }

   protected void c(ane $$0, ceu $$1, long $$2) {
      $$1.dN().c(bvq.o).ifPresent($$1x -> $$1.I().a($$1x.dj()));
      if (!$$1.dN().a(bvq.aL) && !$$1.dN().a(bvq.aK)) {
         $$1.dN().a(bvq.aK, avt.a, (long)(i - h));
         $$1.dN().c(bvq.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            emc $$3 = $$1.dj().b(0.0, 1.6F, 0.0);
            emc $$4 = $$2x.br().d($$3);
            emc $$5 = $$4.d();

            for (int $$6 = 1; $$6 < aup.a($$4.f()) + 7; $$6++) {
               emc $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(jx.A, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(art.Ba, 3.0F, 1.0F);
            $$2x.a($$0.ai().e($$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.g(bnu.k));
            double $$9 = 2.5 * (1.0 - $$2x.g(bnu.k));
            $$2x.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(ane $$0, ceu $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bmo $$0, int $$1) {
      $$0.dN().a(bvq.aJ, avt.a, (long)$$1);
   }
}
