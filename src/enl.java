import com.mojang.serialization.MapCodec;

public interface enl<P extends enk> {
   enl<emw> a = a("block_predicate_filter", emw.a);
   enl<enn> b = a("rarity_filter", enn.a);
   enl<enp> c = a("surface_relative_threshold_filter", enp.a);
   enl<enq> d = a("surface_water_depth_filter", enq.a);
   enl<emv> e = a("biome", emv.a);
   enl<emz> f = a("count", emz.a);
   enl<enf> g = a("noise_based_count", enf.a);
   enl<eng> h = a("noise_threshold_count", eng.a);
   enl<emy> i = a("count_on_every_layer", emy.a);
   enl<ena> j = a("environment_scan", ena.a);
   enl<end> k = a("heightmap", end.a);
   enl<enc> l = a("height_range", enc.a);
   enl<ene> m = a("in_square", ene.a);
   enl<enm> n = a("random_offset", enm.a);
   enl<enb> o = a("fixed_placement", enb.a);

   MapCodec<P> codec();

   private static <P extends enk> enl<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.S, $$0, () -> $$1);
   }
}
