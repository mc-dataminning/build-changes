import com.mojang.serialization.Codec;

public interface dxe<S extends dwv> {
   dxe<dyo> a = a("buried_treasure", dyo.d);
   dxe<dyq> b = a("desert_pyramid", dyq.d);
   dxe<dys> c = a("end_city", dys.d);
   dxe<dzb> d = a("fortress", dzb.e);
   dxe<dyu> e = a("igloo", dyu.d);
   dxe<dyv> f = a("jigsaw", dyv.e);
   dxe<dyx> g = a("jungle_temple", dyx.d);
   dxe<dyz> h = a("mineshaft", dyz.d);
   dxe<dzd> i = a("nether_fossil", dzd.d);
   dxe<dzf> j = a("ocean_monument", dzf.d);
   dxe<dzh> k = a("ocean_ruin", dzh.d);
   dxe<dzj> l = a("ruined_portal", dzj.d);
   dxe<dzl> m = a("shipwreck", dzl.d);
   dxe<dzn> n = a("stronghold", dzn.d);
   dxe<dzp> o = a("swamp_hut", dzp.d);
   dxe<dzr> p = a("woodland_mansion", dzr.d);

   Codec<S> codec();

   private static <S extends dwv> dxe<S> a(String $$0, Codec<S> $$1) {
      return io.a(jy.U, $$0, () -> $$1);
   }
}
