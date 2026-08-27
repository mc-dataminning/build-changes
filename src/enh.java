import com.mojang.serialization.Codec;

public interface enh<P extends eng> {
   enh<enf> a = a("always_true", enf.a);
   enh<end> b = a("linear_pos", end.a);
   enh<ems> c = a("axis_aligned_linear_pos", ems.a);

   Codec<P> codec();

   static <P extends eng> enh<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.q, $$0, () -> $$1);
   }
}
