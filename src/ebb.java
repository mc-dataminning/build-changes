import com.mojang.serialization.Codec;

public class ebb<P extends eba> {
   public static final ebb<ebd> a = a("two_layers_feature_size", ebd.d);
   public static final ebb<ebc> b = a("three_layers_feature_size", ebc.d);
   private final Codec<P> c;

   private static <P extends eba> ebb<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.aa, $$0, new ebb<>($$1));
   }

   private ebb(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
