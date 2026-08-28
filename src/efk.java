import com.mojang.serialization.MapCodec;

public class efk<P extends efj> {
   public static final efk<efs> a = a("simple_state_provider", efs.b);
   public static final efk<eft> b = a("weighted_state_provider", eft.b);
   public static final efk<efo> c = a("noise_threshold_provider", efo.b);
   public static final efk<efn> d = a("noise_provider", efn.g);
   public static final efk<efl> e = a("dual_noise_provider", efl.b);
   public static final efk<efq> f = a("rotated_block_provider", efq.b);
   public static final efk<efp> g = a("randomized_int_state_provider", efp.b);
   private final MapCodec<P> h;

   private static <P extends efj> efk<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.T, $$0, new efk<>($$1));
   }

   private efk(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
