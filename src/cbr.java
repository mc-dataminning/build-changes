import com.google.common.collect.ImmutableMap;

public class cbr extends bxr<cou> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ayz.c(34.0);
   private static final int i = ayz.f(60.0F);

   public cbr() {
      super(ImmutableMap.of(cfc.o, cfd.a, cfc.aJ, cfd.b, cfc.aK, cfd.c, cfc.aL, cfd.c), i);
   }

   protected boolean a(ard $$0, cou $$1) {
      return $$1.a($$1.ea().c(cfc.o).get(), 15.0, 20.0);
   }

   protected boolean a(ard $$0, cou $$1, long $$2) {
      return true;
   }

   protected void b(ard $$0, cou $$1, long $$2) {
      $$1.ea().a(cfc.p, true, (long)i);
      $$1.ea().a(cfc.aL, baf.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awa.CV, 3.0F, 1.0F);
   }

   protected void c(ard $$0, cou $$1, long $$2) {
      $$1.ea().c(cfc.o).ifPresent($$1x -> $$1.J().a($$1x.ds()));
      if (!$$1.ea().a(cfc.aL) && !$$1.ea().a(cfc.aK)) {
         $$1.ea().a(cfc.aK, baf.a, (long)(i - h));
         $$1.ea().c(cfc.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            fbx $$3 = $$1.ds().e($$1.dr().b(bvb.d, 0, $$1.dK()));
            fbx $$4 = $$2x.bD().d($$3);
            fbx $$5 = $$4.d();
            int $$6 = ayz.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               fbx $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(lt.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awa.CU, 3.0F, 1.0F);
            if ($$2x.a($$0, $$0.al().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bxg.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bxg.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(ard $$0, cou $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bvy $$0, int $$1) {
      $$0.ea().a(cfc.aJ, baf.a, (long)$$1);
   }
}
