import com.mojang.serialization.MapCodec;

public class eku<P extends ekt> {
   public static final eku<elc> a = a("simple_state_provider", elc.b);
   public static final eku<eld> b = a("weighted_state_provider", eld.b);
   public static final eku<eky> c = a("noise_threshold_provider", eky.b);
   public static final eku<ekx> d = a("noise_provider", ekx.g);
   public static final eku<ekv> e = a("dual_noise_provider", ekv.b);
   public static final eku<ela> f = a("rotated_block_provider", ela.b);
   public static final eku<ekz> g = a("randomized_int_state_provider", ekz.b);
   private final MapCodec<P> h;

   private static <P extends ekt> eku<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.T, $$0, new eku<>($$1));
   }

   private eku(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
