import com.mojang.serialization.Codec;

public class ecj<P extends eci> {
   public static final ecj<ecl> a = a("two_layers_feature_size", ecl.d);
   public static final ecj<eck> b = a("three_layers_feature_size", eck.d);
   private final Codec<P> c;

   private static <P extends eci> ecj<P> a(String $$0, Codec<P> $$1) {
      return jj.a(ld.aa, $$0, new ecj<>($$1));
   }

   private ecj(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
