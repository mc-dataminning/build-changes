import com.mojang.serialization.Codec;

public class duz<P extends duy> {
   public static final duz<dvb> a = a("two_layers_feature_size", dvb.d);
   public static final duz<dva> b = a("three_layers_feature_size", dva.d);
   private final Codec<P> c;

   private static <P extends duy> duz<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.aa, $$0, new duz<>($$1));
   }

   private duz(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
