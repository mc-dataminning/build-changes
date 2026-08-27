import com.mojang.serialization.Codec;

public class dre<P extends drd> {
   public static final dre<drg> a = a("two_layers_feature_size", drg.d);
   public static final dre<drf> b = a("three_layers_feature_size", drf.d);
   private final Codec<P> c;

   private static <P extends drd> dre<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.ab, $$0, new dre<>($$1));
   }

   private dre(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
