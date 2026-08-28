import com.mojang.serialization.MapCodec;

public class eia<P extends ehz> {
   public static final eia<eii> a = a("simple_state_provider", eii.b);
   public static final eia<eij> b = a("weighted_state_provider", eij.b);
   public static final eia<eie> c = a("noise_threshold_provider", eie.b);
   public static final eia<eid> d = a("noise_provider", eid.g);
   public static final eia<eib> e = a("dual_noise_provider", eib.b);
   public static final eia<eig> f = a("rotated_block_provider", eig.b);
   public static final eia<eif> g = a("randomized_int_state_provider", eif.b);
   private final MapCodec<P> h;

   private static <P extends ehz> eia<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.T, $$0, new eia<>($$1));
   }

   private eia(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
