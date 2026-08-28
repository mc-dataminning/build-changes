import com.mojang.serialization.MapCodec;

public interface emt<P extends ems> {
   emt<eme> a = a("block_predicate_filter", eme.a);
   emt<emv> b = a("rarity_filter", emv.a);
   emt<emx> c = a("surface_relative_threshold_filter", emx.a);
   emt<emy> d = a("surface_water_depth_filter", emy.a);
   emt<emd> e = a("biome", emd.a);
   emt<emh> f = a("count", emh.a);
   emt<emn> g = a("noise_based_count", emn.a);
   emt<emo> h = a("noise_threshold_count", emo.a);
   emt<emg> i = a("count_on_every_layer", emg.a);
   emt<emi> j = a("environment_scan", emi.a);
   emt<eml> k = a("heightmap", eml.a);
   emt<emk> l = a("height_range", emk.a);
   emt<emm> m = a("in_square", emm.a);
   emt<emu> n = a("random_offset", emu.a);
   emt<emj> o = a("fixed_placement", emj.a);

   MapCodec<P> codec();

   private static <P extends ems> emt<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.S, $$0, () -> $$1);
   }
}
