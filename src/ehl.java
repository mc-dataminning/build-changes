import com.mojang.serialization.MapCodec;

public class ehl<P extends ehk> {
   public static final ehl<ehn> a = a("two_layers_feature_size", ehn.d);
   public static final ehl<ehm> b = a("three_layers_feature_size", ehm.d);
   private final MapCodec<P> c;

   private static <P extends ehk> ehl<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.Y, $$0, new ehl<>($$1));
   }

   private ehl(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
