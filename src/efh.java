import com.mojang.serialization.MapCodec;

public class efh<P extends efg> {
   public static final efh<eff> a = a("mangrove_root_placer", eff.c);
   private final MapCodec<P> b;

   private static <P extends efg> efh<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.W, $$0, new efh<>($$1));
   }

   private efh(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
