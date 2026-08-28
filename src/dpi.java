import com.mojang.serialization.MapCodec;

public class dpi extends dvr implements dmi {
   private static final double b = 0.7;
   private static final double c = 10.0;
   private static final double d = 5.0;
   private static final int e = 13;
   private static final int f = 30;
   public static final MapCodec<dpi> a = b(dpi::new);

   public dpi(eag.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dpi> a() {
      return a;
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if ($$3.a(30) == 0 && $$1.X() && $$1.b(egg.a.f, $$2) <= $$2.v()) {
         $$1.a($$2, awn.jo, awo.e, 1.0F, 1.0F, false);
      }

      if ($$1.B($$2) <= 13 && $$3.j() <= 0.7) {
         double $$4 = (double)$$2.u() + $$3.j() * 10.0 - 5.0;
         double $$5 = (double)$$2.v() + $$3.j() * 5.0;
         double $$6 = (double)$$2.w() + $$3.j() * 10.0 - 5.0;
         $$1.a(lx.bj, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return true;
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      a($$0, $$2, new czd(this));
   }
}
