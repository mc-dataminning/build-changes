import com.mojang.serialization.MapCodec;

public class eju<P extends ejt> {
   public static final eju<ejw> a = a("two_layers_feature_size", ejw.d);
   public static final eju<ejv> b = a("three_layers_feature_size", ejv.d);
   private final MapCodec<P> c;

   private static <P extends ejt> eju<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.Y, $$0, new eju<>($$1));
   }

   private eju(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
