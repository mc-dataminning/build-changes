import com.mojang.serialization.MapCodec;

public interface eir<S extends eii> {
   eir<ekb> a = a("buried_treasure", ekb.d);
   eir<ekd> b = a("desert_pyramid", ekd.d);
   eir<ekf> c = a("end_city", ekf.d);
   eir<eko> d = a("fortress", eko.e);
   eir<ekh> e = a("igloo", ekh.d);
   eir<eki> f = a("jigsaw", eki.g);
   eir<ekk> g = a("jungle_temple", ekk.d);
   eir<ekm> h = a("mineshaft", ekm.d);
   eir<ekq> i = a("nether_fossil", ekq.d);
   eir<eks> j = a("ocean_monument", eks.d);
   eir<eku> k = a("ocean_ruin", eku.d);
   eir<ekw> l = a("ruined_portal", ekw.d);
   eir<eky> m = a("shipwreck", eky.d);
   eir<ela> n = a("stronghold", ela.d);
   eir<elc> o = a("swamp_hut", elc.d);
   eir<ele> p = a("woodland_mansion", ele.d);

   MapCodec<S> codec();

   private static <S extends eii> eir<S> a(String $$0, MapCodec<S> $$1) {
      return jv.a(lp.T, $$0, () -> $$1);
   }
}
