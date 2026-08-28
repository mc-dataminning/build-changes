import com.mojang.serialization.MapCodec;

public interface elf<P extends ele> {
   elf<ekq> a = a("block_predicate_filter", ekq.a);
   elf<elh> b = a("rarity_filter", elh.a);
   elf<elj> c = a("surface_relative_threshold_filter", elj.a);
   elf<elk> d = a("surface_water_depth_filter", elk.a);
   elf<ekp> e = a("biome", ekp.a);
   elf<ekt> f = a("count", ekt.a);
   elf<ekz> g = a("noise_based_count", ekz.a);
   elf<ela> h = a("noise_threshold_count", ela.a);
   elf<eks> i = a("count_on_every_layer", eks.a);
   elf<eku> j = a("environment_scan", eku.a);
   elf<ekx> k = a("heightmap", ekx.a);
   elf<ekw> l = a("height_range", ekw.a);
   elf<eky> m = a("in_square", eky.a);
   elf<elg> n = a("random_offset", elg.a);
   elf<ekv> o = a("fixed_placement", ekv.a);

   MapCodec<P> codec();

   private static <P extends ele> elf<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.S, $$0, () -> $$1);
   }
}
