import com.mojang.serialization.Codec;

public interface dxw<P extends dxv> {
   dxw<dxh> a = a("block_predicate_filter", dxh.a);
   dxw<dxy> b = a("rarity_filter", dxy.a);
   dxw<dya> c = a("surface_relative_threshold_filter", dya.a);
   dxw<dyb> d = a("surface_water_depth_filter", dyb.a);
   dxw<dxg> e = a("biome", dxg.a);
   dxw<dxl> f = a("count", dxl.a);
   dxw<dxq> g = a("noise_based_count", dxq.a);
   dxw<dxr> h = a("noise_threshold_count", dxr.a);
   dxw<dxk> i = a("count_on_every_layer", dxk.a);
   dxw<dxm> j = a("environment_scan", dxm.a);
   dxw<dxo> k = a("heightmap", dxo.a);
   dxw<dxn> l = a("height_range", dxn.a);
   dxw<dxp> m = a("in_square", dxp.a);
   dxw<dxx> n = a("random_offset", dxx.a);
   dxw<dxi> o = a("carving_mask", dxi.a);

   Codec<P> codec();

   private static <P extends dxv> dxw<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.U, $$0, () -> $$1);
   }
}
