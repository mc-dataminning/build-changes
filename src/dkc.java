import com.mojang.serialization.MapCodec;

public class dkc extends dke {
   public static final MapCodec<dkc> a = b(dkc::new);
   private static final fdo c = dku.b(12.0, 0.0, 4.0);

   @Override
   public MapCodec<? extends dkc> a() {
      return a;
   }

   protected dkc(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return c;
   }
}
