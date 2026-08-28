import com.mojang.serialization.MapCodec;

public class dur extends dok {
   public static final MapCodec<dur> c = b(dur::new);
   private static final fdo e = dku.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dur> a() {
      return c;
   }

   public dur(dyl.d $$0) {
      super($$0, jo.a, e, false);
   }

   @Override
   protected dol c() {
      return (dol)dkw.pb;
   }
}
