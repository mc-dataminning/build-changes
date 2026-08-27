import com.mojang.serialization.Codec;

public class drt<P extends drs> {
   public static final drt<dsb> a = a("simple_state_provider", dsb.b);
   public static final drt<dsc> b = a("weighted_state_provider", dsc.b);
   public static final drt<drx> c = a("noise_threshold_provider", drx.b);
   public static final drt<drw> d = a("noise_provider", drw.g);
   public static final drt<dru> e = a("dual_noise_provider", dru.b);
   public static final drt<drz> f = a("rotated_block_provider", drz.b);
   public static final drt<dry> g = a("randomized_int_state_provider", dry.b);
   private final Codec<P> h;

   private static <P extends drs> drt<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.W, $$0, new drt<>($$1));
   }

   private drt(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
