import com.mojang.serialization.Codec;

public interface dvi<P extends dvh> {
   dvi<dut> a = a("block_predicate_filter", dut.a);
   dvi<dvk> b = a("rarity_filter", dvk.a);
   dvi<dvm> c = a("surface_relative_threshold_filter", dvm.a);
   dvi<dvn> d = a("surface_water_depth_filter", dvn.a);
   dvi<dus> e = a("biome", dus.a);
   dvi<dux> f = a("count", dux.a);
   dvi<dvc> g = a("noise_based_count", dvc.a);
   dvi<dvd> h = a("noise_threshold_count", dvd.a);
   dvi<duw> i = a("count_on_every_layer", duw.a);
   dvi<duy> j = a("environment_scan", duy.a);
   dvi<dva> k = a("heightmap", dva.a);
   dvi<duz> l = a("height_range", duz.a);
   dvi<dvb> m = a("in_square", dvb.a);
   dvi<dvj> n = a("random_offset", dvj.a);
   dvi<duu> o = a("carving_mask", duu.a);

   Codec<P> codec();

   private static <P extends dvh> dvi<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.V, $$0, () -> $$1);
   }
}
