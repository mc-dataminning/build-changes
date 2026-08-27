import com.mojang.serialization.Codec;

public class drr<P extends drq> {
   public static final drr<drz> a = a("simple_state_provider", drz.b);
   public static final drr<dsa> b = a("weighted_state_provider", dsa.b);
   public static final drr<drv> c = a("noise_threshold_provider", drv.b);
   public static final drr<dru> d = a("noise_provider", dru.g);
   public static final drr<drs> e = a("dual_noise_provider", drs.b);
   public static final drr<drx> f = a("rotated_block_provider", drx.b);
   public static final drr<drw> g = a("randomized_int_state_provider", drw.b);
   private final Codec<P> h;

   private static <P extends drq> drr<P> a(String $$0, Codec<P> $$1) {
      return hs.a(jc.W, $$0, new drr<>($$1));
   }

   private drr(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
