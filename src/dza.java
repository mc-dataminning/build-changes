import com.mojang.serialization.Codec;

public class dza<P extends dyz> {
   public static final dza<dzi> a = a("simple_state_provider", dzi.b);
   public static final dza<dzj> b = a("weighted_state_provider", dzj.b);
   public static final dza<dze> c = a("noise_threshold_provider", dze.b);
   public static final dza<dzd> d = a("noise_provider", dzd.g);
   public static final dza<dzb> e = a("dual_noise_provider", dzb.b);
   public static final dza<dzg> f = a("rotated_block_provider", dzg.b);
   public static final dza<dzf> g = a("randomized_int_state_provider", dzf.b);
   private final Codec<P> h;

   private static <P extends dyz> dza<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.V, $$0, new dza<>($$1));
   }

   private dza(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
