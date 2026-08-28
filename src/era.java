import com.mojang.serialization.MapCodec;

public interface era<P extends eqz> {
   era<eqy> a = a("always_true", eqy.a);
   era<eqv> b = a("linear_pos", eqv.a);
   era<eqk> c = a("axis_aligned_linear_pos", eqk.a);

   MapCodec<P> codec();

   static <P extends eqz> era<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.o, $$0, () -> $$1);
   }
}
