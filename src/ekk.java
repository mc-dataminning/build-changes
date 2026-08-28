import com.mojang.serialization.MapCodec;

public interface ekk<P extends ekj> {
   ekk<ejv> a = a("block_predicate_filter", ejv.a);
   ekk<ekm> b = a("rarity_filter", ekm.a);
   ekk<eko> c = a("surface_relative_threshold_filter", eko.a);
   ekk<ekp> d = a("surface_water_depth_filter", ekp.a);
   ekk<eju> e = a("biome", eju.a);
   ekk<ejy> f = a("count", ejy.a);
   ekk<eke> g = a("noise_based_count", eke.a);
   ekk<ekf> h = a("noise_threshold_count", ekf.a);
   ekk<ejx> i = a("count_on_every_layer", ejx.a);
   ekk<ejz> j = a("environment_scan", ejz.a);
   ekk<ekc> k = a("heightmap", ekc.a);
   ekk<ekb> l = a("height_range", ekb.a);
   ekk<ekd> m = a("in_square", ekd.a);
   ekk<ekl> n = a("random_offset", ekl.a);
   ekk<eka> o = a("fixed_placement", eka.a);

   MapCodec<P> codec();

   private static <P extends ekj> ekk<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.S, $$0, () -> $$1);
   }
}
