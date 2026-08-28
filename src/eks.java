import com.mojang.serialization.MapCodec;

public class eks<P extends ekr> {
   public static final eks<ekq> a = a("mangrove_root_placer", ekq.c);
   private final MapCodec<P> b;

   private static <P extends ekr> eks<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.W, $$0, new eks<>($$1));
   }

   private eks(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
