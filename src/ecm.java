import com.mojang.serialization.Codec;

public interface ecm<P extends ecl> {
   ecm<ebx> a = a("block_predicate_filter", ebx.a);
   ecm<eco> b = a("rarity_filter", eco.a);
   ecm<ecq> c = a("surface_relative_threshold_filter", ecq.a);
   ecm<ecr> d = a("surface_water_depth_filter", ecr.a);
   ecm<ebw> e = a("biome", ebw.a);
   ecm<ecb> f = a("count", ecb.a);
   ecm<ecg> g = a("noise_based_count", ecg.a);
   ecm<ech> h = a("noise_threshold_count", ech.a);
   ecm<eca> i = a("count_on_every_layer", eca.a);
   ecm<ecc> j = a("environment_scan", ecc.a);
   ecm<ece> k = a("heightmap", ece.a);
   ecm<ecd> l = a("height_range", ecd.a);
   ecm<ecf> m = a("in_square", ecf.a);
   ecm<ecn> n = a("random_offset", ecn.a);
   ecm<eby> o = a("carving_mask", eby.a);

   Codec<P> codec();

   private static <P extends ecl> ecm<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.U, $$0, () -> $$1);
   }
}
