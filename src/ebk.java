import com.mojang.serialization.Codec;

public class ebk<P extends ebj> {
   public static final ebk<ebm> a = a("two_layers_feature_size", ebm.d);
   public static final ebk<ebl> b = a("three_layers_feature_size", ebl.d);
   private final Codec<P> c;

   private static <P extends ebj> ebk<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.aa, $$0, new ebk<>($$1));
   }

   private ebk(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
