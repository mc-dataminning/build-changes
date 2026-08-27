import com.mojang.serialization.Codec;

public class eck<P extends ecj> {
   public static final eck<ecs> a = a("simple_state_provider", ecs.b);
   public static final eck<ect> b = a("weighted_state_provider", ect.b);
   public static final eck<eco> c = a("noise_threshold_provider", eco.b);
   public static final eck<ecn> d = a("noise_provider", ecn.g);
   public static final eck<ecl> e = a("dual_noise_provider", ecl.b);
   public static final eck<ecq> f = a("rotated_block_provider", ecq.b);
   public static final eck<ecp> g = a("randomized_int_state_provider", ecp.b);
   private final Codec<P> h;

   private static <P extends ecj> eck<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.V, $$0, new eck<>($$1));
   }

   private eck(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
