import com.mojang.serialization.MapCodec;

public class dtm extends dpt {
   public static final MapCodec<dtm> a = b(dtm::new);

   @Override
   public MapCodec<dtm> a() {
      return a;
   }

   public dtm(dzy.d $$0) {
      super($$0);
   }

   @Override
   public void a(div $$0, dzz $$1, iu $$2, bwd $$3, double $$4) {
      if (!$$3.cf()) {
         $$3.a($$4, 0.0F, $$0.al().l());
      }
   }

   @Override
   public void a(dib $$0, bwd $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bwd $$0) {
      fei $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bxc ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, bwd $$3) {
      double $$4 = Math.abs($$3.dy().e);
      if ($$4 < 0.1 && !$$3.ce()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.i($$3.dy().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
