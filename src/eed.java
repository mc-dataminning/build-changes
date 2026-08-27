import com.mojang.serialization.MapCodec;

public class eed<P extends eec> {
   public static final eed<eel> a = a("simple_state_provider", eel.b);
   public static final eed<eem> b = a("weighted_state_provider", eem.b);
   public static final eed<eeh> c = a("noise_threshold_provider", eeh.b);
   public static final eed<eeg> d = a("noise_provider", eeg.g);
   public static final eed<eee> e = a("dual_noise_provider", eee.b);
   public static final eed<eej> f = a("rotated_block_provider", eej.b);
   public static final eed<eei> g = a("randomized_int_state_provider", eei.b);
   private final MapCodec<P> h;

   private static <P extends eec> eed<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.V, $$0, new eed<>($$1));
   }

   private eed(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
