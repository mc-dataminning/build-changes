import com.mojang.serialization.MapCodec;

public class ejc<P extends ejb> {
   public static final ejc<ejk> a = a("simple_state_provider", ejk.b);
   public static final ejc<ejl> b = a("weighted_state_provider", ejl.b);
   public static final ejc<ejg> c = a("noise_threshold_provider", ejg.b);
   public static final ejc<ejf> d = a("noise_provider", ejf.g);
   public static final ejc<ejd> e = a("dual_noise_provider", ejd.b);
   public static final ejc<eji> f = a("rotated_block_provider", eji.b);
   public static final ejc<ejh> g = a("randomized_int_state_provider", ejh.b);
   private final MapCodec<P> h;

   private static <P extends ejb> ejc<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.T, $$0, new ejc<>($$1));
   }

   private ejc(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
