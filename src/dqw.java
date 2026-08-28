import com.mojang.serialization.MapCodec;

public class dqw extends dne {
   public static final MapCodec<dqw> a = b(dqw::new);

   @Override
   public MapCodec<dqw> a() {
      return a;
   }

   public dqw(dwx.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgj $$0, dwy $$1, ji $$2, bum $$3, float $$4) {
      if (!$$3.cf()) {
         $$3.a($$4, 0.0F, $$0.ak().l());
      }
   }

   @Override
   public void a(dfo $$0, bum $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bum $$0) {
      fbb $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bvi ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, bum $$3) {
      double $$4 = Math.abs($$3.dy().e);
      if ($$4 < 0.1 && !$$3.ce()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.i($$3.dy().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
