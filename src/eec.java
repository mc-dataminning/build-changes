import com.mojang.serialization.MapCodec;

public class eec<P extends eeb> {
   public static final eec<eee> a = a("two_layers_feature_size", eee.d);
   public static final eec<eed> b = a("three_layers_feature_size", eed.d);
   private final MapCodec<P> c;

   private static <P extends eeb> eec<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.aa, $$0, new eec<>($$1));
   }

   private eec(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
