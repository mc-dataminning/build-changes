import com.mojang.serialization.Codec;

public class eca<P extends ebz> {
   public static final eca<ecc> a = a("two_layers_feature_size", ecc.d);
   public static final eca<ecb> b = a("three_layers_feature_size", ecb.d);
   private final Codec<P> c;

   private static <P extends ebz> eca<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.aa, $$0, new eca<>($$1));
   }

   private eca(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
