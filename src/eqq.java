import com.mojang.serialization.MapCodec;

public interface eqq<P extends eqp> {
   eqq<eqb> a = a("block_predicate_filter", eqb.a);
   eqq<eqs> b = a("rarity_filter", eqs.a);
   eqq<equ> c = a("surface_relative_threshold_filter", equ.a);
   eqq<eqv> d = a("surface_water_depth_filter", eqv.a);
   eqq<eqa> e = a("biome", eqa.a);
   eqq<eqe> f = a("count", eqe.a);
   eqq<eqk> g = a("noise_based_count", eqk.a);
   eqq<eql> h = a("noise_threshold_count", eql.a);
   eqq<eqd> i = a("count_on_every_layer", eqd.a);
   eqq<eqf> j = a("environment_scan", eqf.a);
   eqq<eqi> k = a("heightmap", eqi.a);
   eqq<eqh> l = a("height_range", eqh.a);
   eqq<eqj> m = a("in_square", eqj.a);
   eqq<eqr> n = a("random_offset", eqr.a);
   eqq<eqg> o = a("fixed_placement", eqg.a);

   MapCodec<P> codec();

   private static <P extends eqp> eqq<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.S, $$0, () -> $$1);
   }
}
