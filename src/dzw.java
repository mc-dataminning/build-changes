import com.mojang.serialization.Codec;

public class dzw<P extends dzv> {
   public static final dzw<eae> a = a("simple_state_provider", eae.b);
   public static final dzw<eaf> b = a("weighted_state_provider", eaf.b);
   public static final dzw<eaa> c = a("noise_threshold_provider", eaa.b);
   public static final dzw<dzz> d = a("noise_provider", dzz.g);
   public static final dzw<dzx> e = a("dual_noise_provider", dzx.b);
   public static final dzw<eac> f = a("rotated_block_provider", eac.b);
   public static final dzw<eab> g = a("randomized_int_state_provider", eab.b);
   private final Codec<P> h;

   private static <P extends dzv> dzw<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.V, $$0, new dzw<>($$1));
   }

   private dzw(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
