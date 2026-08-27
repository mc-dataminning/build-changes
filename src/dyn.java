import com.mojang.serialization.Codec;

public interface dyn<P extends dym> {
   dyn<dxy> a = a("block_predicate_filter", dxy.a);
   dyn<dyp> b = a("rarity_filter", dyp.a);
   dyn<dyr> c = a("surface_relative_threshold_filter", dyr.a);
   dyn<dys> d = a("surface_water_depth_filter", dys.a);
   dyn<dxx> e = a("biome", dxx.a);
   dyn<dyc> f = a("count", dyc.a);
   dyn<dyh> g = a("noise_based_count", dyh.a);
   dyn<dyi> h = a("noise_threshold_count", dyi.a);
   dyn<dyb> i = a("count_on_every_layer", dyb.a);
   dyn<dyd> j = a("environment_scan", dyd.a);
   dyn<dyf> k = a("heightmap", dyf.a);
   dyn<dye> l = a("height_range", dye.a);
   dyn<dyg> m = a("in_square", dyg.a);
   dyn<dyo> n = a("random_offset", dyo.a);
   dyn<dxz> o = a("carving_mask", dxz.a);

   Codec<P> codec();

   private static <P extends dym> dyn<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.U, $$0, () -> $$1);
   }
}
