import com.mojang.serialization.MapCodec;

public interface ens<P extends enr> {
   ens<end> a = a("block_predicate_filter", end.a);
   ens<enu> b = a("rarity_filter", enu.a);
   ens<enw> c = a("surface_relative_threshold_filter", enw.a);
   ens<enx> d = a("surface_water_depth_filter", enx.a);
   ens<enc> e = a("biome", enc.a);
   ens<eng> f = a("count", eng.a);
   ens<enm> g = a("noise_based_count", enm.a);
   ens<enn> h = a("noise_threshold_count", enn.a);
   ens<enf> i = a("count_on_every_layer", enf.a);
   ens<enh> j = a("environment_scan", enh.a);
   ens<enk> k = a("heightmap", enk.a);
   ens<enj> l = a("height_range", enj.a);
   ens<enl> m = a("in_square", enl.a);
   ens<ent> n = a("random_offset", ent.a);
   ens<eni> o = a("fixed_placement", eni.a);

   MapCodec<P> codec();

   private static <P extends enr> ens<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.S, $$0, () -> $$1);
   }
}
