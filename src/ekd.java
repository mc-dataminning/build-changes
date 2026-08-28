import com.mojang.serialization.MapCodec;

public class ekd<P extends ekc> {
   public static final ekd<ekl> a = a("simple_state_provider", ekl.b);
   public static final ekd<ekm> b = a("weighted_state_provider", ekm.b);
   public static final ekd<ekh> c = a("noise_threshold_provider", ekh.b);
   public static final ekd<ekg> d = a("noise_provider", ekg.g);
   public static final ekd<eke> e = a("dual_noise_provider", eke.b);
   public static final ekd<ekj> f = a("rotated_block_provider", ekj.b);
   public static final ekd<eki> g = a("randomized_int_state_provider", eki.b);
   private final MapCodec<P> h;

   private static <P extends ekc> ekd<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.T, $$0, new ekd<>($$1));
   }

   private ekd(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
