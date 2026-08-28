import com.mojang.serialization.MapCodec;

public class ekb<P extends eka> {
   public static final ekb<ekd> a = a("two_layers_feature_size", ekd.d);
   public static final ekb<ekc> b = a("three_layers_feature_size", ekc.d);
   private final MapCodec<P> c;

   private static <P extends eka> ekb<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.Y, $$0, new ekb<>($$1));
   }

   private ekb(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
