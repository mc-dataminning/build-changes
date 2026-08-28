import com.mojang.serialization.MapCodec;

public class efo<P extends efn> {
   public static final efo<efm> a = a("mangrove_root_placer", efm.c);
   private final MapCodec<P> b;

   private static <P extends efn> efo<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.W, $$0, new efo<>($$1));
   }

   private efo(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
