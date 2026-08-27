import com.mojang.serialization.Codec;

public class dqr<P extends dqq> {
   public static final dqr<dqt> a = a("two_layers_feature_size", dqt.d);
   public static final dqr<dqs> b = a("three_layers_feature_size", dqs.d);
   private final Codec<P> c;

   private static <P extends dqq> dqr<P> a(String $$0, Codec<P> $$1) {
      return hs.a(jc.ab, $$0, new dqr<>($$1));
   }

   private dqr(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
