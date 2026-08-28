import com.google.common.collect.ImmutableMap;

public class cat extends bwt<cnp> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = azk.c(34.0);
   private static final int i = azk.f(60.0F);

   public cat() {
      super(ImmutableMap.of(cee.o, cef.a, cee.aJ, cef.b, cee.aK, cef.c, cee.aL, cef.c), i);
   }

   protected boolean a(arn $$0, cnp $$1) {
      return $$1.a($$1.ed().c(cee.o).get(), 15.0, 20.0);
   }

   protected boolean a(arn $$0, cnp $$1, long $$2) {
      return true;
   }

   protected void b(arn $$0, cnp $$1, long $$2) {
      $$1.ed().a(cee.p, true, (long)i);
      $$1.ed().a(cee.aL, bap.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awl.Cb, 3.0F, 1.0F);
   }

   protected void c(arn $$0, cnp $$1, long $$2) {
      $$1.ed().c(cee.o).ifPresent($$1x -> $$1.K().a($$1x.dv()));
      if (!$$1.ed().a(cee.aL) && !$$1.ed().a(cee.aK)) {
         $$1.ed().a(cee.aK, bap.a, (long)(i - h));
         $$1.ed().c(cee.o).filter($$1::c).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            ezn $$3 = $$1.dv().e($$1.du().b(buf.d, 0, $$1.dN()));
            ezn $$4 = $$2x.bG().d($$3);
            ezn $$5 = $$4.d();
            int $$6 = azk.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               ezn $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(lr.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awl.Ca, 3.0F, 1.0F);
            if ($$2x.a($$0.ai().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bwi.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bwi.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(arn $$0, cnp $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bva $$0, int $$1) {
      $$0.ed().a(cee.aJ, bap.a, (long)$$1);
   }
}
