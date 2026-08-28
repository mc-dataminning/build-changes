import com.mojang.serialization.MapCodec;

public interface epp<S extends epg> {
   epp<era> a = a("buried_treasure", era.d);
   epp<erc> b = a("desert_pyramid", erc.d);
   epp<ere> c = a("end_city", ere.d);
   epp<ern> d = a("fortress", ern.e);
   epp<erg> e = a("igloo", erg.d);
   epp<erh> f = a("jigsaw", erh.i);
   epp<erj> g = a("jungle_temple", erj.d);
   epp<erl> h = a("mineshaft", erl.d);
   epp<erp> i = a("nether_fossil", erp.d);
   epp<err> j = a("ocean_monument", err.d);
   epp<ert> k = a("ocean_ruin", ert.d);
   epp<erv> l = a("ruined_portal", erv.d);
   epp<erx> m = a("shipwreck", erx.d);
   epp<erz> n = a("stronghold", erz.d);
   epp<esb> o = a("swamp_hut", esb.d);
   epp<esd> p = a("woodland_mansion", esd.d);

   MapCodec<S> codec();

   private static <S extends epg> epp<S> a(String $$0, MapCodec<S> $$1) {
      return kf.a(md.R, $$0, () -> $$1);
   }
}
