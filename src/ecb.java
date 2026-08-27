import com.mojang.serialization.Codec;

public class ecb<P extends eca> {
   public static final ecb<ecj> a = a("simple_state_provider", ecj.b);
   public static final ecb<eck> b = a("weighted_state_provider", eck.b);
   public static final ecb<ecf> c = a("noise_threshold_provider", ecf.b);
   public static final ecb<ece> d = a("noise_provider", ece.g);
   public static final ecb<ecc> e = a("dual_noise_provider", ecc.b);
   public static final ecb<ech> f = a("rotated_block_provider", ech.b);
   public static final ecb<ecg> g = a("randomized_int_state_provider", ecg.b);
   private final Codec<P> h;

   private static <P extends eca> ecb<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.V, $$0, new ecb<>($$1));
   }

   private ecb(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
