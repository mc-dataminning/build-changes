import com.google.common.collect.ImmutableMap;

public class cay extends bwy<cnx> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ayy.c(34.0);
   private static final int i = ayy.f(60.0F);

   public cay() {
      super(ImmutableMap.of(cej.o, cek.a, cej.aJ, cek.b, cej.aK, cek.c, cej.aL, cek.c), i);
   }

   protected boolean a(arc $$0, cnx $$1) {
      return $$1.a($$1.ec().c(cej.o).get(), 15.0, 20.0);
   }

   protected boolean a(arc $$0, cnx $$1, long $$2) {
      return true;
   }

   protected void b(arc $$0, cnx $$1, long $$2) {
      $$1.ec().a(cej.p, true, (long)i);
      $$1.ec().a(cej.aL, bae.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(avz.CL, 3.0F, 1.0F);
   }

   protected void c(arc $$0, cnx $$1, long $$2) {
      $$1.ec().c(cej.o).ifPresent($$1x -> $$1.H().a($$1x.du()));
      if (!$$1.ec().a(cej.aL) && !$$1.ec().a(cej.aK)) {
         $$1.ec().a(cej.aK, bae.a, (long)(i - h));
         $$1.ec().c(cej.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            fay $$3 = $$1.du().e($$1.dt().b(buk.d, 0, $$1.dM()));
            fay $$4 = $$2x.bF().d($$3);
            fay $$5 = $$4.d();
            int $$6 = ayy.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               fay $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(lt.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(avz.CK, 3.0F, 1.0F);
            if ($$2x.a($$0, $$0.ak().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bwn.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bwn.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(arc $$0, cnx $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bvf $$0, int $$1) {
      $$0.ec().a(cej.aJ, bae.a, (long)$$1);
   }
}
