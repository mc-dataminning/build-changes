import com.mojang.serialization.Codec;

public class drs<P extends drr> {
   public static final drs<dsa> a = a("simple_state_provider", dsa.b);
   public static final drs<dsb> b = a("weighted_state_provider", dsb.b);
   public static final drs<drw> c = a("noise_threshold_provider", drw.b);
   public static final drs<drv> d = a("noise_provider", drv.g);
   public static final drs<drt> e = a("dual_noise_provider", drt.b);
   public static final drs<dry> f = a("rotated_block_provider", dry.b);
   public static final drs<drx> g = a("randomized_int_state_provider", drx.b);
   private final Codec<P> h;

   private static <P extends drr> drs<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.W, $$0, new drs<>($$1));
   }

   private drs(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
