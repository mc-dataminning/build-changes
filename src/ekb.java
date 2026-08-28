import com.mojang.serialization.MapCodec;

public class ekb<P extends eka> {
   public static final ekb<ejz> a = a("mangrove_root_placer", ejz.c);
   private final MapCodec<P> b;

   private static <P extends eka> ekb<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.W, $$0, new ekb<>($$1));
   }

   private ekb(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
