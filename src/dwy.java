import com.mojang.serialization.Codec;

public class dwy<P extends dwx> {
   public static final dwy<dxa> a = a("two_layers_feature_size", dxa.d);
   public static final dwy<dwz> b = a("three_layers_feature_size", dwz.d);
   private final Codec<P> c;

   private static <P extends dwx> dwy<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.aa, $$0, new dwy<>($$1));
   }

   private dwy(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
