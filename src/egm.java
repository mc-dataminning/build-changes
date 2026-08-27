import com.mojang.serialization.Codec;

public class egm<P extends egl> {
   public static final egm<egu> a = a("simple_state_provider", egu.b);
   public static final egm<egv> b = a("weighted_state_provider", egv.b);
   public static final egm<egq> c = a("noise_threshold_provider", egq.b);
   public static final egm<egp> d = a("noise_provider", egp.g);
   public static final egm<egn> e = a("dual_noise_provider", egn.b);
   public static final egm<egs> f = a("rotated_block_provider", egs.b);
   public static final egm<egr> g = a("randomized_int_state_provider", egr.b);
   private final Codec<P> h;

   private static <P extends egl> egm<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.V, $$0, new egm<>($$1));
   }

   private egm(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
