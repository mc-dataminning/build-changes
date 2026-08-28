import com.mojang.serialization.MapCodec;

public interface eqj<P extends eqi> {
   eqj<eqh> a = a("constant", eqh.b);
   eqj<eql> b = a("uniform", eql.a);
   eqj<eqg> c = a("biased_to_bottom", eqg.a);
   eqj<eqm> d = a("very_biased_to_bottom", eqm.a);
   eqj<eqk> e = a("trapezoid", eqk.a);
   eqj<eqn> f = a("weighted_list", eqn.a);

   MapCodec<P> codec();

   private static <P extends eqi> eqj<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.L, $$0, () -> $$1);
   }
}
