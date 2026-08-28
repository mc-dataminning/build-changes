import com.mojang.serialization.MapCodec;

public interface ent<S extends enk> {
   ent<epe> a = a("buried_treasure", epe.d);
   ent<epg> b = a("desert_pyramid", epg.d);
   ent<epi> c = a("end_city", epi.d);
   ent<epr> d = a("fortress", epr.e);
   ent<epk> e = a("igloo", epk.d);
   ent<epl> f = a("jigsaw", epl.i);
   ent<epn> g = a("jungle_temple", epn.d);
   ent<epp> h = a("mineshaft", epp.d);
   ent<ept> i = a("nether_fossil", ept.d);
   ent<epv> j = a("ocean_monument", epv.d);
   ent<epx> k = a("ocean_ruin", epx.d);
   ent<epz> l = a("ruined_portal", epz.d);
   ent<eqb> m = a("shipwreck", eqb.d);
   ent<eqd> n = a("stronghold", eqd.d);
   ent<eqf> o = a("swamp_hut", eqf.d);
   ent<eqh> p = a("woodland_mansion", eqh.d);

   MapCodec<S> codec();

   private static <S extends enk> ent<S> a(String $$0, MapCodec<S> $$1) {
      return ke.a(mb.R, $$0, () -> $$1);
   }
}
