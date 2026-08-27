import com.mojang.serialization.Codec;

public interface dvl<S extends dvc> {
   dvl<dwo> a = a("buried_treasure", dwo.d);
   dvl<dwq> b = a("desert_pyramid", dwq.d);
   dvl<dws> c = a("end_city", dws.d);
   dvl<dxb> d = a("fortress", dxb.e);
   dvl<dwu> e = a("igloo", dwu.d);
   dvl<dwv> f = a("jigsaw", dwv.e);
   dvl<dwx> g = a("jungle_temple", dwx.d);
   dvl<dwz> h = a("mineshaft", dwz.d);
   dvl<dxd> i = a("nether_fossil", dxd.d);
   dvl<dxf> j = a("ocean_monument", dxf.d);
   dvl<dxh> k = a("ocean_ruin", dxh.d);
   dvl<dxj> l = a("ruined_portal", dxj.d);
   dvl<dxl> m = a("shipwreck", dxl.d);
   dvl<dxn> n = a("stronghold", dxn.d);
   dvl<dxp> o = a("swamp_hut", dxp.d);
   dvl<dxr> p = a("woodland_mansion", dxr.d);

   Codec<S> codec();

   private static <S extends dvc> dvl<S> a(String $$0, Codec<S> $$1) {
      return hq.a(jb.U, $$0, () -> $$1);
   }
}
