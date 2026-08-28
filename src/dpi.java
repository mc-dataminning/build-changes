import com.mojang.serialization.MapCodec;

public class dpi extends dlt {
   public static final MapCodec<dpi> a = b(dpi::new);

   @Override
   public MapCodec<dpi> a() {
      return a;
   }

   public dpi(dvi.d $$0) {
      super($$0);
   }

   @Override
   public void a(dfb $$0, dvj $$1, jh $$2, bue $$3, float $$4) {
      if ($$3.cg()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ai().l());
      }
   }

   @Override
   public void a(deg $$0, bue $$1) {
      if ($$1.cg()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bue $$0) {
      ezn $$1 = $$0.dA();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bva ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, bue $$3) {
      double $$4 = Math.abs($$3.dA().e);
      if ($$4 < 0.1 && !$$3.cf()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.h($$3.dA().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
