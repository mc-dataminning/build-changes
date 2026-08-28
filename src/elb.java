import com.mojang.serialization.MapCodec;

public class elb<P extends ela> {
   public static final elb<elj> a = a("simple_state_provider", elj.b);
   public static final elb<elk> b = a("weighted_state_provider", elk.b);
   public static final elb<elf> c = a("noise_threshold_provider", elf.b);
   public static final elb<ele> d = a("noise_provider", ele.g);
   public static final elb<elc> e = a("dual_noise_provider", elc.b);
   public static final elb<elh> f = a("rotated_block_provider", elh.b);
   public static final elb<elg> g = a("randomized_int_state_provider", elg.b);
   private final MapCodec<P> h;

   private static <P extends ela> elb<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.T, $$0, new elb<>($$1));
   }

   private elb(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
