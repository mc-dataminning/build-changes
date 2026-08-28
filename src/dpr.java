import com.mojang.serialization.MapCodec;

public class dpr extends dwq {
   public static final MapCodec<dpr> a = b(dpr::new);
   private static final fgm b = dne.b(12.0, 0.0, 13.0);
   private static final int c = 150;
   private static final int d = 5;

   @Override
   public MapCodec<? extends dpr> a() {
      return a;
   }

   protected dpr(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b;
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return $$0.a(axg.cr);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$3.a(150) == 0) {
         ebg $$4 = $$1.a_($$2.e());
         if (($$4.a(dng.N) || $$4.a(axg.ai)) && $$3.a(5) != 0) {
            return;
         }

         ebg $$5 = $$1.a_($$2.c(2));
         if ($$4.a(axg.cH) && $$5.a(axg.cH)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awr.gS, aws.i, 1.0F, 1.0F, false);
         }
      }
   }
}
