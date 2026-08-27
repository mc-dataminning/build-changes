import com.mojang.serialization.Codec;

public class efm<P extends efl> {
   public static final efm<efo> a = a("two_layers_feature_size", efo.d);
   public static final efm<efn> b = a("three_layers_feature_size", efn.d);
   private final Codec<P> c;

   private static <P extends efl> efm<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.aa, $$0, new efm<>($$1));
   }

   private efm(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
