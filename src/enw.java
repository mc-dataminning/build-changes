import com.mojang.serialization.MapCodec;

public class enw<P extends env> {
   public static final enw<enu> a = a("mangrove_root_placer", enu.c);
   private final MapCodec<P> b;

   private static <P extends env> enw<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.W, $$0, new enw<>($$1));
   }

   private enw(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
