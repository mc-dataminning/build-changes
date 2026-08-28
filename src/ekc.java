import com.mojang.serialization.MapCodec;

public class ekc<P extends ekb> {
   public static final ekc<ekk> a = a("simple_state_provider", ekk.b);
   public static final ekc<ekl> b = a("weighted_state_provider", ekl.b);
   public static final ekc<ekg> c = a("noise_threshold_provider", ekg.b);
   public static final ekc<ekf> d = a("noise_provider", ekf.g);
   public static final ekc<ekd> e = a("dual_noise_provider", ekd.b);
   public static final ekc<eki> f = a("rotated_block_provider", eki.b);
   public static final ekc<ekh> g = a("randomized_int_state_provider", ekh.b);
   private final MapCodec<P> h;

   private static <P extends ekb> ekc<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.T, $$0, new ekc<>($$1));
   }

   private ekc(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
