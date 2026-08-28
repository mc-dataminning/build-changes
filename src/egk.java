import com.mojang.serialization.MapCodec;

public class egk<P extends egj> {
   public static final egk<egs> a = a("simple_state_provider", egs.b);
   public static final egk<egt> b = a("weighted_state_provider", egt.b);
   public static final egk<ego> c = a("noise_threshold_provider", ego.b);
   public static final egk<egn> d = a("noise_provider", egn.g);
   public static final egk<egl> e = a("dual_noise_provider", egl.b);
   public static final egk<egq> f = a("rotated_block_provider", egq.b);
   public static final egk<egp> g = a("randomized_int_state_provider", egp.b);
   private final MapCodec<P> h;

   private static <P extends egj> egk<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.T, $$0, new egk<>($$1));
   }

   private egk(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
