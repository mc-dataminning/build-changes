import com.mojang.serialization.Codec;

public interface ekc<S extends ejt> {
   ekc<elm> a = a("buried_treasure", elm.d);
   ekc<elo> b = a("desert_pyramid", elo.d);
   ekc<elq> c = a("end_city", elq.d);
   ekc<elz> d = a("fortress", elz.e);
   ekc<els> e = a("igloo", els.d);
   ekc<elt> f = a("jigsaw", elt.g);
   ekc<elv> g = a("jungle_temple", elv.d);
   ekc<elx> h = a("mineshaft", elx.d);
   ekc<emb> i = a("nether_fossil", emb.d);
   ekc<emd> j = a("ocean_monument", emd.d);
   ekc<emf> k = a("ocean_ruin", emf.d);
   ekc<emh> l = a("ruined_portal", emh.d);
   ekc<emj> m = a("shipwreck", emj.d);
   ekc<eml> n = a("stronghold", eml.d);
   ekc<emn> o = a("swamp_hut", emn.d);
   ekc<emp> p = a("woodland_mansion", emp.d);

   Codec<S> codec();

   private static <S extends ejt> ekc<S> a(String $$0, Codec<S> $$1) {
      return jn.a(lh.T, $$0, () -> $$1);
   }
}
