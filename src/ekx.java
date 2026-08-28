import com.mojang.serialization.MapCodec;

public class ekx<P extends ekw> {
   public static final ekx<ekv> a = a("mangrove_root_placer", ekv.c);
   private final MapCodec<P> b;

   private static <P extends ekw> ekx<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.W, $$0, new ekx<>($$1));
   }

   private ekx(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
