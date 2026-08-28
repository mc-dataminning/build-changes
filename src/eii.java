import com.mojang.serialization.MapCodec;

public class eii<P extends eih> {
   public static final eii<eig> a = a("mangrove_root_placer", eig.c);
   private final MapCodec<P> b;

   private static <P extends eih> eii<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.W, $$0, new eii<>($$1));
   }

   private eii(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
