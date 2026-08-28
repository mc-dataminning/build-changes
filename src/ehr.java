import com.mojang.serialization.MapCodec;

public class ehr<P extends ehq> {
   public static final ehr<eht> a = a("two_layers_feature_size", eht.d);
   public static final ehr<ehs> b = a("three_layers_feature_size", ehs.d);
   private final MapCodec<P> c;

   private static <P extends ehq> ehr<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.Y, $$0, new ehr<>($$1));
   }

   private ehr(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
