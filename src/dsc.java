import com.mojang.serialization.Codec;

public class dsc<P extends dsb> {
   public static final dsc<dsk> a = a("simple_state_provider", dsk.b);
   public static final dsc<dsl> b = a("weighted_state_provider", dsl.b);
   public static final dsc<dsg> c = a("noise_threshold_provider", dsg.b);
   public static final dsc<dsf> d = a("noise_provider", dsf.g);
   public static final dsc<dsd> e = a("dual_noise_provider", dsd.b);
   public static final dsc<dsi> f = a("rotated_block_provider", dsi.b);
   public static final dsc<dsh> g = a("randomized_int_state_provider", dsh.b);
   private final Codec<P> h;

   private static <P extends dsb> dsc<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.W, $$0, new dsc<>($$1));
   }

   private dsc(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
