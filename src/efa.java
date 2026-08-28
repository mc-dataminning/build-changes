import com.mojang.serialization.MapCodec;

public class efa<P extends eez> {
   public static final efa<eey> a = a("mangrove_root_placer", eey.c);
   private final MapCodec<P> b;

   private static <P extends eez> efa<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.Y, $$0, new efa<>($$1));
   }

   private efa(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
