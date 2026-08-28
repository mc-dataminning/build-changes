import com.mojang.serialization.MapCodec;

public class eew<P extends eev> {
   public static final eew<eeu> a = a("mangrove_root_placer", eeu.c);
   private final MapCodec<P> b;

   private static <P extends eev> eew<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.Y, $$0, new eew<>($$1));
   }

   private eew(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
