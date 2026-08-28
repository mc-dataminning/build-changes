import com.mojang.serialization.MapCodec;

public class ejz<P extends ejy> {
   public static final ejz<ejx> a = a("mangrove_root_placer", ejx.c);
   private final MapCodec<P> b;

   private static <P extends ejy> ejz<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.W, $$0, new ejz<>($$1));
   }

   private ejz(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
