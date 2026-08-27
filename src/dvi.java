import com.mojang.serialization.Codec;

public class dvi<P extends dvh> {
   public static final dvi<dvk> a = a("two_layers_feature_size", dvk.d);
   public static final dvi<dvj> b = a("three_layers_feature_size", dvj.d);
   private final Codec<P> c;

   private static <P extends dvh> dvi<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.aa, $$0, new dvi<>($$1));
   }

   private dvi(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
