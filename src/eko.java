import com.mojang.serialization.MapCodec;

public interface eko<P extends ekn> {
   eko<ejz> a = a("block_predicate_filter", ejz.a);
   eko<ekq> b = a("rarity_filter", ekq.a);
   eko<eks> c = a("surface_relative_threshold_filter", eks.a);
   eko<ekt> d = a("surface_water_depth_filter", ekt.a);
   eko<ejy> e = a("biome", ejy.a);
   eko<ekc> f = a("count", ekc.a);
   eko<eki> g = a("noise_based_count", eki.a);
   eko<ekj> h = a("noise_threshold_count", ekj.a);
   eko<ekb> i = a("count_on_every_layer", ekb.a);
   eko<ekd> j = a("environment_scan", ekd.a);
   eko<ekg> k = a("heightmap", ekg.a);
   eko<ekf> l = a("height_range", ekf.a);
   eko<ekh> m = a("in_square", ekh.a);
   eko<ekp> n = a("random_offset", ekp.a);
   eko<eke> o = a("fixed_placement", eke.a);

   MapCodec<P> codec();

   private static <P extends ekn> eko<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.S, $$0, () -> $$1);
   }
}
