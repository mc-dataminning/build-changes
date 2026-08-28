import com.mojang.serialization.MapCodec;

public class eha<P extends egz> {
   public static final eha<ehc> a = a("two_layers_feature_size", ehc.d);
   public static final eha<ehb> b = a("three_layers_feature_size", ehb.d);
   private final MapCodec<P> c;

   private static <P extends egz> eha<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.Y, $$0, new eha<>($$1));
   }

   private eha(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
