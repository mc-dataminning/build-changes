import com.mojang.serialization.MapCodec;

public class drl extends dnv {
   public static final MapCodec<drl> a = b(drl::new);

   @Override
   public MapCodec<drl> a() {
      return a;
   }

   public drl(dxm.d $$0) {
      super($$0);
   }

   @Override
   public void a(dha $$0, dxn $$1, jh $$2, bvf $$3, float $$4) {
      if ($$3.cf()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.aj().l());
      }
   }

   @Override
   public void a(dgf $$0, bvf $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bvf $$0) {
      fbs $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bwb ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, bvf $$3) {
      double $$4 = Math.abs($$3.dy().e);
      if ($$4 < 0.1 && !$$3.ce()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.h($$3.dy().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
