import com.mojang.serialization.Codec;

public class dsu<P extends dst> {
   public static final dsu<dtc> a = a("simple_state_provider", dtc.b);
   public static final dsu<dtd> b = a("weighted_state_provider", dtd.b);
   public static final dsu<dsy> c = a("noise_threshold_provider", dsy.b);
   public static final dsu<dsx> d = a("noise_provider", dsx.g);
   public static final dsu<dsv> e = a("dual_noise_provider", dsv.b);
   public static final dsu<dta> f = a("rotated_block_provider", dta.b);
   public static final dsu<dsz> g = a("randomized_int_state_provider", dsz.b);
   private final Codec<P> h;

   private static <P extends dst> dsu<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.W, $$0, new dsu<>($$1));
   }

   private dsu(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
