import com.mojang.serialization.Codec;

public class dyf<P extends dye> {
   public static final dyf<dyn> a = a("simple_state_provider", dyn.b);
   public static final dyf<dyo> b = a("weighted_state_provider", dyo.b);
   public static final dyf<dyj> c = a("noise_threshold_provider", dyj.b);
   public static final dyf<dyi> d = a("noise_provider", dyi.g);
   public static final dyf<dyg> e = a("dual_noise_provider", dyg.b);
   public static final dyf<dyl> f = a("rotated_block_provider", dyl.b);
   public static final dyf<dyk> g = a("randomized_int_state_provider", dyk.b);
   private final Codec<P> h;

   private static <P extends dye> dyf<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.V, $$0, new dyf<>($$1));
   }

   private dyf(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
