import com.mojang.serialization.Codec;

public interface dyx<S extends dyo> {
   dyx<eah> a = a("buried_treasure", eah.d);
   dyx<eaj> b = a("desert_pyramid", eaj.d);
   dyx<eal> c = a("end_city", eal.d);
   dyx<eau> d = a("fortress", eau.e);
   dyx<ean> e = a("igloo", ean.d);
   dyx<eao> f = a("jigsaw", eao.f);
   dyx<eaq> g = a("jungle_temple", eaq.d);
   dyx<eas> h = a("mineshaft", eas.d);
   dyx<eaw> i = a("nether_fossil", eaw.d);
   dyx<eay> j = a("ocean_monument", eay.d);
   dyx<eba> k = a("ocean_ruin", eba.d);
   dyx<ebc> l = a("ruined_portal", ebc.d);
   dyx<ebe> m = a("shipwreck", ebe.d);
   dyx<ebg> n = a("stronghold", ebg.d);
   dyx<ebi> o = a("swamp_hut", ebi.d);
   dyx<ebk> p = a("woodland_mansion", ebk.d);

   Codec<S> codec();

   private static <S extends dyo> dyx<S> a(String $$0, Codec<S> $$1) {
      return ir.a(kb.T, $$0, () -> $$1);
   }
}
