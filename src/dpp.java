import com.mojang.serialization.MapCodec;

public class dpp extends dwo {
   public static final MapCodec<dpp> a = b(dpp::new);
   private static final fgk b = dnc.b(12.0, 0.0, 13.0);
   private static final int c = 150;
   private static final int d = 5;

   @Override
   public MapCodec<? extends dpp> a() {
      return a;
   }

   protected dpp(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b;
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return $$0.a(axe.cr);
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$3.a(150) == 0) {
         ebe $$4 = $$1.a_($$2.e());
         if (($$4.a(dne.N) || $$4.a(axe.ai)) && $$3.a(5) != 0) {
            return;
         }

         ebe $$5 = $$1.a_($$2.c(2));
         if ($$4.a(axe.cH) && $$5.a(axe.cH)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awp.gS, awq.i, 1.0F, 1.0F, false);
         }
      }
   }
}
