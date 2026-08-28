import com.mojang.serialization.MapCodec;

public class dpe extends dwd {
   public static final MapCodec<dpe> a = b(dpe::new);
   private static final ffw b = dmr.b(12.0, 0.0, 13.0);
   private static final int c = 150;
   private static final int d = 5;

   @Override
   public MapCodec<? extends dpe> a() {
      return a;
   }

   protected dpe(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b;
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      return $$0.a(axc.cr);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$3.a(150) == 0) {
         eat $$4 = $$1.a_($$2.e());
         if (($$4.a(dmt.N) || $$4.a(axc.ai)) && $$3.a(5) != 0) {
            return;
         }

         eat $$5 = $$1.a_($$2.c(2));
         if ($$4.a(axc.cH) && $$5.a(axc.cH)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.gS, awo.i, 1.0F, 1.0F, false);
         }
      }
   }
}
