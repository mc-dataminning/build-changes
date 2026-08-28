import com.mojang.serialization.MapCodec;

public class eek<P extends eej> {
   public static final eek<eem> a = a("two_layers_feature_size", eem.d);
   public static final eek<eel> b = a("three_layers_feature_size", eel.d);
   private final MapCodec<P> c;

   private static <P extends eej> eek<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.Y, $$0, new eek<>($$1));
   }

   private eek(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
