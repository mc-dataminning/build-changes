import com.mojang.serialization.MapCodec;

public interface epq<P extends epp> {
   epq<epb> a = a("block_predicate_filter", epb.a);
   epq<eps> b = a("rarity_filter", eps.a);
   epq<epu> c = a("surface_relative_threshold_filter", epu.a);
   epq<epv> d = a("surface_water_depth_filter", epv.a);
   epq<epa> e = a("biome", epa.a);
   epq<epe> f = a("count", epe.a);
   epq<epk> g = a("noise_based_count", epk.a);
   epq<epl> h = a("noise_threshold_count", epl.a);
   epq<epd> i = a("count_on_every_layer", epd.a);
   epq<epf> j = a("environment_scan", epf.a);
   epq<epi> k = a("heightmap", epi.a);
   epq<eph> l = a("height_range", eph.a);
   epq<epj> m = a("in_square", epj.a);
   epq<epr> n = a("random_offset", epr.a);
   epq<epg> o = a("fixed_placement", epg.a);

   MapCodec<P> codec();

   private static <P extends epp> epq<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.S, $$0, () -> $$1);
   }
}
