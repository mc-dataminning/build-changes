import com.mojang.serialization.MapCodec;

public interface eqj<P extends eqi> {
   eqj<epu> a = a("block_predicate_filter", epu.a);
   eqj<eql> b = a("rarity_filter", eql.a);
   eqj<eqn> c = a("surface_relative_threshold_filter", eqn.a);
   eqj<eqo> d = a("surface_water_depth_filter", eqo.a);
   eqj<ept> e = a("biome", ept.a);
   eqj<epx> f = a("count", epx.a);
   eqj<eqd> g = a("noise_based_count", eqd.a);
   eqj<eqe> h = a("noise_threshold_count", eqe.a);
   eqj<epw> i = a("count_on_every_layer", epw.a);
   eqj<epy> j = a("environment_scan", epy.a);
   eqj<eqb> k = a("heightmap", eqb.a);
   eqj<eqa> l = a("height_range", eqa.a);
   eqj<eqc> m = a("in_square", eqc.a);
   eqj<eqk> n = a("random_offset", eqk.a);
   eqj<epz> o = a("fixed_placement", epz.a);

   MapCodec<P> codec();

   private static <P extends eqi> eqj<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.S, $$0, () -> $$1);
   }
}
