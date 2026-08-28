import com.mojang.serialization.MapCodec;

public class egw<P extends egv> {
   public static final egw<egy> a = a("two_layers_feature_size", egy.d);
   public static final egw<egx> b = a("three_layers_feature_size", egx.d);
   private final MapCodec<P> c;

   private static <P extends egv> egw<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.Y, $$0, new egw<>($$1));
   }

   private egw(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
