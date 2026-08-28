import com.google.common.collect.ImmutableMap;

public class ccq extends byq<cpv> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = azk.c(34.0);
   private static final int i = azk.f(60.0F);

   public ccq() {
      super(ImmutableMap.of(cgb.p, cgc.a, cgb.aK, cgc.b, cgb.aL, cgc.c, cgb.aM, cgc.c), i);
   }

   protected boolean a(aro $$0, cpv $$1) {
      return $$1.a($$1.eb().c(cgb.p).get(), 15.0, 20.0);
   }

   protected boolean a(aro $$0, cpv $$1, long $$2) {
      return true;
   }

   protected void b(aro $$0, cpv $$1, long $$2) {
      $$1.eb().a(cgb.q, true, (long)i);
      $$1.eb().a(cgb.aM, bas.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awl.CV, 3.0F, 1.0F);
   }

   protected void c(aro $$0, cpv $$1, long $$2) {
      $$1.eb().c(cgb.p).ifPresent($$1x -> $$1.J().a($$1x.dt()));
      if (!$$1.eb().a(cgb.aM) && !$$1.eb().a(cgb.aL)) {
         $$1.eb().a(cgb.aL, bas.a, (long)(i - h));
         $$1.eb().c(cgb.p).filter($$1::b).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            fdw $$3 = $$1.dt().e($$1.ds().b(bwb.d, 0, $$1.dL()));
            fdw $$4 = $$2x.bE().d($$3);
            fdw $$5 = $$4.d();
            int $$6 = azk.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               fdw $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(lx.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awl.CU, 3.0F, 1.0F);
            if ($$2x.a($$0, $$0.al().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(byf.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(byf.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(aro $$0, cpv $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bwz $$0, int $$1) {
      $$0.eb().a(cgb.aK, bas.a, (long)$$1);
   }
}
