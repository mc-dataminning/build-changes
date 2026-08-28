import com.google.common.collect.ImmutableMap;

public class bzh extends bvh<cmb> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ayo.c(34.0);
   private static final int i = ayo.f(60.0F);

   public bzh() {
      super(ImmutableMap.of(ccs.o, cct.a, ccs.aJ, cct.b, ccs.aK, cct.c, ccs.aL, cct.c), i);
   }

   protected boolean a(aqu $$0, cmb $$1) {
      return $$1.a($$1.dT().c(ccs.o).get(), 15.0, 20.0);
   }

   protected boolean a(aqu $$0, cmb $$1, long $$2) {
      return true;
   }

   protected void b(aqu $$0, cmb $$1, long $$2) {
      $$1.dT().a(ccs.p, true, (long)i);
      $$1.dT().a(ccs.aL, azs.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(avp.BX, 3.0F, 1.0F);
   }

   protected void c(aqu $$0, cmb $$1, long $$2) {
      $$1.dT().c(ccs.o).ifPresent($$1x -> $$1.I().a($$1x.dm()));
      if (!$$1.dT().a(ccs.aL) && !$$1.dT().a(ccs.aK)) {
         $$1.dT().a(ccs.aK, azs.a, (long)(i - h));
         $$1.dT().c(ccs.o).filter($$1::c).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            exc $$3 = $$1.dm().e($$1.dl().b(bss.d, 0, $$1.dE()));
            exc $$4 = $$2x.by().d($$3);
            exc $$5 = $$4.d();
            int $$6 = ayo.a($$4.f()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               exc $$8 = $$3.e($$5.a((double)$$7));
               $$0.a(lm.B, $$8.c, $$8.d, $$8.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(avp.BW, 3.0F, 1.0F);
            if ($$2x.a($$0.aj().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.g(buw.p));
               double $$10 = 2.5 * (1.0 - $$2x.g(buw.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(aqu $$0, cmb $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(btn $$0, int $$1) {
      $$0.dT().a(ccs.aJ, azs.a, (long)$$1);
   }
}
