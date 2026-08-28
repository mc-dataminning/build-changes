import com.mojang.serialization.MapCodec;

public class eka<P extends ejz> {
   public static final eka<ekc> a = a("two_layers_feature_size", ekc.d);
   public static final eka<ekb> b = a("three_layers_feature_size", ekb.d);
   private final MapCodec<P> c;

   private static <P extends ejz> eka<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.Y, $$0, new eka<>($$1));
   }

   private eka(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
