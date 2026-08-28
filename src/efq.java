import com.mojang.serialization.MapCodec;

public class efq<P extends efp> {
   public static final efq<efy> a = a("simple_state_provider", efy.b);
   public static final efq<efz> b = a("weighted_state_provider", efz.b);
   public static final efq<efu> c = a("noise_threshold_provider", efu.b);
   public static final efq<eft> d = a("noise_provider", eft.g);
   public static final efq<efr> e = a("dual_noise_provider", efr.b);
   public static final efq<efw> f = a("rotated_block_provider", efw.b);
   public static final efq<efv> g = a("randomized_int_state_provider", efv.b);
   private final MapCodec<P> h;

   private static <P extends efp> efq<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.T, $$0, new efq<>($$1));
   }

   private efq(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
