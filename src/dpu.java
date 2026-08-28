import com.mojang.serialization.MapCodec;

public class dpu extends dwd implements dmu {
   private static final double b = 0.7;
   private static final double c = 10.0;
   private static final double d = 5.0;
   private static final int e = 13;
   private static final int f = 30;
   public static final MapCodec<dpu> a = b(dpu::new);

   public dpu(eas.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dpu> a() {
      return a;
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$3.a(30) == 0 && $$1.X() && $$1.b(egs.a.f, $$2) <= $$2.v()) {
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
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return dmu.a_($$0, $$1, $$2);
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      dmu.a((djm)$$0, $$2, $$3).ifPresent($$1x -> $$0.b($$1x, this.m()));
   }
}
