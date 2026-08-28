import com.mojang.serialization.MapCodec;

public class eka<P extends ejz> {
   public static final eka<ejy> a = a("mangrove_root_placer", ejy.c);
   private final MapCodec<P> b;

   private static <P extends ejz> eka<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.W, $$0, new eka<>($$1));
   }

   private eka(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
