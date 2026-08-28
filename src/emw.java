import com.mojang.serialization.MapCodec;

public class emw<P extends emv> {
   public static final emw<emu> a = a("mangrove_root_placer", emu.c);
   private final MapCodec<P> b;

   private static <P extends emv> emw<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.W, $$0, new emw<>($$1));
   }

   private emw(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
