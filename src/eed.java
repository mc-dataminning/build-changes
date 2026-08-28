import com.mojang.serialization.MapCodec;

public class eed<P extends eec> {
   public static final eed<eef> a = a("two_layers_feature_size", eef.d);
   public static final eed<eee> b = a("three_layers_feature_size", eee.d);
   private final MapCodec<P> c;

   private static <P extends eec> eed<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.aa, $$0, new eed<>($$1));
   }

   private eed(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
