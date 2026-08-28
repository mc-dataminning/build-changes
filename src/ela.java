import com.mojang.serialization.MapCodec;

public class ela<P extends ekz> {
   public static final ela<eli> a = a("simple_state_provider", eli.b);
   public static final ela<elj> b = a("weighted_state_provider", elj.b);
   public static final ela<ele> c = a("noise_threshold_provider", ele.b);
   public static final ela<eld> d = a("noise_provider", eld.g);
   public static final ela<elb> e = a("dual_noise_provider", elb.b);
   public static final ela<elg> f = a("rotated_block_provider", elg.b);
   public static final ela<elf> g = a("randomized_int_state_provider", elf.b);
   private final MapCodec<P> h;

   private static <P extends ekz> ela<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.T, $$0, new ela<>($$1));
   }

   private ela(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
