import com.mojang.serialization.MapCodec;

public class drt extends dod {
   public static final MapCodec<drt> a = b(drt::new);

   @Override
   public MapCodec<drt> a() {
      return a;
   }

   public drt(dxu.d $$0) {
      super($$0);
   }

   @Override
   public void a(dhi $$0, dxv $$1, jh $$2, bvk $$3, float $$4) {
      if (!$$3.cf()) {
         $$3.a($$4, 0.0F, $$0.aj().l());
      }
   }

   @Override
   public void a(dgn $$0, bvk $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bvk $$0) {
      fby $$1 = $$0.dz();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bwg ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, bvk $$3) {
      double $$4 = Math.abs($$3.dz().e);
      if ($$4 < 0.1 && !$$3.ce()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.h($$3.dz().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
