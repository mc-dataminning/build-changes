import com.mojang.serialization.MapCodec;

public interface eoo<P extends eon> {
   eoo<enz> a = a("block_predicate_filter", enz.a);
   eoo<eoq> b = a("rarity_filter", eoq.a);
   eoo<eos> c = a("surface_relative_threshold_filter", eos.a);
   eoo<eot> d = a("surface_water_depth_filter", eot.a);
   eoo<eny> e = a("biome", eny.a);
   eoo<eoc> f = a("count", eoc.a);
   eoo<eoi> g = a("noise_based_count", eoi.a);
   eoo<eoj> h = a("noise_threshold_count", eoj.a);
   eoo<eob> i = a("count_on_every_layer", eob.a);
   eoo<eod> j = a("environment_scan", eod.a);
   eoo<eog> k = a("heightmap", eog.a);
   eoo<eof> l = a("height_range", eof.a);
   eoo<eoh> m = a("in_square", eoh.a);
   eoo<eop> n = a("random_offset", eop.a);
   eoo<eoe> o = a("fixed_placement", eoe.a);

   MapCodec<P> codec();

   private static <P extends eon> eoo<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.S, $$0, () -> $$1);
   }
}
