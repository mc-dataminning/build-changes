import com.mojang.serialization.MapCodec;

public class eky<P extends ekx> {
   public static final eky<ekw> a = a("mangrove_root_placer", ekw.c);
   private final MapCodec<P> b;

   private static <P extends ekx> eky<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.W, $$0, new eky<>($$1));
   }

   private eky(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
