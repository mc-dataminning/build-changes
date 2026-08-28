import com.mojang.serialization.MapCodec;

public interface eiz<S extends eiq> {
   eiz<ekj> a = a("buried_treasure", ekj.d);
   eiz<ekl> b = a("desert_pyramid", ekl.d);
   eiz<ekn> c = a("end_city", ekn.d);
   eiz<ekw> d = a("fortress", ekw.e);
   eiz<ekp> e = a("igloo", ekp.d);
   eiz<ekq> f = a("jigsaw", ekq.g);
   eiz<eks> g = a("jungle_temple", eks.d);
   eiz<eku> h = a("mineshaft", eku.d);
   eiz<eky> i = a("nether_fossil", eky.d);
   eiz<ela> j = a("ocean_monument", ela.d);
   eiz<elc> k = a("ocean_ruin", elc.d);
   eiz<ele> l = a("ruined_portal", ele.d);
   eiz<elg> m = a("shipwreck", elg.d);
   eiz<eli> n = a("stronghold", eli.d);
   eiz<elk> o = a("swamp_hut", elk.d);
   eiz<elm> p = a("woodland_mansion", elm.d);

   MapCodec<S> codec();

   private static <S extends eiq> eiz<S> a(String $$0, MapCodec<S> $$1) {
      return jw.a(lq.R, $$0, () -> $$1);
   }
}
