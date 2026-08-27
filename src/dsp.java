import com.mojang.serialization.Codec;

public class dsp<P extends dso> {
   public static final dsp<dsr> a = a("two_layers_feature_size", dsr.d);
   public static final dsp<dsq> b = a("three_layers_feature_size", dsq.d);
   private final Codec<P> c;

   private static <P extends dso> dsp<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.ab, $$0, new dsp<>($$1));
   }

   private dsp(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
