import com.mojang.serialization.MapCodec;

public class ekr<P extends ekq> {
   public static final ekr<ekp> a = a("mangrove_root_placer", ekp.c);
   private final MapCodec<P> b;

   private static <P extends ekq> ekr<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.W, $$0, new ekr<>($$1));
   }

   private ekr(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
