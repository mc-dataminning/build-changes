import com.mojang.serialization.MapCodec;

public class eil<P extends eik> {
   public static final eil<eit> a = a("simple_state_provider", eit.b);
   public static final eil<eiu> b = a("weighted_state_provider", eiu.b);
   public static final eil<eip> c = a("noise_threshold_provider", eip.b);
   public static final eil<eio> d = a("noise_provider", eio.g);
   public static final eil<eim> e = a("dual_noise_provider", eim.b);
   public static final eil<eir> f = a("rotated_block_provider", eir.b);
   public static final eil<eiq> g = a("randomized_int_state_provider", eiq.b);
   private final MapCodec<P> h;

   private static <P extends eik> eil<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.T, $$0, new eil<>($$1));
   }

   private eil(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
