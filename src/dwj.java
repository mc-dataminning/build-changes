import com.mojang.serialization.Codec;

public interface dwj<S extends dwa> {
   dwj<dxm> a = a("buried_treasure", dxm.d);
   dwj<dxo> b = a("desert_pyramid", dxo.d);
   dwj<dxq> c = a("end_city", dxq.d);
   dwj<dxz> d = a("fortress", dxz.e);
   dwj<dxs> e = a("igloo", dxs.d);
   dwj<dxt> f = a("jigsaw", dxt.e);
   dwj<dxv> g = a("jungle_temple", dxv.d);
   dwj<dxx> h = a("mineshaft", dxx.d);
   dwj<dyb> i = a("nether_fossil", dyb.d);
   dwj<dyd> j = a("ocean_monument", dyd.d);
   dwj<dyf> k = a("ocean_ruin", dyf.d);
   dwj<dyh> l = a("ruined_portal", dyh.d);
   dwj<dyj> m = a("shipwreck", dyj.d);
   dwj<dyl> n = a("stronghold", dyl.d);
   dwj<dyn> o = a("swamp_hut", dyn.d);
   dwj<dyp> p = a("woodland_mansion", dyp.d);

   Codec<S> codec();

   private static <S extends dwa> dwj<S> a(String $$0, Codec<S> $$1) {
      return io.a(jy.U, $$0, () -> $$1);
   }
}
