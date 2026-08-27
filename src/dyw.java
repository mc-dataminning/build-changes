import com.mojang.serialization.Codec;

public class dyw<P extends dyv> {
   public static final dyw<dyy> a = a("two_layers_feature_size", dyy.d);
   public static final dyw<dyx> b = a("three_layers_feature_size", dyx.d);
   private final Codec<P> c;

   private static <P extends dyv> dyw<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.aa, $$0, new dyw<>($$1));
   }

   private dyw(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
