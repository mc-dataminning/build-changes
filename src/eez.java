import com.mojang.serialization.MapCodec;

public class eez<P extends eey> {
   public static final eez<efh> a = a("simple_state_provider", efh.b);
   public static final eez<efi> b = a("weighted_state_provider", efi.b);
   public static final eez<efd> c = a("noise_threshold_provider", efd.b);
   public static final eez<efc> d = a("noise_provider", efc.g);
   public static final eez<efa> e = a("dual_noise_provider", efa.b);
   public static final eez<eff> f = a("rotated_block_provider", eff.b);
   public static final eez<efe> g = a("randomized_int_state_provider", efe.b);
   private final MapCodec<P> h;

   private static <P extends eey> eez<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.V, $$0, new eez<>($$1));
   }

   private eez(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
