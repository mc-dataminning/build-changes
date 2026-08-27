import com.mojang.serialization.Codec;

public interface eck<P extends ecj> {
   eck<ebv> a = a("block_predicate_filter", ebv.a);
   eck<ecm> b = a("rarity_filter", ecm.a);
   eck<eco> c = a("surface_relative_threshold_filter", eco.a);
   eck<ecp> d = a("surface_water_depth_filter", ecp.a);
   eck<ebu> e = a("biome", ebu.a);
   eck<ebz> f = a("count", ebz.a);
   eck<ece> g = a("noise_based_count", ece.a);
   eck<ecf> h = a("noise_threshold_count", ecf.a);
   eck<eby> i = a("count_on_every_layer", eby.a);
   eck<eca> j = a("environment_scan", eca.a);
   eck<ecc> k = a("heightmap", ecc.a);
   eck<ecb> l = a("height_range", ecb.a);
   eck<ecd> m = a("in_square", ecd.a);
   eck<ecl> n = a("random_offset", ecl.a);
   eck<ebw> o = a("carving_mask", ebw.a);

   Codec<P> codec();

   private static <P extends ecj> eck<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.U, $$0, () -> $$1);
   }
}
