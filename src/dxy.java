import com.mojang.serialization.Codec;

public class dxy<P extends dxx> {
   public static final dxy<dyg> a = a("simple_state_provider", dyg.b);
   public static final dxy<dyh> b = a("weighted_state_provider", dyh.b);
   public static final dxy<dyc> c = a("noise_threshold_provider", dyc.b);
   public static final dxy<dyb> d = a("noise_provider", dyb.g);
   public static final dxy<dxz> e = a("dual_noise_provider", dxz.b);
   public static final dxy<dye> f = a("rotated_block_provider", dye.b);
   public static final dxy<dyd> g = a("randomized_int_state_provider", dyd.b);
   private final Codec<P> h;

   private static <P extends dxx> dxy<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.V, $$0, new dxy<>($$1));
   }

   private dxy(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
