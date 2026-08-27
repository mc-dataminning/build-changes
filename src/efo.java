import com.mojang.serialization.Codec;

public interface efo<P extends efn> {
   efo<eez> a = a("block_predicate_filter", eez.a);
   efo<efq> b = a("rarity_filter", efq.a);
   efo<efs> c = a("surface_relative_threshold_filter", efs.a);
   efo<eft> d = a("surface_water_depth_filter", eft.a);
   efo<eey> e = a("biome", eey.a);
   efo<efd> f = a("count", efd.a);
   efo<efi> g = a("noise_based_count", efi.a);
   efo<efj> h = a("noise_threshold_count", efj.a);
   efo<efc> i = a("count_on_every_layer", efc.a);
   efo<efe> j = a("environment_scan", efe.a);
   efo<efg> k = a("heightmap", efg.a);
   efo<eff> l = a("height_range", eff.a);
   efo<efh> m = a("in_square", efh.a);
   efo<efp> n = a("random_offset", efp.a);
   efo<efa> o = a("carving_mask", efa.a);

   Codec<P> codec();

   private static <P extends efn> efo<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.U, $$0, () -> $$1);
   }
}
