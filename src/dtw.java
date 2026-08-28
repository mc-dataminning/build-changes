import com.mojang.serialization.MapCodec;

public class dtw extends dnt {
   public static final MapCodec<dtw> c = b(dtw::new);
   public static final fcm e = dke.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dtw> a() {
      return c;
   }

   public dtw(dxm.d $$0) {
      super($$0, jm.a, e, false);
   }

   @Override
   protected dnu c() {
      return (dnu)dkg.oU;
   }
}
