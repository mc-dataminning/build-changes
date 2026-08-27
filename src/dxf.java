import com.mojang.serialization.Codec;

public class dxf<P extends dxe> {
   public static final dxf<dxh> a = a("two_layers_feature_size", dxh.d);
   public static final dxf<dxg> b = a("three_layers_feature_size", dxg.d);
   private final Codec<P> c;

   private static <P extends dxe> dxf<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.aa, $$0, new dxf<>($$1));
   }

   private dxf(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
