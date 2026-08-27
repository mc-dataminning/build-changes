import com.mojang.serialization.Codec;

public interface efz<S extends efq> {
   efz<ehj> a = a("buried_treasure", ehj.d);
   efz<ehl> b = a("desert_pyramid", ehl.d);
   efz<ehn> c = a("end_city", ehn.d);
   efz<ehw> d = a("fortress", ehw.e);
   efz<ehp> e = a("igloo", ehp.d);
   efz<ehq> f = a("jigsaw", ehq.g);
   efz<ehs> g = a("jungle_temple", ehs.d);
   efz<ehu> h = a("mineshaft", ehu.d);
   efz<ehy> i = a("nether_fossil", ehy.d);
   efz<eia> j = a("ocean_monument", eia.d);
   efz<eic> k = a("ocean_ruin", eic.d);
   efz<eie> l = a("ruined_portal", eie.d);
   efz<eig> m = a("shipwreck", eig.d);
   efz<eii> n = a("stronghold", eii.d);
   efz<eik> o = a("swamp_hut", eik.d);
   efz<eim> p = a("woodland_mansion", eim.d);

   Codec<S> codec();

   private static <S extends efq> efz<S> a(String $$0, Codec<S> $$1) {
      return ja.a(kt.T, $$0, () -> $$1);
   }
}
