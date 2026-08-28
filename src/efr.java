import com.mojang.serialization.MapCodec;

public class efr<P extends efq> {
   public static final efr<efz> a = a("simple_state_provider", efz.b);
   public static final efr<ega> b = a("weighted_state_provider", ega.b);
   public static final efr<efv> c = a("noise_threshold_provider", efv.b);
   public static final efr<efu> d = a("noise_provider", efu.g);
   public static final efr<efs> e = a("dual_noise_provider", efs.b);
   public static final efr<efx> f = a("rotated_block_provider", efx.b);
   public static final efr<efw> g = a("randomized_int_state_provider", efw.b);
   private final MapCodec<P> h;

   private static <P extends efq> efr<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.T, $$0, new efr<>($$1));
   }

   private efr(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
