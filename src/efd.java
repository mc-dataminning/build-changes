import com.mojang.serialization.MapCodec;

public class efd<P extends efc> {
   public static final efd<efl> a = a("simple_state_provider", efl.b);
   public static final efd<efm> b = a("weighted_state_provider", efm.b);
   public static final efd<efh> c = a("noise_threshold_provider", efh.b);
   public static final efd<efg> d = a("noise_provider", efg.g);
   public static final efd<efe> e = a("dual_noise_provider", efe.b);
   public static final efd<efj> f = a("rotated_block_provider", efj.b);
   public static final efd<efi> g = a("randomized_int_state_provider", efi.b);
   private final MapCodec<P> h;

   private static <P extends efc> efd<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.V, $$0, new efd<>($$1));
   }

   private efd(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
