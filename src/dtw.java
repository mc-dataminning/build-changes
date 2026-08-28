import com.mojang.serialization.MapCodec;

public class dtw extends dok {
   public static final MapCodec<dtw> c = b(dtw::new);
   private static final fdo e = dku.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dtw> a() {
      return c;
   }

   public dtw(dyl.d $$0) {
      super($$0, jo.b, e, false);
   }

   @Override
   protected dol c() {
      return (dol)dkw.pd;
   }
}
