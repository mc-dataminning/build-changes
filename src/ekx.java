import com.mojang.serialization.MapCodec;

public class ekx<P extends ekw> {
   public static final ekx<ekz> a = a("two_layers_feature_size", ekz.d);
   public static final ekx<eky> b = a("three_layers_feature_size", eky.d);
   private final MapCodec<P> c;

   private static <P extends ekw> ekx<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.Y, $$0, new ekx<>($$1));
   }

   private ekx(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
