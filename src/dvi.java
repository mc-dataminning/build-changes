import com.mojang.serialization.Codec;

public interface dvi<S extends duz> {
   dvi<dwl> a = a("buried_treasure", dwl.d);
   dvi<dwn> b = a("desert_pyramid", dwn.d);
   dvi<dwp> c = a("end_city", dwp.d);
   dvi<dwy> d = a("fortress", dwy.e);
   dvi<dwr> e = a("igloo", dwr.d);
   dvi<dws> f = a("jigsaw", dws.e);
   dvi<dwu> g = a("jungle_temple", dwu.d);
   dvi<dww> h = a("mineshaft", dww.d);
   dvi<dxa> i = a("nether_fossil", dxa.d);
   dvi<dxc> j = a("ocean_monument", dxc.d);
   dvi<dxe> k = a("ocean_ruin", dxe.d);
   dvi<dxg> l = a("ruined_portal", dxg.d);
   dvi<dxi> m = a("shipwreck", dxi.d);
   dvi<dxk> n = a("stronghold", dxk.d);
   dvi<dxm> o = a("swamp_hut", dxm.d);
   dvi<dxo> p = a("woodland_mansion", dxo.d);

   Codec<S> codec();

   private static <S extends duz> dvi<S> a(String $$0, Codec<S> $$1) {
      return hr.a(jb.U, $$0, () -> $$1);
   }
}
