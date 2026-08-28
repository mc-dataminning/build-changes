import com.google.common.collect.ImmutableMap;

public class cby extends bxy<coz> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = bae.c(34.0);
   private static final int i = bae.f(60.0F);

   public cby() {
      super(ImmutableMap.of(cfj.o, cfk.a, cfj.aJ, cfk.b, cfj.aK, cfk.c, cfj.aL, cfk.c), i);
   }

   protected boolean a(ash $$0, coz $$1) {
      return $$1.a($$1.ec().c(cfj.o).get(), 15.0, 20.0);
   }

   protected boolean a(ash $$0, coz $$1, long $$2) {
      return true;
   }

   protected void b(ash $$0, coz $$1, long $$2) {
      $$1.ec().a(cfj.p, true, (long)i);
      $$1.ec().a(cfj.aL, bbk.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(axf.Cw, 3.0F, 1.0F);
   }

   protected void c(ash $$0, coz $$1, long $$2) {
      $$1.ec().c(cfj.o).ifPresent($$1x -> $$1.H().a($$1x.du()));
      if (!$$1.ec().a(cfj.aL) && !$$1.ec().a(cfj.aK)) {
         $$1.ec().a(cfj.aK, bbk.a, (long)(i - h));
         $$1.ec().c(cfj.o).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            fbx $$3 = $$1.du().e($$1.dt().b(bvk.d, 0, $$1.dM()));
            fbx $$4 = $$2x.bF().d($$3);
            fbx $$5 = $$4.d();
            int $$6 = bae.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               fbx $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(ls.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(axf.Cv, 3.0F, 1.0F);
            if ($$2x.a($$0, $$0.aj().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bxn.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bxn.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(ash $$0, coz $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bwf $$0, int $$1) {
      $$0.ec().a(cfj.aJ, bbk.a, (long)$$1);
   }
}
