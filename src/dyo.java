import com.mojang.serialization.Codec;

public interface dyo<P extends dyn> {
   dyo<dxz> a = a("block_predicate_filter", dxz.a);
   dyo<dyq> b = a("rarity_filter", dyq.a);
   dyo<dys> c = a("surface_relative_threshold_filter", dys.a);
   dyo<dyt> d = a("surface_water_depth_filter", dyt.a);
   dyo<dxy> e = a("biome", dxy.a);
   dyo<dyd> f = a("count", dyd.a);
   dyo<dyi> g = a("noise_based_count", dyi.a);
   dyo<dyj> h = a("noise_threshold_count", dyj.a);
   dyo<dyc> i = a("count_on_every_layer", dyc.a);
   dyo<dye> j = a("environment_scan", dye.a);
   dyo<dyg> k = a("heightmap", dyg.a);
   dyo<dyf> l = a("height_range", dyf.a);
   dyo<dyh> m = a("in_square", dyh.a);
   dyo<dyp> n = a("random_offset", dyp.a);
   dyo<dya> o = a("carving_mask", dya.a);

   Codec<P> codec();

   private static <P extends dyn> dyo<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.U, $$0, () -> $$1);
   }
}
