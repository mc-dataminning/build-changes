import com.mojang.serialization.MapCodec;

public interface erc<S extends eqt> {
   erc<esn> a = a("buried_treasure", esn.d);
   erc<esp> b = a("desert_pyramid", esp.d);
   erc<esr> c = a("end_city", esr.d);
   erc<eta> d = a("fortress", eta.e);
   erc<est> e = a("igloo", est.d);
   erc<esu> f = a("jigsaw", esu.i);
   erc<esw> g = a("jungle_temple", esw.d);
   erc<esy> h = a("mineshaft", esy.d);
   erc<etc> i = a("nether_fossil", etc.d);
   erc<ete> j = a("ocean_monument", ete.d);
   erc<etg> k = a("ocean_ruin", etg.d);
   erc<eti> l = a("ruined_portal", eti.d);
   erc<etk> m = a("shipwreck", etk.d);
   erc<etm> n = a("stronghold", etm.d);
   erc<eto> o = a("swamp_hut", eto.d);
   erc<etq> p = a("woodland_mansion", etq.d);

   MapCodec<S> codec();

   private static <S extends eqt> erc<S> a(String $$0, MapCodec<S> $$1) {
      return jr.a(mf.R, $$0, () -> $$1);
   }
}
