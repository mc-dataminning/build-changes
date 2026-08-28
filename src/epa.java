import com.mojang.serialization.MapCodec;

public class epa<P extends eoz> {
   public static final epa<eoy> a = a("mangrove_root_placer", eoy.c);
   private final MapCodec<P> b;

   private static <P extends eoz> epa<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.W, $$0, new epa<>($$1));
   }

   private epa(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
