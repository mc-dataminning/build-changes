import com.mojang.serialization.MapCodec;

public class ehi<P extends ehh> {
   public static final ehi<ehq> a = a("simple_state_provider", ehq.b);
   public static final ehi<ehr> b = a("weighted_state_provider", ehr.b);
   public static final ehi<ehm> c = a("noise_threshold_provider", ehm.b);
   public static final ehi<ehl> d = a("noise_provider", ehl.g);
   public static final ehi<ehj> e = a("dual_noise_provider", ehj.b);
   public static final ehi<eho> f = a("rotated_block_provider", eho.b);
   public static final ehi<ehn> g = a("randomized_int_state_provider", ehn.b);
   private final MapCodec<P> h;

   private static <P extends ehh> ehi<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.T, $$0, new ehi<>($$1));
   }

   private ehi(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
