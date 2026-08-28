import com.mojang.serialization.MapCodec;

public class drs extends doc {
   public static final MapCodec<drs> a = b(drs::new);

   @Override
   public MapCodec<drs> a() {
      return a;
   }

   public drs(dxt.d $$0) {
      super($$0);
   }

   @Override
   public void a(dhh $$0, dxu $$1, jh $$2, bvj $$3, float $$4) {
      if (!$$3.cf()) {
         $$3.a($$4, 0.0F, $$0.aj().l());
      }
   }

   @Override
   public void a(dgm $$0, bvj $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bvj $$0) {
      fbx $$1 = $$0.dz();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bwf ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, bvj $$3) {
      double $$4 = Math.abs($$3.dz().e);
      if ($$4 < 0.1 && !$$3.ce()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.h($$3.dz().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
