import com.mojang.serialization.MapCodec;

public interface egt<P extends egs> {
   egt<ege> a = a("block_predicate_filter", ege.a);
   egt<egv> b = a("rarity_filter", egv.a);
   egt<egx> c = a("surface_relative_threshold_filter", egx.a);
   egt<egy> d = a("surface_water_depth_filter", egy.a);
   egt<egd> e = a("biome", egd.a);
   egt<egi> f = a("count", egi.a);
   egt<egn> g = a("noise_based_count", egn.a);
   egt<ego> h = a("noise_threshold_count", ego.a);
   egt<egh> i = a("count_on_every_layer", egh.a);
   egt<egj> j = a("environment_scan", egj.a);
   egt<egl> k = a("heightmap", egl.a);
   egt<egk> l = a("height_range", egk.a);
   egt<egm> m = a("in_square", egm.a);
   egt<egu> n = a("random_offset", egu.a);
   egt<egf> o = a("carving_mask", egf.a);

   MapCodec<P> codec();

   private static <P extends egs> egt<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.U, $$0, () -> $$1);
   }
}
