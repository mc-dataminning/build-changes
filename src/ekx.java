import com.mojang.serialization.MapCodec;

public interface ekx<P extends ekw> {
   ekx<ekv> a = a("always_true", ekv.a);
   ekx<ekt> b = a("linear_pos", ekt.a);
   ekx<eki> c = a("axis_aligned_linear_pos", eki.a);

   MapCodec<P> codec();

   static <P extends ekw> ekx<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.q, $$0, () -> $$1);
   }
}
