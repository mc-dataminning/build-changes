import com.mojang.serialization.MapCodec;

public class emz<P extends emy> {
   public static final emz<enb> a = a("two_layers_feature_size", enb.d);
   public static final emz<ena> b = a("three_layers_feature_size", ena.d);
   private final MapCodec<P> c;

   private static <P extends emy> emz<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.Y, $$0, new emz<>($$1));
   }

   private emz(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
