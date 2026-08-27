import com.mojang.serialization.MapCodec;

public interface ehu<S extends ehl> {
   ehu<eje> a = a("buried_treasure", eje.d);
   ehu<ejg> b = a("desert_pyramid", ejg.d);
   ehu<eji> c = a("end_city", eji.d);
   ehu<ejr> d = a("fortress", ejr.e);
   ehu<ejk> e = a("igloo", ejk.d);
   ehu<ejl> f = a("jigsaw", ejl.g);
   ehu<ejn> g = a("jungle_temple", ejn.d);
   ehu<ejp> h = a("mineshaft", ejp.d);
   ehu<ejt> i = a("nether_fossil", ejt.d);
   ehu<ejv> j = a("ocean_monument", ejv.d);
   ehu<ejx> k = a("ocean_ruin", ejx.d);
   ehu<ejz> l = a("ruined_portal", ejz.d);
   ehu<ekb> m = a("shipwreck", ekb.d);
   ehu<ekd> n = a("stronghold", ekd.d);
   ehu<ekf> o = a("swamp_hut", ekf.d);
   ehu<ekh> p = a("woodland_mansion", ekh.d);

   MapCodec<S> codec();

   private static <S extends ehl> ehu<S> a(String $$0, MapCodec<S> $$1) {
      return jk.a(le.T, $$0, () -> $$1);
   }
}
