import com.mojang.serialization.Codec;

public class dqw<P extends dqv> {
   public static final dqw<dqy> a = a("two_layers_feature_size", dqy.d);
   public static final dqw<dqx> b = a("three_layers_feature_size", dqx.d);
   private final Codec<P> c;

   private static <P extends dqv> dqw<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.ab, $$0, new dqw<>($$1));
   }

   private dqw(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
