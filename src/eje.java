import com.mojang.serialization.MapCodec;

public class eje<P extends ejd> {
   public static final eje<ejg> a = a("two_layers_feature_size", ejg.d);
   public static final eje<ejf> b = a("three_layers_feature_size", ejf.d);
   private final MapCodec<P> c;

   private static <P extends ejd> eje<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.Y, $$0, new eje<>($$1));
   }

   private eje(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
