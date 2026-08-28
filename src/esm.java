import com.mojang.serialization.MapCodec;

public interface esm<S extends esd> {
   esm<etx> a = a("buried_treasure", etx.d);
   esm<etz> b = a("desert_pyramid", etz.d);
   esm<eub> c = a("end_city", eub.d);
   esm<euk> d = a("fortress", euk.e);
   esm<eud> e = a("igloo", eud.d);
   esm<eue> f = a("jigsaw", eue.i);
   esm<eug> g = a("jungle_temple", eug.d);
   esm<eui> h = a("mineshaft", eui.d);
   esm<eum> i = a("nether_fossil", eum.d);
   esm<euo> j = a("ocean_monument", euo.d);
   esm<euq> k = a("ocean_ruin", euq.d);
   esm<eus> l = a("ruined_portal", eus.d);
   esm<euu> m = a("shipwreck", euu.d);
   esm<euw> n = a("stronghold", euw.d);
   esm<euy> o = a("swamp_hut", euy.d);
   esm<eva> p = a("woodland_mansion", eva.d);

   MapCodec<S> codec();

   private static <S extends esd> esm<S> a(String $$0, MapCodec<S> $$1) {
      return jt.a(mh.R, $$0, () -> $$1);
   }
}
