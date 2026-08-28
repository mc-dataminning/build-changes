import com.mojang.serialization.MapCodec;

public class ejd<P extends ejc> {
   public static final ejd<ejf> a = a("two_layers_feature_size", ejf.d);
   public static final ejd<eje> b = a("three_layers_feature_size", eje.d);
   private final MapCodec<P> c;

   private static <P extends ejc> ejd<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.Y, $$0, new ejd<>($$1));
   }

   private ejd(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
