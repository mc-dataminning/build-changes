import com.mojang.serialization.MapCodec;

public class ehw<P extends ehv> {
   public static final ehw<eie> a = a("simple_state_provider", eie.b);
   public static final ehw<eif> b = a("weighted_state_provider", eif.b);
   public static final ehw<eia> c = a("noise_threshold_provider", eia.b);
   public static final ehw<ehz> d = a("noise_provider", ehz.g);
   public static final ehw<ehx> e = a("dual_noise_provider", ehx.b);
   public static final ehw<eic> f = a("rotated_block_provider", eic.b);
   public static final ehw<eib> g = a("randomized_int_state_provider", eib.b);
   private final MapCodec<P> h;

   private static <P extends ehv> ehw<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.T, $$0, new ehw<>($$1));
   }

   private ehw(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
