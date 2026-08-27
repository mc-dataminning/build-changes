import com.mojang.serialization.MapCodec;

public class eec<P extends eeb> {
   public static final eec<eea> a = a("mangrove_root_placer", eea.c);
   private final MapCodec<P> b;

   private static <P extends eeb> eec<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.Y, $$0, new eec<>($$1));
   }

   private eec(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
