import com.mojang.serialization.Codec;

public interface dvm<S extends dvd> {
   dvm<dwp> a = a("buried_treasure", dwp.d);
   dvm<dwr> b = a("desert_pyramid", dwr.d);
   dvm<dwt> c = a("end_city", dwt.d);
   dvm<dxc> d = a("fortress", dxc.e);
   dvm<dwv> e = a("igloo", dwv.d);
   dvm<dww> f = a("jigsaw", dww.e);
   dvm<dwy> g = a("jungle_temple", dwy.d);
   dvm<dxa> h = a("mineshaft", dxa.d);
   dvm<dxe> i = a("nether_fossil", dxe.d);
   dvm<dxg> j = a("ocean_monument", dxg.d);
   dvm<dxi> k = a("ocean_ruin", dxi.d);
   dvm<dxk> l = a("ruined_portal", dxk.d);
   dvm<dxm> m = a("shipwreck", dxm.d);
   dvm<dxo> n = a("stronghold", dxo.d);
   dvm<dxq> o = a("swamp_hut", dxq.d);
   dvm<dxs> p = a("woodland_mansion", dxs.d);

   Codec<S> codec();

   private static <S extends dvd> dvm<S> a(String $$0, Codec<S> $$1) {
      return ht.a(jd.U, $$0, () -> $$1);
   }
}
