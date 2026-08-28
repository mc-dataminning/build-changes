import com.mojang.serialization.MapCodec;

public interface ekz<P extends eky> {
   ekz<ekk> a = a("block_predicate_filter", ekk.a);
   ekz<elb> b = a("rarity_filter", elb.a);
   ekz<eld> c = a("surface_relative_threshold_filter", eld.a);
   ekz<ele> d = a("surface_water_depth_filter", ele.a);
   ekz<ekj> e = a("biome", ekj.a);
   ekz<ekn> f = a("count", ekn.a);
   ekz<ekt> g = a("noise_based_count", ekt.a);
   ekz<eku> h = a("noise_threshold_count", eku.a);
   ekz<ekm> i = a("count_on_every_layer", ekm.a);
   ekz<eko> j = a("environment_scan", eko.a);
   ekz<ekr> k = a("heightmap", ekr.a);
   ekz<ekq> l = a("height_range", ekq.a);
   ekz<eks> m = a("in_square", eks.a);
   ekz<ela> n = a("random_offset", ela.a);
   ekz<ekp> o = a("fixed_placement", ekp.a);

   MapCodec<P> codec();

   private static <P extends eky> ekz<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.S, $$0, () -> $$1);
   }
}
