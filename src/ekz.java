import com.mojang.serialization.MapCodec;

public interface ekz<P extends eky> {
   ekz<ekx> a = a("always_true", ekx.a);
   ekz<ekv> b = a("linear_pos", ekv.a);
   ekz<ekk> c = a("axis_aligned_linear_pos", ekk.a);

   MapCodec<P> codec();

   static <P extends eky> ekz<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.q, $$0, () -> $$1);
   }
}
