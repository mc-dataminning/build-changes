import com.mojang.serialization.MapCodec;

public class eor<P extends eoq> {
   public static final eor<eoz> a = a("simple_state_provider", eoz.b);
   public static final eor<epa> b = a("weighted_state_provider", epa.b);
   public static final eor<eov> c = a("noise_threshold_provider", eov.b);
   public static final eor<eou> d = a("noise_provider", eou.g);
   public static final eor<eos> e = a("dual_noise_provider", eos.b);
   public static final eor<eox> f = a("rotated_block_provider", eox.b);
   public static final eor<eow> g = a("randomized_int_state_provider", eow.b);
   private final MapCodec<P> h;

   private static <P extends eoq> eor<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.T, $$0, new eor<>($$1));
   }

   private eor(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
