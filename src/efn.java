import com.mojang.serialization.MapCodec;

public class efn<P extends efm> {
   public static final efn<efl> a = a("mangrove_root_placer", efl.c);
   private final MapCodec<P> b;

   private static <P extends efm> efn<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.W, $$0, new efn<>($$1));
   }

   private efn(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
