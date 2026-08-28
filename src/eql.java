import com.mojang.serialization.MapCodec;

public interface eql<P extends eqk> {
   eql<eqj> a = a("constant", eqj.b);
   eql<eqn> b = a("uniform", eqn.a);
   eql<eqi> c = a("biased_to_bottom", eqi.a);
   eql<eqo> d = a("very_biased_to_bottom", eqo.a);
   eql<eqm> e = a("trapezoid", eqm.a);
   eql<eqp> f = a("weighted_list", eqp.a);

   MapCodec<P> codec();

   private static <P extends eqk> eql<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.L, $$0, () -> $$1);
   }
}
