import com.mojang.serialization.MapCodec;

public interface ejw<P extends ejv> {
   ejw<ejh> a = a("block_predicate_filter", ejh.a);
   ejw<ejy> b = a("rarity_filter", ejy.a);
   ejw<eka> c = a("surface_relative_threshold_filter", eka.a);
   ejw<ekb> d = a("surface_water_depth_filter", ekb.a);
   ejw<ejg> e = a("biome", ejg.a);
   ejw<ejk> f = a("count", ejk.a);
   ejw<ejq> g = a("noise_based_count", ejq.a);
   ejw<ejr> h = a("noise_threshold_count", ejr.a);
   ejw<ejj> i = a("count_on_every_layer", ejj.a);
   ejw<ejl> j = a("environment_scan", ejl.a);
   ejw<ejo> k = a("heightmap", ejo.a);
   ejw<ejn> l = a("height_range", ejn.a);
   ejw<ejp> m = a("in_square", ejp.a);
   ejw<ejx> n = a("random_offset", ejx.a);
   ejw<ejm> o = a("fixed_placement", ejm.a);

   MapCodec<P> codec();

   private static <P extends ejv> ejw<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.S, $$0, () -> $$1);
   }
}
