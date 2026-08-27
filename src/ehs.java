import com.mojang.serialization.MapCodec;

public interface ehs<S extends ehj> {
   ehs<ejc> a = a("buried_treasure", ejc.d);
   ehs<eje> b = a("desert_pyramid", eje.d);
   ehs<ejg> c = a("end_city", ejg.d);
   ehs<ejp> d = a("fortress", ejp.e);
   ehs<eji> e = a("igloo", eji.d);
   ehs<ejj> f = a("jigsaw", ejj.g);
   ehs<ejl> g = a("jungle_temple", ejl.d);
   ehs<ejn> h = a("mineshaft", ejn.d);
   ehs<ejr> i = a("nether_fossil", ejr.d);
   ehs<ejt> j = a("ocean_monument", ejt.d);
   ehs<ejv> k = a("ocean_ruin", ejv.d);
   ehs<ejx> l = a("ruined_portal", ejx.d);
   ehs<ejz> m = a("shipwreck", ejz.d);
   ehs<ekb> n = a("stronghold", ekb.d);
   ehs<ekd> o = a("swamp_hut", ekd.d);
   ehs<ekf> p = a("woodland_mansion", ekf.d);

   MapCodec<S> codec();

   private static <S extends ehj> ehs<S> a(String $$0, MapCodec<S> $$1) {
      return jk.a(le.T, $$0, () -> $$1);
   }
}
