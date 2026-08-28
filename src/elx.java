import com.mojang.serialization.MapCodec;

public class elx<P extends elw> {
   public static final elx<emf> a = a("simple_state_provider", emf.b);
   public static final elx<emg> b = a("weighted_state_provider", emg.b);
   public static final elx<emb> c = a("noise_threshold_provider", emb.b);
   public static final elx<ema> d = a("noise_provider", ema.g);
   public static final elx<ely> e = a("dual_noise_provider", ely.b);
   public static final elx<emd> f = a("rotated_block_provider", emd.b);
   public static final elx<emc> g = a("randomized_int_state_provider", emc.b);
   private final MapCodec<P> h;

   private static <P extends elw> elx<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.T, $$0, new elx<>($$1));
   }

   private elx(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
