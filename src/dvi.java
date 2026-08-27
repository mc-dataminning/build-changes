import com.mojang.serialization.Codec;

public class dvi<P extends dvh> {
   public static final dvi<dvq> a = a("simple_state_provider", dvq.b);
   public static final dvi<dvr> b = a("weighted_state_provider", dvr.b);
   public static final dvi<dvm> c = a("noise_threshold_provider", dvm.b);
   public static final dvi<dvl> d = a("noise_provider", dvl.g);
   public static final dvi<dvj> e = a("dual_noise_provider", dvj.b);
   public static final dvi<dvo> f = a("rotated_block_provider", dvo.b);
   public static final dvi<dvn> g = a("randomized_int_state_provider", dvn.b);
   private final Codec<P> h;

   private static <P extends dvh> dvi<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.V, $$0, new dvi<>($$1));
   }

   private dvi(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
