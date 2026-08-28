import com.mojang.serialization.MapCodec;

public interface esw<S extends esn> {
   esw<euh> a = a("buried_treasure", euh.d);
   esw<euj> b = a("desert_pyramid", euj.d);
   esw<eul> c = a("end_city", eul.d);
   esw<euu> d = a("fortress", euu.e);
   esw<eun> e = a("igloo", eun.d);
   esw<euo> f = a("jigsaw", euo.i);
   esw<euq> g = a("jungle_temple", euq.d);
   esw<eus> h = a("mineshaft", eus.d);
   esw<euw> i = a("nether_fossil", euw.d);
   esw<euy> j = a("ocean_monument", euy.d);
   esw<eva> k = a("ocean_ruin", eva.d);
   esw<evc> l = a("ruined_portal", evc.d);
   esw<eve> m = a("shipwreck", eve.d);
   esw<evg> n = a("stronghold", evg.d);
   esw<evi> o = a("swamp_hut", evi.d);
   esw<evk> p = a("woodland_mansion", evk.d);

   MapCodec<S> codec();

   private static <S extends esn> esw<S> a(String $$0, MapCodec<S> $$1) {
      return jt.a(mh.R, $$0, () -> $$1);
   }
}
