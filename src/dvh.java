import com.mojang.serialization.Codec;

public interface dvh<S extends duy> {
   dvh<dwk> a = a("buried_treasure", dwk.d);
   dvh<dwm> b = a("desert_pyramid", dwm.d);
   dvh<dwo> c = a("end_city", dwo.d);
   dvh<dwx> d = a("fortress", dwx.e);
   dvh<dwq> e = a("igloo", dwq.d);
   dvh<dwr> f = a("jigsaw", dwr.e);
   dvh<dwt> g = a("jungle_temple", dwt.d);
   dvh<dwv> h = a("mineshaft", dwv.d);
   dvh<dwz> i = a("nether_fossil", dwz.d);
   dvh<dxb> j = a("ocean_monument", dxb.d);
   dvh<dxd> k = a("ocean_ruin", dxd.d);
   dvh<dxf> l = a("ruined_portal", dxf.d);
   dvh<dxh> m = a("shipwreck", dxh.d);
   dvh<dxj> n = a("stronghold", dxj.d);
   dvh<dxl> o = a("swamp_hut", dxl.d);
   dvh<dxn> p = a("woodland_mansion", dxn.d);

   Codec<S> codec();

   private static <S extends duy> dvh<S> a(String $$0, Codec<S> $$1) {
      return hr.a(jb.U, $$0, () -> $$1);
   }
}
