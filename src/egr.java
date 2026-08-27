import com.mojang.serialization.MapCodec;

public interface egr<P extends egq> {
   egr<egc> a = a("block_predicate_filter", egc.a);
   egr<egt> b = a("rarity_filter", egt.a);
   egr<egv> c = a("surface_relative_threshold_filter", egv.a);
   egr<egw> d = a("surface_water_depth_filter", egw.a);
   egr<egb> e = a("biome", egb.a);
   egr<egg> f = a("count", egg.a);
   egr<egl> g = a("noise_based_count", egl.a);
   egr<egm> h = a("noise_threshold_count", egm.a);
   egr<egf> i = a("count_on_every_layer", egf.a);
   egr<egh> j = a("environment_scan", egh.a);
   egr<egj> k = a("heightmap", egj.a);
   egr<egi> l = a("height_range", egi.a);
   egr<egk> m = a("in_square", egk.a);
   egr<egs> n = a("random_offset", egs.a);
   egr<egd> o = a("carving_mask", egd.a);

   MapCodec<P> codec();

   private static <P extends egq> egr<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.U, $$0, () -> $$1);
   }
}
