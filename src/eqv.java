import com.mojang.serialization.MapCodec;

public interface eqv<P extends equ> {
   eqv<eqt> a = a("constant", eqt.b);
   eqv<eqx> b = a("uniform", eqx.a);
   eqv<eqs> c = a("biased_to_bottom", eqs.a);
   eqv<eqy> d = a("very_biased_to_bottom", eqy.a);
   eqv<eqw> e = a("trapezoid", eqw.a);
   eqv<eqz> f = a("weighted_list", eqz.a);

   MapCodec<P> codec();

   private static <P extends equ> eqv<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.L, $$0, () -> $$1);
   }
}
