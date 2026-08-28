import com.mojang.serialization.MapCodec;

public interface eqp<P extends eqo> {
   eqp<eqn> a = a("single_pool_element", eqn.b);
   eqp<eqm> b = a("list_pool_element", eqm.a);
   eqp<eqi> c = a("feature_pool_element", eqi.a);
   eqp<eqh> d = a("empty_pool_element", eqh.a);
   eqp<eql> e = a("legacy_single_pool_element", eql.a);

   MapCodec<P> codec();

   static <P extends eqo> eqp<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.ag, $$0, () -> $$1);
   }
}
