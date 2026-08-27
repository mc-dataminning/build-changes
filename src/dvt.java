import com.mojang.serialization.Codec;

public class dvt<P extends dvs> {
   public static final dvt<dwb> a = a("simple_state_provider", dwb.b);
   public static final dvt<dwc> b = a("weighted_state_provider", dwc.b);
   public static final dvt<dvx> c = a("noise_threshold_provider", dvx.b);
   public static final dvt<dvw> d = a("noise_provider", dvw.g);
   public static final dvt<dvu> e = a("dual_noise_provider", dvu.b);
   public static final dvt<dvz> f = a("rotated_block_provider", dvz.b);
   public static final dvt<dvy> g = a("randomized_int_state_provider", dvy.b);
   private final Codec<P> h;

   private static <P extends dvs> dvt<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.V, $$0, new dvt<>($$1));
   }

   private dvt(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
