import com.mojang.serialization.MapCodec;

public class eir<P extends eiq> {
   public static final eir<eiz> a = a("simple_state_provider", eiz.b);
   public static final eir<eja> b = a("weighted_state_provider", eja.b);
   public static final eir<eiv> c = a("noise_threshold_provider", eiv.b);
   public static final eir<eiu> d = a("noise_provider", eiu.g);
   public static final eir<eis> e = a("dual_noise_provider", eis.b);
   public static final eir<eix> f = a("rotated_block_provider", eix.b);
   public static final eir<eiw> g = a("randomized_int_state_provider", eiw.b);
   private final MapCodec<P> h;

   private static <P extends eiq> eir<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.T, $$0, new eir<>($$1));
   }

   private eir(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
