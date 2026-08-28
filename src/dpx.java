import com.mojang.serialization.MapCodec;

public class dpx extends dku {
   public static final MapCodec<dpx> a = b(dpx::new);
   private static final fdo b = dku.b(16.0, 0.0, 14.0);

   @Override
   public MapCodec<dpx> a() {
      return a;
   }

   public dpx(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b;
   }

   @Override
   protected fdo b_(dym $$0, dgv $$1, jj $$2) {
      return fdl.b();
   }

   @Override
   protected fdo c(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return fdl.b();
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   @Override
   protected float c(dym $$0, dgv $$1, jj $$2) {
      return 0.2F;
   }
}
