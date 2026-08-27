import com.mojang.serialization.Codec;

public interface efx<P extends efw> {
   efx<efi> a = a("block_predicate_filter", efi.a);
   efx<efz> b = a("rarity_filter", efz.a);
   efx<egb> c = a("surface_relative_threshold_filter", egb.a);
   efx<egc> d = a("surface_water_depth_filter", egc.a);
   efx<efh> e = a("biome", efh.a);
   efx<efm> f = a("count", efm.a);
   efx<efr> g = a("noise_based_count", efr.a);
   efx<efs> h = a("noise_threshold_count", efs.a);
   efx<efl> i = a("count_on_every_layer", efl.a);
   efx<efn> j = a("environment_scan", efn.a);
   efx<efp> k = a("heightmap", efp.a);
   efx<efo> l = a("height_range", efo.a);
   efx<efq> m = a("in_square", efq.a);
   efx<efy> n = a("random_offset", efy.a);
   efx<efj> o = a("carving_mask", efj.a);

   Codec<P> codec();

   private static <P extends efw> efx<P> a(String $$0, Codec<P> $$1) {
      return jj.a(ld.U, $$0, () -> $$1);
   }
}
