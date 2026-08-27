import com.mojang.serialization.Codec;

public interface eju<P extends ejt> {
   eju<ejs> a = a("always_true", ejs.a);
   eju<ejq> b = a("linear_pos", ejq.a);
   eju<ejf> c = a("axis_aligned_linear_pos", ejf.a);

   Codec<P> codec();

   static <P extends ejt> eju<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.q, $$0, () -> $$1);
   }
}
