import com.mojang.serialization.MapCodec;

public class ekz<P extends eky> {
   public static final ekz<ekx> a = a("mangrove_root_placer", ekx.c);
   private final MapCodec<P> b;

   private static <P extends eky> ekz<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.W, $$0, new ekz<>($$1));
   }

   private ekz(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
