import com.mojang.serialization.Codec;

public class dwa<P extends dvz> {
   public static final dwa<dwi> a = a("simple_state_provider", dwi.b);
   public static final dwa<dwj> b = a("weighted_state_provider", dwj.b);
   public static final dwa<dwe> c = a("noise_threshold_provider", dwe.b);
   public static final dwa<dwd> d = a("noise_provider", dwd.g);
   public static final dwa<dwb> e = a("dual_noise_provider", dwb.b);
   public static final dwa<dwg> f = a("rotated_block_provider", dwg.b);
   public static final dwa<dwf> g = a("randomized_int_state_provider", dwf.b);
   private final Codec<P> h;

   private static <P extends dvz> dwa<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.V, $$0, new dwa<>($$1));
   }

   private dwa(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
