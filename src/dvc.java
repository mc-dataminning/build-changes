import com.mojang.serialization.MapCodec;

public class dvc extends dri {
   public static final MapCodec<dvc> a = b(dvc::new);

   @Override
   public MapCodec<dvc> a() {
      return a;
   }

   public dvc(ebp.d $$0) {
      super($$0);
   }

   @Override
   public void a(dkj $$0, ebq $$1, iw $$2, bxe $$3, double $$4) {
      if (!$$3.ce()) {
         $$3.a($$4, 0.0F, $$0.al().l());
      }
   }

   @Override
   public void a(djn $$0, bxe $$1) {
      if ($$1.ce()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bxe $$0) {
      fgc $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof byf ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, bxe $$3) {
      double $$4 = Math.abs($$3.dy().e);
      if ($$4 < 0.1 && !$$3.cd()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.i($$3.dy().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
