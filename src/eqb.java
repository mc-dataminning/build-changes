import com.mojang.serialization.MapCodec;

public interface eqb<P extends eqa> {
   eqb<epm> a = a("block_predicate_filter", epm.a);
   eqb<eqd> b = a("rarity_filter", eqd.a);
   eqb<eqf> c = a("surface_relative_threshold_filter", eqf.a);
   eqb<eqg> d = a("surface_water_depth_filter", eqg.a);
   eqb<epl> e = a("biome", epl.a);
   eqb<epp> f = a("count", epp.a);
   eqb<epv> g = a("noise_based_count", epv.a);
   eqb<epw> h = a("noise_threshold_count", epw.a);
   eqb<epo> i = a("count_on_every_layer", epo.a);
   eqb<epq> j = a("environment_scan", epq.a);
   eqb<ept> k = a("heightmap", ept.a);
   eqb<eps> l = a("height_range", eps.a);
   eqb<epu> m = a("in_square", epu.a);
   eqb<eqc> n = a("random_offset", eqc.a);
   eqb<epr> o = a("fixed_placement", epr.a);

   MapCodec<P> codec();

   private static <P extends eqa> eqb<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.S, $$0, () -> $$1);
   }
}
