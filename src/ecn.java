import com.mojang.serialization.Codec;

public interface ecn<P extends ecm> {
   ecn<ecl> a = a("always_true", ecl.a);
   ecn<ecj> b = a("linear_pos", ecj.a);
   ecn<eby> c = a("axis_aligned_linear_pos", eby.a);

   Codec<P> codec();

   static <P extends ecm> ecn<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.q, $$0, () -> $$1);
   }
}
