import com.mojang.serialization.MapCodec;

public interface eit<S extends eik> {
   eit<ekd> a = a("buried_treasure", ekd.d);
   eit<ekf> b = a("desert_pyramid", ekf.d);
   eit<ekh> c = a("end_city", ekh.d);
   eit<ekq> d = a("fortress", ekq.e);
   eit<ekj> e = a("igloo", ekj.d);
   eit<ekk> f = a("jigsaw", ekk.g);
   eit<ekm> g = a("jungle_temple", ekm.d);
   eit<eko> h = a("mineshaft", eko.d);
   eit<eks> i = a("nether_fossil", eks.d);
   eit<eku> j = a("ocean_monument", eku.d);
   eit<ekw> k = a("ocean_ruin", ekw.d);
   eit<eky> l = a("ruined_portal", eky.d);
   eit<ela> m = a("shipwreck", ela.d);
   eit<elc> n = a("stronghold", elc.d);
   eit<ele> o = a("swamp_hut", ele.d);
   eit<elg> p = a("woodland_mansion", elg.d);

   MapCodec<S> codec();

   private static <S extends eik> eit<S> a(String $$0, MapCodec<S> $$1) {
      return jv.a(lp.T, $$0, () -> $$1);
   }
}
