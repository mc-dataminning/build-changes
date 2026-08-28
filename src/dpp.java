import com.mojang.serialization.MapCodec;

public class dpp extends dvy implements dmp {
   private static final double b = 0.7;
   private static final double c = 10.0;
   private static final double d = 5.0;
   private static final int e = 13;
   private static final int f = 30;
   public static final MapCodec<dpp> a = b(dpp::new);

   public dpp(ean.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dpp> a() {
      return a;
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if ($$3.a(30) == 0 && $$1.X() && $$1.b(egn.a.f, $$2) <= $$2.v()) {
         $$1.a($$2, awn.jo, awo.e, 1.0F, 1.0F, false);
      }

      if ($$1.B($$2) <= 13 && $$3.j() <= 0.7) {
         double $$4 = (double)$$2.u() + $$3.j() * 10.0 - 5.0;
         double $$5 = (double)$$2.v() + $$3.j() * 5.0;
         double $$6 = (double)$$2.w() + $$3.j() * 10.0 - 5.0;
         $$1.a(ly.bj, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return dmp.a_($$0, $$1, $$2);
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      dmp.a((djh)$$0, $$2, $$3).ifPresent($$1x -> $$0.b($$1x, this.m()));
   }
}
