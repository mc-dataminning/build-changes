import com.mojang.serialization.MapCodec;

public class eff<P extends efe> {
   public static final eff<efn> a = a("simple_state_provider", efn.b);
   public static final eff<efo> b = a("weighted_state_provider", efo.b);
   public static final eff<efj> c = a("noise_threshold_provider", efj.b);
   public static final eff<efi> d = a("noise_provider", efi.g);
   public static final eff<efg> e = a("dual_noise_provider", efg.b);
   public static final eff<efl> f = a("rotated_block_provider", efl.b);
   public static final eff<efk> g = a("randomized_int_state_provider", efk.b);
   private final MapCodec<P> h;

   private static <P extends efe> eff<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.V, $$0, new eff<>($$1));
   }

   private eff(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
