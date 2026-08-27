import com.mojang.serialization.Codec;

public class dvz<P extends dvy> {
   public static final dvz<dwh> a = a("simple_state_provider", dwh.b);
   public static final dvz<dwi> b = a("weighted_state_provider", dwi.b);
   public static final dvz<dwd> c = a("noise_threshold_provider", dwd.b);
   public static final dvz<dwc> d = a("noise_provider", dwc.g);
   public static final dvz<dwa> e = a("dual_noise_provider", dwa.b);
   public static final dvz<dwf> f = a("rotated_block_provider", dwf.b);
   public static final dvz<dwe> g = a("randomized_int_state_provider", dwe.b);
   private final Codec<P> h;

   private static <P extends dvy> dvz<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.V, $$0, new dvz<>($$1));
   }

   private dvz(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
