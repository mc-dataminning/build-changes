import com.mojang.serialization.MapCodec;

public interface elz<P extends ely> {
   elz<elx> a = a("always_true", elx.a);
   elz<elv> b = a("linear_pos", elv.a);
   elz<elk> c = a("axis_aligned_linear_pos", elk.a);

   MapCodec<P> codec();

   static <P extends ely> elz<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.q, $$0, () -> $$1);
   }
}
