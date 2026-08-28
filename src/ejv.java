import com.mojang.serialization.MapCodec;

public class ejv<P extends eju> {
   public static final ejv<ejx> a = a("two_layers_feature_size", ejx.d);
   public static final ejv<ejw> b = a("three_layers_feature_size", ejw.d);
   private final MapCodec<P> c;

   private static <P extends eju> ejv<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.Y, $$0, new ejv<>($$1));
   }

   private ejv(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
