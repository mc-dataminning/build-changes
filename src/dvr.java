import com.mojang.serialization.Codec;

public interface dvr<S extends dvi> {
   dvr<dwu> a = a("buried_treasure", dwu.d);
   dvr<dww> b = a("desert_pyramid", dww.d);
   dvr<dwy> c = a("end_city", dwy.d);
   dvr<dxh> d = a("fortress", dxh.e);
   dvr<dxa> e = a("igloo", dxa.d);
   dvr<dxb> f = a("jigsaw", dxb.e);
   dvr<dxd> g = a("jungle_temple", dxd.d);
   dvr<dxf> h = a("mineshaft", dxf.d);
   dvr<dxj> i = a("nether_fossil", dxj.d);
   dvr<dxl> j = a("ocean_monument", dxl.d);
   dvr<dxn> k = a("ocean_ruin", dxn.d);
   dvr<dxp> l = a("ruined_portal", dxp.d);
   dvr<dxr> m = a("shipwreck", dxr.d);
   dvr<dxt> n = a("stronghold", dxt.d);
   dvr<dxv> o = a("swamp_hut", dxv.d);
   dvr<dxx> p = a("woodland_mansion", dxx.d);

   Codec<S> codec();

   private static <S extends dvi> dvr<S> a(String $$0, Codec<S> $$1) {
      return ht.a(jd.U, $$0, () -> $$1);
   }
}
