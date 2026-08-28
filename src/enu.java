import com.mojang.serialization.MapCodec;

public interface enu<S extends enl> {
   enu<epf> a = a("buried_treasure", epf.d);
   enu<eph> b = a("desert_pyramid", eph.d);
   enu<epj> c = a("end_city", epj.d);
   enu<eps> d = a("fortress", eps.e);
   enu<epl> e = a("igloo", epl.d);
   enu<epm> f = a("jigsaw", epm.i);
   enu<epo> g = a("jungle_temple", epo.d);
   enu<epq> h = a("mineshaft", epq.d);
   enu<epu> i = a("nether_fossil", epu.d);
   enu<epw> j = a("ocean_monument", epw.d);
   enu<epy> k = a("ocean_ruin", epy.d);
   enu<eqa> l = a("ruined_portal", eqa.d);
   enu<eqc> m = a("shipwreck", eqc.d);
   enu<eqe> n = a("stronghold", eqe.d);
   enu<eqg> o = a("swamp_hut", eqg.d);
   enu<eqi> p = a("woodland_mansion", eqi.d);

   MapCodec<S> codec();

   private static <S extends enl> enu<S> a(String $$0, MapCodec<S> $$1) {
      return ke.a(mb.R, $$0, () -> $$1);
   }
}
