import com.mojang.serialization.MapCodec;

public interface ems<P extends emr> {
   ems<emd> a = a("block_predicate_filter", emd.a);
   ems<emu> b = a("rarity_filter", emu.a);
   ems<emw> c = a("surface_relative_threshold_filter", emw.a);
   ems<emx> d = a("surface_water_depth_filter", emx.a);
   ems<emc> e = a("biome", emc.a);
   ems<emg> f = a("count", emg.a);
   ems<emm> g = a("noise_based_count", emm.a);
   ems<emn> h = a("noise_threshold_count", emn.a);
   ems<emf> i = a("count_on_every_layer", emf.a);
   ems<emh> j = a("environment_scan", emh.a);
   ems<emk> k = a("heightmap", emk.a);
   ems<emj> l = a("height_range", emj.a);
   ems<eml> m = a("in_square", eml.a);
   ems<emt> n = a("random_offset", emt.a);
   ems<emi> o = a("fixed_placement", emi.a);

   MapCodec<P> codec();

   private static <P extends emr> ems<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.S, $$0, () -> $$1);
   }
}
