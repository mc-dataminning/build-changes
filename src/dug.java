import com.mojang.serialization.Codec;

public class dug<P extends duf> {
   public static final dug<duo> a = a("simple_state_provider", duo.b);
   public static final dug<dup> b = a("weighted_state_provider", dup.b);
   public static final dug<duk> c = a("noise_threshold_provider", duk.b);
   public static final dug<duj> d = a("noise_provider", duj.g);
   public static final dug<duh> e = a("dual_noise_provider", duh.b);
   public static final dug<dum> f = a("rotated_block_provider", dum.b);
   public static final dug<dul> g = a("randomized_int_state_provider", dul.b);
   private final Codec<P> h;

   private static <P extends duf> dug<P> a(String $$0, Codec<P> $$1) {
      return is.a(kc.W, $$0, new dug<>($$1));
   }

   private dug(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
