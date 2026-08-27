import com.mojang.serialization.Codec;

public class dtg<P extends dtf> {
   public static final dtg<dti> a = a("two_layers_feature_size", dti.d);
   public static final dtg<dth> b = a("three_layers_feature_size", dth.d);
   private final Codec<P> c;

   private static <P extends dtf> dtg<P> a(String $$0, Codec<P> $$1) {
      return is.a(kc.ab, $$0, new dtg<>($$1));
   }

   private dtg(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
