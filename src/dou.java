import com.mojang.serialization.Codec;

public class dou<P extends dot> {
   public static final dou<dpc> a = a("simple_state_provider", dpc.b);
   public static final dou<dpd> b = a("weighted_state_provider", dpd.b);
   public static final dou<doy> c = a("noise_threshold_provider", doy.b);
   public static final dou<dox> d = a("noise_provider", dox.g);
   public static final dou<dov> e = a("dual_noise_provider", dov.b);
   public static final dou<dpa> f = a("rotated_block_provider", dpa.b);
   public static final dou<doz> g = a("randomized_int_state_provider", doz.b);
   private final Codec<P> h;

   private static <P extends dot> dou<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.W, $$0, new dou<>($$1));
   }

   private dou(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
