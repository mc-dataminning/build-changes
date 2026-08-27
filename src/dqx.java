import com.mojang.serialization.Codec;

public class dqx<P extends dqw> {
   public static final dqx<dqz> a = a("two_layers_feature_size", dqz.d);
   public static final dqx<dqy> b = a("three_layers_feature_size", dqy.d);
   private final Codec<P> c;

   private static <P extends dqw> dqx<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.ab, $$0, new dqx<>($$1));
   }

   private dqx(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
