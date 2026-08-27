import com.mojang.serialization.Codec;

public interface ees<P extends eer> {
   ees<eeq> a = a("always_true", eeq.a);
   ees<eeo> b = a("linear_pos", eeo.a);
   ees<eed> c = a("axis_aligned_linear_pos", eed.a);

   Codec<P> codec();

   static <P extends eer> ees<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.q, $$0, () -> $$1);
   }
}
