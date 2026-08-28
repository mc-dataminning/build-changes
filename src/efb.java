import com.mojang.serialization.MapCodec;

public class efb<P extends efa> {
   public static final efb<eez> a = a("mangrove_root_placer", eez.c);
   private final MapCodec<P> b;

   private static <P extends efa> efb<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.Y, $$0, new efb<>($$1));
   }

   private efb(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
