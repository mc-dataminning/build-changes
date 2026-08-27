import com.mojang.serialization.Codec;

public interface dvt<S extends dvk> {
   dvt<dww> a = a("buried_treasure", dww.d);
   dvt<dwy> b = a("desert_pyramid", dwy.d);
   dvt<dxa> c = a("end_city", dxa.d);
   dvt<dxj> d = a("fortress", dxj.e);
   dvt<dxc> e = a("igloo", dxc.d);
   dvt<dxd> f = a("jigsaw", dxd.e);
   dvt<dxf> g = a("jungle_temple", dxf.d);
   dvt<dxh> h = a("mineshaft", dxh.d);
   dvt<dxl> i = a("nether_fossil", dxl.d);
   dvt<dxn> j = a("ocean_monument", dxn.d);
   dvt<dxp> k = a("ocean_ruin", dxp.d);
   dvt<dxr> l = a("ruined_portal", dxr.d);
   dvt<dxt> m = a("shipwreck", dxt.d);
   dvt<dxv> n = a("stronghold", dxv.d);
   dvt<dxx> o = a("swamp_hut", dxx.d);
   dvt<dxz> p = a("woodland_mansion", dxz.d);

   Codec<S> codec();

   private static <S extends dvk> dvt<S> a(String $$0, Codec<S> $$1) {
      return ht.a(jd.U, $$0, () -> $$1);
   }
}
