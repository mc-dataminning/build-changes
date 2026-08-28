import com.mojang.serialization.MapCodec;

public interface eqv<P extends equ> {
   eqv<eqg> a = a("block_predicate_filter", eqg.a);
   eqv<eqx> b = a("rarity_filter", eqx.a);
   eqv<eqz> c = a("surface_relative_threshold_filter", eqz.a);
   eqv<era> d = a("surface_water_depth_filter", era.a);
   eqv<eqf> e = a("biome", eqf.a);
   eqv<eqj> f = a("count", eqj.a);
   eqv<eqp> g = a("noise_based_count", eqp.a);
   eqv<eqq> h = a("noise_threshold_count", eqq.a);
   eqv<eqi> i = a("count_on_every_layer", eqi.a);
   eqv<eqk> j = a("environment_scan", eqk.a);
   eqv<eqn> k = a("heightmap", eqn.a);
   eqv<eqm> l = a("height_range", eqm.a);
   eqv<eqo> m = a("in_square", eqo.a);
   eqv<eqw> n = a("random_offset", eqw.a);
   eqv<eql> o = a("fixed_placement", eql.a);

   MapCodec<P> codec();

   private static <P extends equ> eqv<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.S, $$0, () -> $$1);
   }
}
