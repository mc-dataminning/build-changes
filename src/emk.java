import com.mojang.serialization.MapCodec;

public class emk<P extends emj> {
   public static final emk<emm> a = a("two_layers_feature_size", emm.d);
   public static final emk<eml> b = a("three_layers_feature_size", eml.d);
   private final MapCodec<P> c;

   private static <P extends emj> emk<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.Y, $$0, new emk<>($$1));
   }

   private emk(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
