import com.mojang.serialization.MapCodec;

public class eoe<P extends eod> {
   public static final eoe<eom> a = a("simple_state_provider", eom.b);
   public static final eoe<eon> b = a("weighted_state_provider", eon.b);
   public static final eoe<eoi> c = a("noise_threshold_provider", eoi.b);
   public static final eoe<eoh> d = a("noise_provider", eoh.g);
   public static final eoe<eof> e = a("dual_noise_provider", eof.b);
   public static final eoe<eok> f = a("rotated_block_provider", eok.b);
   public static final eoe<eoj> g = a("randomized_int_state_provider", eoj.b);
   private final MapCodec<P> h;

   private static <P extends eod> eoe<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.T, $$0, new eoe<>($$1));
   }

   private eoe(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
