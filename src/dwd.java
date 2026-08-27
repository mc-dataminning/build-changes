import com.mojang.serialization.Codec;

public interface dwd<P extends dwc> {
   dwd<dvo> a = a("block_predicate_filter", dvo.a);
   dwd<dwf> b = a("rarity_filter", dwf.a);
   dwd<dwh> c = a("surface_relative_threshold_filter", dwh.a);
   dwd<dwi> d = a("surface_water_depth_filter", dwi.a);
   dwd<dvn> e = a("biome", dvn.a);
   dwd<dvs> f = a("count", dvs.a);
   dwd<dvx> g = a("noise_based_count", dvx.a);
   dwd<dvy> h = a("noise_threshold_count", dvy.a);
   dwd<dvr> i = a("count_on_every_layer", dvr.a);
   dwd<dvt> j = a("environment_scan", dvt.a);
   dwd<dvv> k = a("heightmap", dvv.a);
   dwd<dvu> l = a("height_range", dvu.a);
   dwd<dvw> m = a("in_square", dvw.a);
   dwd<dwe> n = a("random_offset", dwe.a);
   dwd<dvp> o = a("carving_mask", dvp.a);

   Codec<P> codec();

   private static <P extends dwc> dwd<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.V, $$0, () -> $$1);
   }
}
