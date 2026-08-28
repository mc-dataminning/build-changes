import com.mojang.serialization.MapCodec;

public interface eiv<S extends eim> {
   eiv<ekf> a = a("buried_treasure", ekf.d);
   eiv<ekh> b = a("desert_pyramid", ekh.d);
   eiv<ekj> c = a("end_city", ekj.d);
   eiv<eks> d = a("fortress", eks.e);
   eiv<ekl> e = a("igloo", ekl.d);
   eiv<ekm> f = a("jigsaw", ekm.g);
   eiv<eko> g = a("jungle_temple", eko.d);
   eiv<ekq> h = a("mineshaft", ekq.d);
   eiv<eku> i = a("nether_fossil", eku.d);
   eiv<ekw> j = a("ocean_monument", ekw.d);
   eiv<eky> k = a("ocean_ruin", eky.d);
   eiv<ela> l = a("ruined_portal", ela.d);
   eiv<elc> m = a("shipwreck", elc.d);
   eiv<ele> n = a("stronghold", ele.d);
   eiv<elg> o = a("swamp_hut", elg.d);
   eiv<eli> p = a("woodland_mansion", eli.d);

   MapCodec<S> codec();

   private static <S extends eim> eiv<S> a(String $$0, MapCodec<S> $$1) {
      return jv.a(lp.T, $$0, () -> $$1);
   }
}
