import com.mojang.serialization.MapCodec;

public class ekc<P extends ekb> {
   public static final ekc<eke> a = a("two_layers_feature_size", eke.d);
   public static final ekc<ekd> b = a("three_layers_feature_size", ekd.d);
   private final MapCodec<P> c;

   private static <P extends ekb> ekc<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.Y, $$0, new ekc<>($$1));
   }

   private ekc(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
