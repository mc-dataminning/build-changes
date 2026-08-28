import com.mojang.serialization.MapCodec;

public class efc<P extends efb> {
   public static final efc<efk> a = a("simple_state_provider", efk.b);
   public static final efc<efl> b = a("weighted_state_provider", efl.b);
   public static final efc<efg> c = a("noise_threshold_provider", efg.b);
   public static final efc<eff> d = a("noise_provider", eff.g);
   public static final efc<efd> e = a("dual_noise_provider", efd.b);
   public static final efc<efi> f = a("rotated_block_provider", efi.b);
   public static final efc<efh> g = a("randomized_int_state_provider", efh.b);
   private final MapCodec<P> h;

   private static <P extends efb> efc<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.V, $$0, new efc<>($$1));
   }

   private efc(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
