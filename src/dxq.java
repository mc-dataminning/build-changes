import com.mojang.serialization.Codec;

public interface dxq<S extends dxh> {
   dxq<dza> a = a("buried_treasure", dza.d);
   dxq<dzc> b = a("desert_pyramid", dzc.d);
   dxq<dze> c = a("end_city", dze.d);
   dxq<dzn> d = a("fortress", dzn.e);
   dxq<dzg> e = a("igloo", dzg.d);
   dxq<dzh> f = a("jigsaw", dzh.e);
   dxq<dzj> g = a("jungle_temple", dzj.d);
   dxq<dzl> h = a("mineshaft", dzl.d);
   dxq<dzp> i = a("nether_fossil", dzp.d);
   dxq<dzr> j = a("ocean_monument", dzr.d);
   dxq<dzt> k = a("ocean_ruin", dzt.d);
   dxq<dzv> l = a("ruined_portal", dzv.d);
   dxq<dzx> m = a("shipwreck", dzx.d);
   dxq<dzz> n = a("stronghold", dzz.d);
   dxq<eab> o = a("swamp_hut", eab.d);
   dxq<ead> p = a("woodland_mansion", ead.d);

   Codec<S> codec();

   private static <S extends dxh> dxq<S> a(String $$0, Codec<S> $$1) {
      return io.a(jy.U, $$0, () -> $$1);
   }
}
