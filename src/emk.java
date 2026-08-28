import com.mojang.serialization.MapCodec;

public interface emk<S extends emb> {
   emk<env> a = a("buried_treasure", env.d);
   emk<enx> b = a("desert_pyramid", enx.d);
   emk<enz> c = a("end_city", enz.d);
   emk<eoi> d = a("fortress", eoi.e);
   emk<eob> e = a("igloo", eob.d);
   emk<eoc> f = a("jigsaw", eoc.i);
   emk<eoe> g = a("jungle_temple", eoe.d);
   emk<eog> h = a("mineshaft", eog.d);
   emk<eok> i = a("nether_fossil", eok.d);
   emk<eom> j = a("ocean_monument", eom.d);
   emk<eoo> k = a("ocean_ruin", eoo.d);
   emk<eoq> l = a("ruined_portal", eoq.d);
   emk<eos> m = a("shipwreck", eos.d);
   emk<eou> n = a("stronghold", eou.d);
   emk<eow> o = a("swamp_hut", eow.d);
   emk<eoy> p = a("woodland_mansion", eoy.d);

   MapCodec<S> codec();

   private static <S extends emb> emk<S> a(String $$0, MapCodec<S> $$1) {
      return kd.a(lz.R, $$0, () -> $$1);
   }
}
