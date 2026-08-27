import com.mojang.serialization.Codec;

public class dqs<P extends dqr> {
   public static final dqs<dqu> a = a("two_layers_feature_size", dqu.d);
   public static final dqs<dqt> b = a("three_layers_feature_size", dqt.d);
   private final Codec<P> c;

   private static <P extends dqr> dqs<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.ab, $$0, new dqs<>($$1));
   }

   private dqs(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
