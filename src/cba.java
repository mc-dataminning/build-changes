import com.google.common.collect.ImmutableMap;

public class cba extends bxa<cnz> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ayz.c(34.0);
   private static final int i = ayz.f(60.0F);

   public cba() {
      super(ImmutableMap.of(cel.o, cem.a, cel.aJ, cem.b, cel.aK, cem.c, cel.aL, cem.c), i);
   }

   protected boolean a(ard $$0, cnz $$1) {
      return $$1.a($$1.eb().c(cel.o).get(), 15.0, 20.0);
   }

   protected boolean a(ard $$0, cnz $$1, long $$2) {
      return true;
   }

   protected void b(ard $$0, cnz $$1, long $$2) {
      $$1.eb().a(cel.p, true, (long)i);
      $$1.eb().a(cel.aL, baf.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awa.CL, 3.0F, 1.0F);
   }

   protected void c(ard $$0, cnz $$1, long $$2) {
      $$1.eb().c(cel.o).ifPresent($$1x -> $$1.L().a($$1x.dt()));
      if (!$$1.eb().a(cel.aL) && !$$1.eb().a(cel.aK)) {
         $$1.eb().a(cel.aK, baf.a, (long)(i - h));
         $$1.eb().c(cel.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            fba $$3 = $$1.dt().e($$1.ds().b(bum.d, 0, $$1.dL()));
            fba $$4 = $$2x.bF().d($$3);
            fba $$5 = $$4.d();
            int $$6 = ayz.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               fba $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(lt.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awa.CK, 3.0F, 1.0F);
            if ($$2x.a($$0, $$0.ak().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bwp.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bwp.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(ard $$0, cnz $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bvh $$0, int $$1) {
      $$0.eb().a(cel.aJ, baf.a, (long)$$1);
   }
}
