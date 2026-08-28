import com.mojang.serialization.MapCodec;

public interface enk<P extends enj> {
   enk<emv> a = a("block_predicate_filter", emv.a);
   enk<enm> b = a("rarity_filter", enm.a);
   enk<eno> c = a("surface_relative_threshold_filter", eno.a);
   enk<enp> d = a("surface_water_depth_filter", enp.a);
   enk<emu> e = a("biome", emu.a);
   enk<emy> f = a("count", emy.a);
   enk<ene> g = a("noise_based_count", ene.a);
   enk<enf> h = a("noise_threshold_count", enf.a);
   enk<emx> i = a("count_on_every_layer", emx.a);
   enk<emz> j = a("environment_scan", emz.a);
   enk<enc> k = a("heightmap", enc.a);
   enk<enb> l = a("height_range", enb.a);
   enk<end> m = a("in_square", end.a);
   enk<enl> n = a("random_offset", enl.a);
   enk<ena> o = a("fixed_placement", ena.a);

   MapCodec<P> codec();

   private static <P extends enj> enk<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.S, $$0, () -> $$1);
   }
}
