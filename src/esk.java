import com.mojang.serialization.MapCodec;

public interface esk<S extends esb> {
   esk<etv> a = a("buried_treasure", etv.d);
   esk<etx> b = a("desert_pyramid", etx.d);
   esk<etz> c = a("end_city", etz.d);
   esk<eui> d = a("fortress", eui.e);
   esk<eub> e = a("igloo", eub.d);
   esk<euc> f = a("jigsaw", euc.i);
   esk<eue> g = a("jungle_temple", eue.d);
   esk<eug> h = a("mineshaft", eug.d);
   esk<euk> i = a("nether_fossil", euk.d);
   esk<eum> j = a("ocean_monument", eum.d);
   esk<euo> k = a("ocean_ruin", euo.d);
   esk<euq> l = a("ruined_portal", euq.d);
   esk<eus> m = a("shipwreck", eus.d);
   esk<euu> n = a("stronghold", euu.d);
   esk<euw> o = a("swamp_hut", euw.d);
   esk<euy> p = a("woodland_mansion", euy.d);

   MapCodec<S> codec();

   private static <S extends esb> esk<S> a(String $$0, MapCodec<S> $$1) {
      return js.a(mg.R, $$0, () -> $$1);
   }
}
