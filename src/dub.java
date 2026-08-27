import com.mojang.serialization.Codec;

public class dub<P extends dua> {
   public static final dub<duj> a = a("simple_state_provider", duj.b);
   public static final dub<duk> b = a("weighted_state_provider", duk.b);
   public static final dub<duf> c = a("noise_threshold_provider", duf.b);
   public static final dub<due> d = a("noise_provider", due.g);
   public static final dub<duc> e = a("dual_noise_provider", duc.b);
   public static final dub<duh> f = a("rotated_block_provider", duh.b);
   public static final dub<dug> g = a("randomized_int_state_provider", dug.b);
   private final Codec<P> h;

   private static <P extends dua> dub<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.W, $$0, new dub<>($$1));
   }

   private dub(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
