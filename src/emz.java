import com.mojang.serialization.MapCodec;

public class emz<P extends emy> {
   public static final emz<enh> a = a("simple_state_provider", enh.b);
   public static final emz<eni> b = a("weighted_state_provider", eni.b);
   public static final emz<end> c = a("noise_threshold_provider", end.b);
   public static final emz<enc> d = a("noise_provider", enc.g);
   public static final emz<ena> e = a("dual_noise_provider", ena.b);
   public static final emz<enf> f = a("rotated_block_provider", enf.b);
   public static final emz<ene> g = a("randomized_int_state_provider", ene.b);
   private final MapCodec<P> h;

   private static <P extends emy> emz<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.T, $$0, new emz<>($$1));
   }

   private emz(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
