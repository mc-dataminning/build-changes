import com.mojang.serialization.Codec;

public class eda<P extends ecz> {
   public static final eda<edi> a = a("simple_state_provider", edi.b);
   public static final eda<edj> b = a("weighted_state_provider", edj.b);
   public static final eda<ede> c = a("noise_threshold_provider", ede.b);
   public static final eda<edd> d = a("noise_provider", edd.g);
   public static final eda<edb> e = a("dual_noise_provider", edb.b);
   public static final eda<edg> f = a("rotated_block_provider", edg.b);
   public static final eda<edf> g = a("randomized_int_state_provider", edf.b);
   private final Codec<P> h;

   private static <P extends ecz> eda<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.V, $$0, new eda<>($$1));
   }

   private eda(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
