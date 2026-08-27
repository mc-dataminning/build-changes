import com.mojang.serialization.MapCodec;

public class edd<P extends edc> {
   public static final edd<edf> a = a("two_layers_feature_size", edf.d);
   public static final edd<ede> b = a("three_layers_feature_size", ede.d);
   private final MapCodec<P> c;

   private static <P extends edc> edd<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.aa, $$0, new edd<>($$1));
   }

   private edd(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
