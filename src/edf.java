import com.mojang.serialization.MapCodec;

public class edf<P extends ede> {
   public static final edf<edh> a = a("two_layers_feature_size", edh.d);
   public static final edf<edg> b = a("three_layers_feature_size", edg.d);
   private final MapCodec<P> c;

   private static <P extends ede> edf<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.aa, $$0, new edf<>($$1));
   }

   private edf(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
