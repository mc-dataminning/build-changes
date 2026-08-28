import com.mojang.serialization.MapCodec;

public interface eol<S extends eoc> {
   eol<epw> a = a("buried_treasure", epw.d);
   eol<epy> b = a("desert_pyramid", epy.d);
   eol<eqa> c = a("end_city", eqa.d);
   eol<eqj> d = a("fortress", eqj.e);
   eol<eqc> e = a("igloo", eqc.d);
   eol<eqd> f = a("jigsaw", eqd.i);
   eol<eqf> g = a("jungle_temple", eqf.d);
   eol<eqh> h = a("mineshaft", eqh.d);
   eol<eql> i = a("nether_fossil", eql.d);
   eol<eqn> j = a("ocean_monument", eqn.d);
   eol<eqp> k = a("ocean_ruin", eqp.d);
   eol<eqr> l = a("ruined_portal", eqr.d);
   eol<eqt> m = a("shipwreck", eqt.d);
   eol<eqv> n = a("stronghold", eqv.d);
   eol<eqx> o = a("swamp_hut", eqx.d);
   eol<eqz> p = a("woodland_mansion", eqz.d);

   MapCodec<S> codec();

   private static <S extends eoc> eol<S> a(String $$0, MapCodec<S> $$1) {
      return kd.a(ma.R, $$0, () -> $$1);
   }
}
