import com.mojang.serialization.MapCodec;

public interface emu<P extends emt> {
   emu<emf> a = a("block_predicate_filter", emf.a);
   emu<emw> b = a("rarity_filter", emw.a);
   emu<emy> c = a("surface_relative_threshold_filter", emy.a);
   emu<emz> d = a("surface_water_depth_filter", emz.a);
   emu<eme> e = a("biome", eme.a);
   emu<emi> f = a("count", emi.a);
   emu<emo> g = a("noise_based_count", emo.a);
   emu<emp> h = a("noise_threshold_count", emp.a);
   emu<emh> i = a("count_on_every_layer", emh.a);
   emu<emj> j = a("environment_scan", emj.a);
   emu<emm> k = a("heightmap", emm.a);
   emu<eml> l = a("height_range", eml.a);
   emu<emn> m = a("in_square", emn.a);
   emu<emv> n = a("random_offset", emv.a);
   emu<emk> o = a("fixed_placement", emk.a);

   MapCodec<P> codec();

   private static <P extends emt> emu<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.S, $$0, () -> $$1);
   }
}
