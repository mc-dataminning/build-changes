import com.mojang.serialization.MapCodec;

public interface eot<S extends eok> {
   eot<eqe> a = a("buried_treasure", eqe.d);
   eot<eqg> b = a("desert_pyramid", eqg.d);
   eot<eqi> c = a("end_city", eqi.d);
   eot<eqr> d = a("fortress", eqr.e);
   eot<eqk> e = a("igloo", eqk.d);
   eot<eql> f = a("jigsaw", eql.i);
   eot<eqn> g = a("jungle_temple", eqn.d);
   eot<eqp> h = a("mineshaft", eqp.d);
   eot<eqt> i = a("nether_fossil", eqt.d);
   eot<eqv> j = a("ocean_monument", eqv.d);
   eot<eqx> k = a("ocean_ruin", eqx.d);
   eot<eqz> l = a("ruined_portal", eqz.d);
   eot<erb> m = a("shipwreck", erb.d);
   eot<erd> n = a("stronghold", erd.d);
   eot<erf> o = a("swamp_hut", erf.d);
   eot<erh> p = a("woodland_mansion", erh.d);

   MapCodec<S> codec();

   private static <S extends eok> eot<S> a(String $$0, MapCodec<S> $$1) {
      return kd.a(ma.R, $$0, () -> $$1);
   }
}
