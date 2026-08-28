import com.mojang.serialization.MapCodec;

public class ems<P extends emr> {
   public static final ems<emu> a = a("two_layers_feature_size", emu.d);
   public static final ems<emt> b = a("three_layers_feature_size", emt.d);
   private final MapCodec<P> c;

   private static <P extends emr> ems<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.Y, $$0, new ems<>($$1));
   }

   private ems(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
