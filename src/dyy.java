import com.mojang.serialization.Codec;

public class dyy<P extends dyx> {
   public static final dyy<dza> a = a("two_layers_feature_size", dza.d);
   public static final dyy<dyz> b = a("three_layers_feature_size", dyz.d);
   private final Codec<P> c;

   private static <P extends dyx> dyy<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.aa, $$0, new dyy<>($$1));
   }

   private dyy(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
