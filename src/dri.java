import com.mojang.serialization.Codec;

public interface dri<P extends drh> {
   dri<dqt> a = a("block_predicate_filter", dqt.a);
   dri<drk> b = a("rarity_filter", drk.a);
   dri<drm> c = a("surface_relative_threshold_filter", drm.a);
   dri<drn> d = a("surface_water_depth_filter", drn.a);
   dri<dqs> e = a("biome", dqs.a);
   dri<dqx> f = a("count", dqx.a);
   dri<drc> g = a("noise_based_count", drc.a);
   dri<drd> h = a("noise_threshold_count", drd.a);
   dri<dqw> i = a("count_on_every_layer", dqw.a);
   dri<dqy> j = a("environment_scan", dqy.a);
   dri<dra> k = a("heightmap", dra.a);
   dri<dqz> l = a("height_range", dqz.a);
   dri<drb> m = a("in_square", drb.a);
   dri<drj> n = a("random_offset", drj.a);
   dri<dqu> o = a("carving_mask", dqu.a);

   Codec<P> codec();

   private static <P extends drh> dri<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.V, $$0, () -> $$1);
   }
}
