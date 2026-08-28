import com.mojang.serialization.MapCodec;

public class ekf<P extends eke> {
   public static final ekf<ekn> a = a("simple_state_provider", ekn.b);
   public static final ekf<eko> b = a("weighted_state_provider", eko.b);
   public static final ekf<ekj> c = a("noise_threshold_provider", ekj.b);
   public static final ekf<eki> d = a("noise_provider", eki.g);
   public static final ekf<ekg> e = a("dual_noise_provider", ekg.b);
   public static final ekf<ekl> f = a("rotated_block_provider", ekl.b);
   public static final ekf<ekk> g = a("randomized_int_state_provider", ekk.b);
   private final MapCodec<P> h;

   private static <P extends eke> ekf<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.T, $$0, new ekf<>($$1));
   }

   private ekf(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
