import com.mojang.serialization.MapCodec;

public class efg<P extends eff> {
   public static final efg<efi> a = a("two_layers_feature_size", efi.d);
   public static final efg<efh> b = a("three_layers_feature_size", efh.d);
   private final MapCodec<P> c;

   private static <P extends eff> efg<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.Y, $$0, new efg<>($$1));
   }

   private efg(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
