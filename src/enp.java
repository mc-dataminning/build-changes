import com.mojang.serialization.MapCodec;

public class enp<P extends eno> {
   public static final enp<enn> a = a("mangrove_root_placer", enn.c);
   private final MapCodec<P> b;

   private static <P extends eno> enp<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.W, $$0, new enp<>($$1));
   }

   private enp(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
