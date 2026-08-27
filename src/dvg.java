import com.mojang.serialization.Codec;

public interface dvg<S extends dux> {
   dvg<dwj> a = a("buried_treasure", dwj.d);
   dvg<dwl> b = a("desert_pyramid", dwl.d);
   dvg<dwn> c = a("end_city", dwn.d);
   dvg<dww> d = a("fortress", dww.e);
   dvg<dwp> e = a("igloo", dwp.d);
   dvg<dwq> f = a("jigsaw", dwq.e);
   dvg<dws> g = a("jungle_temple", dws.d);
   dvg<dwu> h = a("mineshaft", dwu.d);
   dvg<dwy> i = a("nether_fossil", dwy.d);
   dvg<dxa> j = a("ocean_monument", dxa.d);
   dvg<dxc> k = a("ocean_ruin", dxc.d);
   dvg<dxe> l = a("ruined_portal", dxe.d);
   dvg<dxg> m = a("shipwreck", dxg.d);
   dvg<dxi> n = a("stronghold", dxi.d);
   dvg<dxk> o = a("swamp_hut", dxk.d);
   dvg<dxm> p = a("woodland_mansion", dxm.d);

   Codec<S> codec();

   private static <S extends dux> dvg<S> a(String $$0, Codec<S> $$1) {
      return hs.a(jc.U, $$0, () -> $$1);
   }
}
