import com.mojang.serialization.MapCodec;

public interface elx<P extends elw> {
   elx<elv> a = a("always_true", elv.a);
   elx<elt> b = a("linear_pos", elt.a);
   elx<eli> c = a("axis_aligned_linear_pos", eli.a);

   MapCodec<P> codec();

   static <P extends elw> elx<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.q, $$0, () -> $$1);
   }
}
