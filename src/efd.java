import com.mojang.serialization.MapCodec;

public class efd<P extends efc> {
   public static final efd<efb> a = a("mangrove_root_placer", efb.c);
   private final MapCodec<P> b;

   private static <P extends efc> efd<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.Y, $$0, new efd<>($$1));
   }

   private efd(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
