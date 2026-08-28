import com.mojang.serialization.MapCodec;

public interface emv<P extends emu> {
   emv<emg> a = a("block_predicate_filter", emg.a);
   emv<emx> b = a("rarity_filter", emx.a);
   emv<emz> c = a("surface_relative_threshold_filter", emz.a);
   emv<ena> d = a("surface_water_depth_filter", ena.a);
   emv<emf> e = a("biome", emf.a);
   emv<emj> f = a("count", emj.a);
   emv<emp> g = a("noise_based_count", emp.a);
   emv<emq> h = a("noise_threshold_count", emq.a);
   emv<emi> i = a("count_on_every_layer", emi.a);
   emv<emk> j = a("environment_scan", emk.a);
   emv<emn> k = a("heightmap", emn.a);
   emv<emm> l = a("height_range", emm.a);
   emv<emo> m = a("in_square", emo.a);
   emv<emw> n = a("random_offset", emw.a);
   emv<eml> o = a("fixed_placement", eml.a);

   MapCodec<P> codec();

   private static <P extends emu> emv<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.S, $$0, () -> $$1);
   }
}
