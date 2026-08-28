import com.mojang.serialization.MapCodec;

public class ekv<P extends eku> {
   public static final ekv<eld> a = a("simple_state_provider", eld.b);
   public static final ekv<ele> b = a("weighted_state_provider", ele.b);
   public static final ekv<ekz> c = a("noise_threshold_provider", ekz.b);
   public static final ekv<eky> d = a("noise_provider", eky.g);
   public static final ekv<ekw> e = a("dual_noise_provider", ekw.b);
   public static final ekv<elb> f = a("rotated_block_provider", elb.b);
   public static final ekv<ela> g = a("randomized_int_state_provider", ela.b);
   private final MapCodec<P> h;

   private static <P extends eku> ekv<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.T, $$0, new ekv<>($$1));
   }

   private ekv(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
