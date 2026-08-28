import com.mojang.serialization.MapCodec;

public class efe<P extends efd> {
   public static final efe<efm> a = a("simple_state_provider", efm.b);
   public static final efe<efn> b = a("weighted_state_provider", efn.b);
   public static final efe<efi> c = a("noise_threshold_provider", efi.b);
   public static final efe<efh> d = a("noise_provider", efh.g);
   public static final efe<eff> e = a("dual_noise_provider", eff.b);
   public static final efe<efk> f = a("rotated_block_provider", efk.b);
   public static final efe<efj> g = a("randomized_int_state_provider", efj.b);
   private final MapCodec<P> h;

   private static <P extends efd> efe<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.V, $$0, new efe<>($$1));
   }

   private efe(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
