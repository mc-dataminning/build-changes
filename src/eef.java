import com.mojang.serialization.MapCodec;

public class eef<P extends eee> {
   public static final eef<een> a = a("simple_state_provider", een.b);
   public static final eef<eeo> b = a("weighted_state_provider", eeo.b);
   public static final eef<eej> c = a("noise_threshold_provider", eej.b);
   public static final eef<eei> d = a("noise_provider", eei.g);
   public static final eef<eeg> e = a("dual_noise_provider", eeg.b);
   public static final eef<eel> f = a("rotated_block_provider", eel.b);
   public static final eef<eek> g = a("randomized_int_state_provider", eek.b);
   private final MapCodec<P> h;

   private static <P extends eee> eef<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.V, $$0, new eef<>($$1));
   }

   private eef(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
