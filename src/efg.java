import com.mojang.serialization.MapCodec;

public class efg<P extends eff> {
   public static final efg<efo> a = a("simple_state_provider", efo.b);
   public static final efg<efp> b = a("weighted_state_provider", efp.b);
   public static final efg<efk> c = a("noise_threshold_provider", efk.b);
   public static final efg<efj> d = a("noise_provider", efj.g);
   public static final efg<efh> e = a("dual_noise_provider", efh.b);
   public static final efg<efm> f = a("rotated_block_provider", efm.b);
   public static final efg<efl> g = a("randomized_int_state_provider", efl.b);
   private final MapCodec<P> h;

   private static <P extends eff> efg<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.V, $$0, new efg<>($$1));
   }

   private efg(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
