import com.mojang.serialization.MapCodec;

public class egj<P extends egi> {
   public static final egj<egr> a = a("simple_state_provider", egr.b);
   public static final egj<egs> b = a("weighted_state_provider", egs.b);
   public static final egj<egn> c = a("noise_threshold_provider", egn.b);
   public static final egj<egm> d = a("noise_provider", egm.g);
   public static final egj<egk> e = a("dual_noise_provider", egk.b);
   public static final egj<egp> f = a("rotated_block_provider", egp.b);
   public static final egj<ego> g = a("randomized_int_state_provider", ego.b);
   private final MapCodec<P> h;

   private static <P extends egi> egj<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.T, $$0, new egj<>($$1));
   }

   private egj(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
