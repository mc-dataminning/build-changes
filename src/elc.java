import com.mojang.serialization.MapCodec;

public class elc<P extends elb> {
   public static final elc<elk> a = a("simple_state_provider", elk.b);
   public static final elc<ell> b = a("weighted_state_provider", ell.b);
   public static final elc<elg> c = a("noise_threshold_provider", elg.b);
   public static final elc<elf> d = a("noise_provider", elf.g);
   public static final elc<eld> e = a("dual_noise_provider", eld.b);
   public static final elc<eli> f = a("rotated_block_provider", eli.b);
   public static final elc<elh> g = a("randomized_int_state_provider", elh.b);
   private final MapCodec<P> h;

   private static <P extends elb> elc<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.T, $$0, new elc<>($$1));
   }

   private elc(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
