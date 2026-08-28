import com.mojang.serialization.MapCodec;

public class egd<P extends egc> {
   public static final egd<egb> a = a("mangrove_root_placer", egb.c);
   private final MapCodec<P> b;

   private static <P extends egc> egd<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.W, $$0, new egd<>($$1));
   }

   private egd(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
