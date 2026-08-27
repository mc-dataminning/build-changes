import com.mojang.serialization.Codec;

public interface dyw<P extends dyv> {
   dyw<dyh> a = a("block_predicate_filter", dyh.a);
   dyw<dyy> b = a("rarity_filter", dyy.a);
   dyw<dza> c = a("surface_relative_threshold_filter", dza.a);
   dyw<dzb> d = a("surface_water_depth_filter", dzb.a);
   dyw<dyg> e = a("biome", dyg.a);
   dyw<dyl> f = a("count", dyl.a);
   dyw<dyq> g = a("noise_based_count", dyq.a);
   dyw<dyr> h = a("noise_threshold_count", dyr.a);
   dyw<dyk> i = a("count_on_every_layer", dyk.a);
   dyw<dym> j = a("environment_scan", dym.a);
   dyw<dyo> k = a("heightmap", dyo.a);
   dyw<dyn> l = a("height_range", dyn.a);
   dyw<dyp> m = a("in_square", dyp.a);
   dyw<dyx> n = a("random_offset", dyx.a);
   dyw<dyi> o = a("carving_mask", dyi.a);

   Codec<P> codec();

   private static <P extends dyv> dyw<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.U, $$0, () -> $$1);
   }
}
