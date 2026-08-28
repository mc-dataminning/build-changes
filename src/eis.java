import com.mojang.serialization.MapCodec;

public interface eis<S extends eij> {
   eis<ekc> a = a("buried_treasure", ekc.d);
   eis<eke> b = a("desert_pyramid", eke.d);
   eis<ekg> c = a("end_city", ekg.d);
   eis<ekp> d = a("fortress", ekp.e);
   eis<eki> e = a("igloo", eki.d);
   eis<ekj> f = a("jigsaw", ekj.g);
   eis<ekl> g = a("jungle_temple", ekl.d);
   eis<ekn> h = a("mineshaft", ekn.d);
   eis<ekr> i = a("nether_fossil", ekr.d);
   eis<ekt> j = a("ocean_monument", ekt.d);
   eis<ekv> k = a("ocean_ruin", ekv.d);
   eis<ekx> l = a("ruined_portal", ekx.d);
   eis<ekz> m = a("shipwreck", ekz.d);
   eis<elb> n = a("stronghold", elb.d);
   eis<eld> o = a("swamp_hut", eld.d);
   eis<elf> p = a("woodland_mansion", elf.d);

   MapCodec<S> codec();

   private static <S extends eij> eis<S> a(String $$0, MapCodec<S> $$1) {
      return jv.a(lp.T, $$0, () -> $$1);
   }
}
