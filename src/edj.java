import com.mojang.serialization.Codec;

public class edj<P extends edi> {
   public static final edj<edr> a = a("simple_state_provider", edr.b);
   public static final edj<eds> b = a("weighted_state_provider", eds.b);
   public static final edj<edn> c = a("noise_threshold_provider", edn.b);
   public static final edj<edm> d = a("noise_provider", edm.g);
   public static final edj<edk> e = a("dual_noise_provider", edk.b);
   public static final edj<edp> f = a("rotated_block_provider", edp.b);
   public static final edj<edo> g = a("randomized_int_state_provider", edo.b);
   private final Codec<P> h;

   private static <P extends edi> edj<P> a(String $$0, Codec<P> $$1) {
      return jj.a(ld.V, $$0, new edj<>($$1));
   }

   private edj(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
