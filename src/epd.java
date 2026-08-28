import com.mojang.serialization.MapCodec;

public class epd<P extends epc> {
   public static final epd<epl> a = a("simple_state_provider", epl.b);
   public static final epd<epm> b = a("weighted_state_provider", epm.b);
   public static final epd<eph> c = a("noise_threshold_provider", eph.b);
   public static final epd<epg> d = a("noise_provider", epg.g);
   public static final epd<epe> e = a("dual_noise_provider", epe.b);
   public static final epd<epj> f = a("rotated_block_provider", epj.b);
   public static final epd<epi> g = a("randomized_int_state_provider", epi.b);
   private final MapCodec<P> h;

   private static <P extends epc> epd<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.T, $$0, new epd<>($$1));
   }

   private epd(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
