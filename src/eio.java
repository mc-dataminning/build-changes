import com.mojang.serialization.MapCodec;

public interface eio<S extends eif> {
   eio<ejy> a = a("buried_treasure", ejy.d);
   eio<eka> b = a("desert_pyramid", eka.d);
   eio<ekc> c = a("end_city", ekc.d);
   eio<ekl> d = a("fortress", ekl.e);
   eio<eke> e = a("igloo", eke.d);
   eio<ekf> f = a("jigsaw", ekf.g);
   eio<ekh> g = a("jungle_temple", ekh.d);
   eio<ekj> h = a("mineshaft", ekj.d);
   eio<ekn> i = a("nether_fossil", ekn.d);
   eio<ekp> j = a("ocean_monument", ekp.d);
   eio<ekr> k = a("ocean_ruin", ekr.d);
   eio<ekt> l = a("ruined_portal", ekt.d);
   eio<ekv> m = a("shipwreck", ekv.d);
   eio<ekx> n = a("stronghold", ekx.d);
   eio<ekz> o = a("swamp_hut", ekz.d);
   eio<elb> p = a("woodland_mansion", elb.d);

   MapCodec<S> codec();

   private static <S extends eif> eio<S> a(String $$0, MapCodec<S> $$1) {
      return jv.a(lp.T, $$0, () -> $$1);
   }
}
