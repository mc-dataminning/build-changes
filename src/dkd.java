import com.mojang.serialization.MapCodec;

public class dkd extends dke {
   public static final MapCodec<dkd> a = b(dkd::new);
   private static final fdo c = dku.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<dkd> a() {
      return a;
   }

   protected dkd(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return c;
   }
}
