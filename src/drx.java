import com.mojang.serialization.Codec;

public class drx<P extends drw> {
   public static final drx<dsf> a = a("simple_state_provider", dsf.b);
   public static final drx<dsg> b = a("weighted_state_provider", dsg.b);
   public static final drx<dsb> c = a("noise_threshold_provider", dsb.b);
   public static final drx<dsa> d = a("noise_provider", dsa.g);
   public static final drx<dry> e = a("dual_noise_provider", dry.b);
   public static final drx<dsd> f = a("rotated_block_provider", dsd.b);
   public static final drx<dsc> g = a("randomized_int_state_provider", dsc.b);
   private final Codec<P> h;

   private static <P extends drw> drx<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.W, $$0, new drx<>($$1));
   }

   private drx(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
