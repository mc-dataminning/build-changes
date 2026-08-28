import com.mojang.serialization.MapCodec;

public class eoq<P extends eop> {
   public static final eoq<eoo> a = a("mangrove_root_placer", eoo.c);
   private final MapCodec<P> b;

   private static <P extends eop> eoq<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.W, $$0, new eoq<>($$1));
   }

   private eoq(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
