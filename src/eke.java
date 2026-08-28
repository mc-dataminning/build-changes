import com.mojang.serialization.MapCodec;

public class eke<P extends ekd> {
   public static final eke<ekm> a = a("simple_state_provider", ekm.b);
   public static final eke<ekn> b = a("weighted_state_provider", ekn.b);
   public static final eke<eki> c = a("noise_threshold_provider", eki.b);
   public static final eke<ekh> d = a("noise_provider", ekh.g);
   public static final eke<ekf> e = a("dual_noise_provider", ekf.b);
   public static final eke<ekk> f = a("rotated_block_provider", ekk.b);
   public static final eke<ekj> g = a("randomized_int_state_provider", ekj.b);
   private final MapCodec<P> h;

   private static <P extends ekd> eke<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.T, $$0, new eke<>($$1));
   }

   private eke(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
