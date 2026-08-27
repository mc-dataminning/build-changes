import com.mojang.serialization.Codec;

public class drw<P extends drv> {
   public static final drw<dse> a = a("simple_state_provider", dse.b);
   public static final drw<dsf> b = a("weighted_state_provider", dsf.b);
   public static final drw<dsa> c = a("noise_threshold_provider", dsa.b);
   public static final drw<drz> d = a("noise_provider", drz.g);
   public static final drw<drx> e = a("dual_noise_provider", drx.b);
   public static final drw<dsc> f = a("rotated_block_provider", dsc.b);
   public static final drw<dsb> g = a("randomized_int_state_provider", dsb.b);
   private final Codec<P> h;

   private static <P extends drv> drw<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.W, $$0, new drw<>($$1));
   }

   private drw(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
