import com.mojang.serialization.MapCodec;

public class eic<P extends eib> {
   public static final eic<eie> a = a("two_layers_feature_size", eie.d);
   public static final eic<eid> b = a("three_layers_feature_size", eid.d);
   private final MapCodec<P> c;

   private static <P extends eib> eic<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.Y, $$0, new eic<>($$1));
   }

   private eic(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
