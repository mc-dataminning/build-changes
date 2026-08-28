import com.mojang.serialization.MapCodec;

public class eiv<P extends eiu> {
   public static final eiv<ejd> a = a("simple_state_provider", ejd.b);
   public static final eiv<eje> b = a("weighted_state_provider", eje.b);
   public static final eiv<eiz> c = a("noise_threshold_provider", eiz.b);
   public static final eiv<eiy> d = a("noise_provider", eiy.g);
   public static final eiv<eiw> e = a("dual_noise_provider", eiw.b);
   public static final eiv<ejb> f = a("rotated_block_provider", ejb.b);
   public static final eiv<eja> g = a("randomized_int_state_provider", eja.b);
   private final MapCodec<P> h;

   private static <P extends eiu> eiv<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.T, $$0, new eiv<>($$1));
   }

   private eiv(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
