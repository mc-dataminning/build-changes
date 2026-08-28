import com.mojang.serialization.MapCodec;

public class eiz<P extends eiy> {
   public static final eiz<eix> a = a("mangrove_root_placer", eix.c);
   private final MapCodec<P> b;

   private static <P extends eiy> eiz<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.W, $$0, new eiz<>($$1));
   }

   private eiz(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
