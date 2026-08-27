import com.mojang.serialization.Codec;

public class dse<P extends dsd> {
   public static final dse<dsm> a = a("simple_state_provider", dsm.b);
   public static final dse<dsn> b = a("weighted_state_provider", dsn.b);
   public static final dse<dsi> c = a("noise_threshold_provider", dsi.b);
   public static final dse<dsh> d = a("noise_provider", dsh.g);
   public static final dse<dsf> e = a("dual_noise_provider", dsf.b);
   public static final dse<dsk> f = a("rotated_block_provider", dsk.b);
   public static final dse<dsj> g = a("randomized_int_state_provider", dsj.b);
   private final Codec<P> h;

   private static <P extends dsd> dse<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.W, $$0, new dse<>($$1));
   }

   private dse(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
