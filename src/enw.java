import com.mojang.serialization.MapCodec;

public interface enw<S extends enn> {
   enw<eph> a = a("buried_treasure", eph.d);
   enw<epj> b = a("desert_pyramid", epj.d);
   enw<epl> c = a("end_city", epl.d);
   enw<epu> d = a("fortress", epu.e);
   enw<epn> e = a("igloo", epn.d);
   enw<epo> f = a("jigsaw", epo.i);
   enw<epq> g = a("jungle_temple", epq.d);
   enw<eps> h = a("mineshaft", eps.d);
   enw<epw> i = a("nether_fossil", epw.d);
   enw<epy> j = a("ocean_monument", epy.d);
   enw<eqa> k = a("ocean_ruin", eqa.d);
   enw<eqc> l = a("ruined_portal", eqc.d);
   enw<eqe> m = a("shipwreck", eqe.d);
   enw<eqg> n = a("stronghold", eqg.d);
   enw<eqi> o = a("swamp_hut", eqi.d);
   enw<eqk> p = a("woodland_mansion", eqk.d);

   MapCodec<S> codec();

   private static <S extends enn> enw<S> a(String $$0, MapCodec<S> $$1) {
      return ke.a(mb.R, $$0, () -> $$1);
   }
}
