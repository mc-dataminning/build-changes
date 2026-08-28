import com.mojang.serialization.MapCodec;

public class edz<P extends edy> {
   public static final edz<eeb> a = a("two_layers_feature_size", eeb.d);
   public static final edz<eea> b = a("three_layers_feature_size", eea.d);
   private final MapCodec<P> c;

   private static <P extends edy> edz<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.aa, $$0, new edz<>($$1));
   }

   private edz(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
