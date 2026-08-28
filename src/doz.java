import com.mojang.serialization.MapCodec;

public class doz extends dvy {
   public static final MapCodec<doz> a = b(doz::new);
   private static final ffr b = dmm.b(12.0, 0.0, 13.0);
   private static final int c = 150;
   private static final int d = 5;

   @Override
   public MapCodec<? extends doz> a() {
      return a;
   }

   protected doz(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return $$0.a(axc.cr);
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if ($$3.a(150) == 0) {
         eao $$4 = $$1.a_($$2.e());
         if (($$4.a(dmo.N) || $$4.a(axc.ai)) && $$3.a(5) != 0) {
            return;
         }

         eao $$5 = $$1.a_($$2.c(2));
         if ($$4.a(axc.cH) && $$5.a(axc.cH)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.gS, awo.i, 1.0F, 1.0F, false);
         }
      }
   }
}
