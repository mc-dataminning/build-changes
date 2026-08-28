import com.mojang.serialization.MapCodec;

public interface erb<P extends era> {
   erb<eqz> a = a("always_true", eqz.a);
   erb<eqw> b = a("linear_pos", eqw.a);
   erb<eql> c = a("axis_aligned_linear_pos", eql.a);

   MapCodec<P> codec();

   static <P extends era> erb<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.o, $$0, () -> $$1);
   }
}
