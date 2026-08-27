import com.mojang.serialization.Codec;

public class dwi<P extends dwh> {
   public static final dwi<dwq> a = a("simple_state_provider", dwq.b);
   public static final dwi<dwr> b = a("weighted_state_provider", dwr.b);
   public static final dwi<dwm> c = a("noise_threshold_provider", dwm.b);
   public static final dwi<dwl> d = a("noise_provider", dwl.g);
   public static final dwi<dwj> e = a("dual_noise_provider", dwj.b);
   public static final dwi<dwo> f = a("rotated_block_provider", dwo.b);
   public static final dwi<dwn> g = a("randomized_int_state_provider", dwn.b);
   private final Codec<P> h;

   private static <P extends dwh> dwi<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.V, $$0, new dwi<>($$1));
   }

   private dwi(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
