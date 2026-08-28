import com.mojang.serialization.MapCodec;

public class enz<P extends eny> {
   public static final enz<eoh> a = a("simple_state_provider", eoh.b);
   public static final enz<eoi> b = a("weighted_state_provider", eoi.b);
   public static final enz<eod> c = a("noise_threshold_provider", eod.b);
   public static final enz<eoc> d = a("noise_provider", eoc.g);
   public static final enz<eoa> e = a("dual_noise_provider", eoa.b);
   public static final enz<eof> f = a("rotated_block_provider", eof.b);
   public static final enz<eoe> g = a("randomized_int_state_provider", eoe.b);
   private final MapCodec<P> h;

   private static <P extends eny> enz<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.T, $$0, new enz<>($$1));
   }

   private enz(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
