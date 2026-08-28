import com.mojang.serialization.MapCodec;

public class efj<P extends efi> {
   public static final efj<efl> a = a("two_layers_feature_size", efl.d);
   public static final efj<efk> b = a("three_layers_feature_size", efk.d);
   private final MapCodec<P> c;

   private static <P extends efi> efj<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.Y, $$0, new efj<>($$1));
   }

   private efj(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
