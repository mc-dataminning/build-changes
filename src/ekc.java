import com.mojang.serialization.MapCodec;

public class ekc<P extends ekb> {
   public static final ekc<eka> a = a("mangrove_root_placer", eka.c);
   private final MapCodec<P> b;

   private static <P extends ekb> ekc<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.W, $$0, new ekc<>($$1));
   }

   private ekc(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
