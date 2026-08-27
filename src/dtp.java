import com.mojang.serialization.Codec;

public class dtp<P extends dto> {
   public static final dtp<dtx> a = a("simple_state_provider", dtx.b);
   public static final dtp<dty> b = a("weighted_state_provider", dty.b);
   public static final dtp<dtt> c = a("noise_threshold_provider", dtt.b);
   public static final dtp<dts> d = a("noise_provider", dts.g);
   public static final dtp<dtq> e = a("dual_noise_provider", dtq.b);
   public static final dtp<dtv> f = a("rotated_block_provider", dtv.b);
   public static final dtp<dtu> g = a("randomized_int_state_provider", dtu.b);
   private final Codec<P> h;

   private static <P extends dto> dtp<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.W, $$0, new dtp<>($$1));
   }

   private dtp(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
