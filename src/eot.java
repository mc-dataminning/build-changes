import com.mojang.serialization.MapCodec;

public class eot<P extends eos> {
   public static final eot<epb> a = a("simple_state_provider", epb.b);
   public static final eot<epc> b = a("weighted_state_provider", epc.b);
   public static final eot<eox> c = a("noise_threshold_provider", eox.b);
   public static final eot<eow> d = a("noise_provider", eow.g);
   public static final eot<eou> e = a("dual_noise_provider", eou.b);
   public static final eot<eoz> f = a("rotated_block_provider", eoz.b);
   public static final eot<eoy> g = a("randomized_int_state_provider", eoy.b);
   private final MapCodec<P> h;

   private static <P extends eos> eot<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.T, $$0, new eot<>($$1));
   }

   private eot(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
