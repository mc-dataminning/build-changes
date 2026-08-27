import com.mojang.serialization.Codec;

public interface dxv<S extends dxm> {
   dxv<dzf> a = a("buried_treasure", dzf.d);
   dxv<dzh> b = a("desert_pyramid", dzh.d);
   dxv<dzj> c = a("end_city", dzj.d);
   dxv<dzs> d = a("fortress", dzs.e);
   dxv<dzl> e = a("igloo", dzl.d);
   dxv<dzm> f = a("jigsaw", dzm.e);
   dxv<dzo> g = a("jungle_temple", dzo.d);
   dxv<dzq> h = a("mineshaft", dzq.d);
   dxv<dzu> i = a("nether_fossil", dzu.d);
   dxv<dzw> j = a("ocean_monument", dzw.d);
   dxv<dzy> k = a("ocean_ruin", dzy.d);
   dxv<eaa> l = a("ruined_portal", eaa.d);
   dxv<eac> m = a("shipwreck", eac.d);
   dxv<eae> n = a("stronghold", eae.d);
   dxv<eag> o = a("swamp_hut", eag.d);
   dxv<eai> p = a("woodland_mansion", eai.d);

   Codec<S> codec();

   private static <S extends dxm> dxv<S> a(String $$0, Codec<S> $$1) {
      return is.a(kc.U, $$0, () -> $$1);
   }
}
