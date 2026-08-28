import com.mojang.serialization.MapCodec;

public interface ely<P extends elx> {
   ely<elw> a = a("always_true", elw.a);
   ely<elu> b = a("linear_pos", elu.a);
   ely<elj> c = a("axis_aligned_linear_pos", elj.a);

   MapCodec<P> codec();

   static <P extends elx> ely<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.q, $$0, () -> $$1);
   }
}
