import com.mojang.serialization.MapCodec;

public class efk<P extends efj> {
   public static final efk<efm> a = a("two_layers_feature_size", efm.d);
   public static final efk<efl> b = a("three_layers_feature_size", efl.d);
   private final MapCodec<P> c;

   private static <P extends efj> efk<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.Y, $$0, new efk<>($$1));
   }

   private efk(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
