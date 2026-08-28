import com.google.common.collect.ImmutableMap;

public class cax extends bwx<cnt> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = azn.c(34.0);
   private static final int i = azn.f(60.0F);

   public cax() {
      super(ImmutableMap.of(cei.o, cej.a, cei.aJ, cej.b, cei.aK, cej.c, cei.aL, cej.c), i);
   }

   protected boolean a(arq $$0, cnt $$1) {
      return $$1.a($$1.ee().c(cei.o).get(), 15.0, 20.0);
   }

   protected boolean a(arq $$0, cnt $$1, long $$2) {
      return true;
   }

   protected void b(arq $$0, cnt $$1, long $$2) {
      $$1.ee().a(cei.p, true, (long)i);
      $$1.ee().a(cei.aL, bat.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(awo.Cb, 3.0F, 1.0F);
   }

   protected void c(arq $$0, cnt $$1, long $$2) {
      $$1.ee().c(cei.o).ifPresent($$1x -> $$1.K().a($$1x.dw()));
      if (!$$1.ee().a(cei.aL) && !$$1.ee().a(cei.aK)) {
         $$1.ee().a(cei.aK, bat.a, (long)(i - h));
         $$1.ee().c(cei.o).filter($$1::c).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            ezr $$3 = $$1.dw().e($$1.dv().b(buj.d, 0, $$1.dO()));
            ezr $$4 = $$2x.bH().d($$3);
            ezr $$5 = $$4.d();
            int $$6 = azn.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               ezr $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(ls.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(awo.Ca, 3.0F, 1.0F);
            if ($$2x.a($$0.ai().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.h(bwm.p));
               double $$10 = 2.5 * (1.0 - $$2x.h(bwm.p));
               $$2x.j($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(arq $$0, cnt $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bve $$0, int $$1) {
      $$0.ee().a(cei.aJ, bat.a, (long)$$1);
   }
}
