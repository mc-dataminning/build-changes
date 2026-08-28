import com.mojang.serialization.MapCodec;

public interface elq<P extends elp> {
   elq<elb> a = a("block_predicate_filter", elb.a);
   elq<els> b = a("rarity_filter", els.a);
   elq<elu> c = a("surface_relative_threshold_filter", elu.a);
   elq<elv> d = a("surface_water_depth_filter", elv.a);
   elq<ela> e = a("biome", ela.a);
   elq<ele> f = a("count", ele.a);
   elq<elk> g = a("noise_based_count", elk.a);
   elq<ell> h = a("noise_threshold_count", ell.a);
   elq<eld> i = a("count_on_every_layer", eld.a);
   elq<elf> j = a("environment_scan", elf.a);
   elq<eli> k = a("heightmap", eli.a);
   elq<elh> l = a("height_range", elh.a);
   elq<elj> m = a("in_square", elj.a);
   elq<elr> n = a("random_offset", elr.a);
   elq<elg> o = a("fixed_placement", elg.a);

   MapCodec<P> codec();

   private static <P extends elp> elq<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.S, $$0, () -> $$1);
   }
}
