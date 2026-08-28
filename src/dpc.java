import com.mojang.serialization.MapCodec;

public class dpc extends dln {
   public static final MapCodec<dpc> a = b(dpc::new);

   @Override
   public MapCodec<dpc> a() {
      return a;
   }

   public dpc(dvc.d $$0) {
      super($$0);
   }

   @Override
   public void a(dev $$0, dvd $$1, jg $$2, btz $$3, float $$4) {
      if ($$3.cg()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ak().l());
      }
   }

   @Override
   public void a(dea $$0, btz $$1) {
      if ($$1.cg()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(btz $$0) {
      ezh $$1 = $$0.dA();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof buv ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, btz $$3) {
      double $$4 = Math.abs($$3.dA().e);
      if ($$4 < 0.1 && !$$3.cf()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.h($$3.dA().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
