import com.mojang.serialization.MapCodec;

public interface enr<P extends enq> {
   enr<enc> a = a("block_predicate_filter", enc.a);
   enr<ent> b = a("rarity_filter", ent.a);
   enr<env> c = a("surface_relative_threshold_filter", env.a);
   enr<enw> d = a("surface_water_depth_filter", enw.a);
   enr<enb> e = a("biome", enb.a);
   enr<enf> f = a("count", enf.a);
   enr<enl> g = a("noise_based_count", enl.a);
   enr<enm> h = a("noise_threshold_count", enm.a);
   enr<ene> i = a("count_on_every_layer", ene.a);
   enr<eng> j = a("environment_scan", eng.a);
   enr<enj> k = a("heightmap", enj.a);
   enr<eni> l = a("height_range", eni.a);
   enr<enk> m = a("in_square", enk.a);
   enr<ens> n = a("random_offset", ens.a);
   enr<enh> o = a("fixed_placement", enh.a);

   MapCodec<P> codec();

   private static <P extends enq> enr<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.S, $$0, () -> $$1);
   }
}
