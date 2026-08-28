import com.mojang.serialization.MapCodec;

public class eez<P extends eey> {
   public static final eez<eex> a = a("mangrove_root_placer", eex.c);
   private final MapCodec<P> b;

   private static <P extends eey> eez<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.Y, $$0, new eez<>($$1));
   }

   private eez(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
