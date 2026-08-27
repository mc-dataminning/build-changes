import com.mojang.serialization.MapCodec;

public class eea<P extends edz> {
   public static final eea<edy> a = a("mangrove_root_placer", edy.c);
   private final MapCodec<P> b;

   private static <P extends edz> eea<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.Y, $$0, new eea<>($$1));
   }

   private eea(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
