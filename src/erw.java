import com.mojang.serialization.MapCodec;

public interface erw<S extends ern> {
   erw<eth> a = a("buried_treasure", eth.d);
   erw<etj> b = a("desert_pyramid", etj.d);
   erw<etl> c = a("end_city", etl.d);
   erw<etu> d = a("fortress", etu.e);
   erw<etn> e = a("igloo", etn.d);
   erw<eto> f = a("jigsaw", eto.i);
   erw<etq> g = a("jungle_temple", etq.d);
   erw<ets> h = a("mineshaft", ets.d);
   erw<etw> i = a("nether_fossil", etw.d);
   erw<ety> j = a("ocean_monument", ety.d);
   erw<eua> k = a("ocean_ruin", eua.d);
   erw<euc> l = a("ruined_portal", euc.d);
   erw<eue> m = a("shipwreck", eue.d);
   erw<eug> n = a("stronghold", eug.d);
   erw<eui> o = a("swamp_hut", eui.d);
   erw<euk> p = a("woodland_mansion", euk.d);

   MapCodec<S> codec();

   private static <S extends ern> erw<S> a(String $$0, MapCodec<S> $$1) {
      return js.a(mg.R, $$0, () -> $$1);
   }
}
