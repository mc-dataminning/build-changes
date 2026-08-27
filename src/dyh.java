import com.mojang.serialization.Codec;

public interface dyh<P extends dyg> {
   dyh<dxs> a = a("block_predicate_filter", dxs.a);
   dyh<dyj> b = a("rarity_filter", dyj.a);
   dyh<dyl> c = a("surface_relative_threshold_filter", dyl.a);
   dyh<dym> d = a("surface_water_depth_filter", dym.a);
   dyh<dxr> e = a("biome", dxr.a);
   dyh<dxw> f = a("count", dxw.a);
   dyh<dyb> g = a("noise_based_count", dyb.a);
   dyh<dyc> h = a("noise_threshold_count", dyc.a);
   dyh<dxv> i = a("count_on_every_layer", dxv.a);
   dyh<dxx> j = a("environment_scan", dxx.a);
   dyh<dxz> k = a("heightmap", dxz.a);
   dyh<dxy> l = a("height_range", dxy.a);
   dyh<dya> m = a("in_square", dya.a);
   dyh<dyi> n = a("random_offset", dyi.a);
   dyh<dxt> o = a("carving_mask", dxt.a);

   Codec<P> codec();

   private static <P extends dyg> dyh<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.U, $$0, () -> $$1);
   }
}
