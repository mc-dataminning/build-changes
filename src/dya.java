import com.mojang.serialization.Codec;

public class dya<P extends dxz> {
   public static final dya<dyc> a = a("two_layers_feature_size", dyc.d);
   public static final dya<dyb> b = a("three_layers_feature_size", dyb.d);
   private final Codec<P> c;

   private static <P extends dxz> dya<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.aa, $$0, new dya<>($$1));
   }

   private dya(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
