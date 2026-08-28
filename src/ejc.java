import com.mojang.serialization.MapCodec;

public class ejc<P extends ejb> {
   public static final ejc<eje> a = a("two_layers_feature_size", eje.d);
   public static final ejc<ejd> b = a("three_layers_feature_size", ejd.d);
   private final MapCodec<P> c;

   private static <P extends ejb> ejc<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.Y, $$0, new ejc<>($$1));
   }

   private ejc(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
