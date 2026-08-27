import com.mojang.serialization.Codec;

public class dqt<P extends dqs> {
   public static final dqt<dqv> a = a("two_layers_feature_size", dqv.d);
   public static final dqt<dqu> b = a("three_layers_feature_size", dqu.d);
   private final Codec<P> c;

   private static <P extends dqs> dqt<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.ab, $$0, new dqt<>($$1));
   }

   private dqt(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
