import com.mojang.serialization.MapCodec;

public class elu<P extends elt> {
   public static final elu<els> a = a("mangrove_root_placer", els.c);
   private final MapCodec<P> b;

   private static <P extends elt> elu<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.W, $$0, new elu<>($$1));
   }

   private elu(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
