import com.mojang.serialization.Codec;

public interface ebo<P extends ebn> {
   ebo<eaz> a = a("block_predicate_filter", eaz.a);
   ebo<ebq> b = a("rarity_filter", ebq.a);
   ebo<ebs> c = a("surface_relative_threshold_filter", ebs.a);
   ebo<ebt> d = a("surface_water_depth_filter", ebt.a);
   ebo<eay> e = a("biome", eay.a);
   ebo<ebd> f = a("count", ebd.a);
   ebo<ebi> g = a("noise_based_count", ebi.a);
   ebo<ebj> h = a("noise_threshold_count", ebj.a);
   ebo<ebc> i = a("count_on_every_layer", ebc.a);
   ebo<ebe> j = a("environment_scan", ebe.a);
   ebo<ebg> k = a("heightmap", ebg.a);
   ebo<ebf> l = a("height_range", ebf.a);
   ebo<ebh> m = a("in_square", ebh.a);
   ebo<ebp> n = a("random_offset", ebp.a);
   ebo<eba> o = a("carving_mask", eba.a);

   Codec<P> codec();

   private static <P extends ebn> ebo<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.U, $$0, () -> $$1);
   }
}
