import com.mojang.serialization.MapCodec;

public class ejf<P extends eje> {
   public static final ejf<ejh> a = a("two_layers_feature_size", ejh.d);
   public static final ejf<ejg> b = a("three_layers_feature_size", ejg.d);
   private final MapCodec<P> c;

   private static <P extends eje> ejf<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.Y, $$0, new ejf<>($$1));
   }

   private ejf(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
