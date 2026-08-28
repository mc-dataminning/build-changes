import com.mojang.serialization.MapCodec;

public interface env<S extends enm> {
   env<epg> a = a("buried_treasure", epg.d);
   env<epi> b = a("desert_pyramid", epi.d);
   env<epk> c = a("end_city", epk.d);
   env<ept> d = a("fortress", ept.e);
   env<epm> e = a("igloo", epm.d);
   env<epn> f = a("jigsaw", epn.i);
   env<epp> g = a("jungle_temple", epp.d);
   env<epr> h = a("mineshaft", epr.d);
   env<epv> i = a("nether_fossil", epv.d);
   env<epx> j = a("ocean_monument", epx.d);
   env<epz> k = a("ocean_ruin", epz.d);
   env<eqb> l = a("ruined_portal", eqb.d);
   env<eqd> m = a("shipwreck", eqd.d);
   env<eqf> n = a("stronghold", eqf.d);
   env<eqh> o = a("swamp_hut", eqh.d);
   env<eqj> p = a("woodland_mansion", eqj.d);

   MapCodec<S> codec();

   private static <S extends enm> env<S> a(String $$0, MapCodec<S> $$1) {
      return ke.a(mb.R, $$0, () -> $$1);
   }
}
