import com.mojang.serialization.MapCodec;

public class ehf<P extends ehe> {
   public static final ehf<ehd> a = a("mangrove_root_placer", ehd.c);
   private final MapCodec<P> b;

   private static <P extends ehe> ehf<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.W, $$0, new ehf<>($$1));
   }

   private ehf(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
