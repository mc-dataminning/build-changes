import com.mojang.serialization.MapCodec;

public class ehv<P extends ehu> {
   public static final ehv<ehx> a = a("two_layers_feature_size", ehx.d);
   public static final ehv<ehw> b = a("three_layers_feature_size", ehw.d);
   private final MapCodec<P> c;

   private static <P extends ehu> ehv<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.Y, $$0, new ehv<>($$1));
   }

   private ehv(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
