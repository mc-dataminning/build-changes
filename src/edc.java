import com.mojang.serialization.Codec;

public interface edc<P extends edb> {
   edc<eda> a = a("always_true", eda.a);
   edc<ecy> b = a("linear_pos", ecy.a);
   edc<ecn> c = a("axis_aligned_linear_pos", ecn.a);

   Codec<P> codec();

   static <P extends edb> edc<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.q, $$0, () -> $$1);
   }
}
