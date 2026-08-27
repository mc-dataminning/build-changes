import com.mojang.serialization.Codec;

public class dzy<P extends dzx> {
   public static final dzy<eag> a = a("simple_state_provider", eag.b);
   public static final dzy<eah> b = a("weighted_state_provider", eah.b);
   public static final dzy<eac> c = a("noise_threshold_provider", eac.b);
   public static final dzy<eab> d = a("noise_provider", eab.g);
   public static final dzy<dzz> e = a("dual_noise_provider", dzz.b);
   public static final dzy<eae> f = a("rotated_block_provider", eae.b);
   public static final dzy<ead> g = a("randomized_int_state_provider", ead.b);
   private final Codec<P> h;

   private static <P extends dzx> dzy<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.V, $$0, new dzy<>($$1));
   }

   private dzy(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
