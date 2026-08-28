import com.mojang.serialization.MapCodec;

public class dsz extends dku {
   public static final MapCodec<dsz> a = b(dsz::new);
   private static final fdo b = dku.a(6.0);

   @Override
   public MapCodec<dsz> a() {
      return a;
   }

   protected dsz(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected drf a_(dym $$0) {
      return drf.a;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b;
   }

   @Override
   protected float c(dym $$0, dgv $$1, jj $$2) {
      return 1.0F;
   }
}
