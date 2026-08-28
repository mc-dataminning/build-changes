import com.mojang.serialization.MapCodec;

public interface eiu<S extends eil> {
   eiu<eke> a = a("buried_treasure", eke.d);
   eiu<ekg> b = a("desert_pyramid", ekg.d);
   eiu<eki> c = a("end_city", eki.d);
   eiu<ekr> d = a("fortress", ekr.e);
   eiu<ekk> e = a("igloo", ekk.d);
   eiu<ekl> f = a("jigsaw", ekl.g);
   eiu<ekn> g = a("jungle_temple", ekn.d);
   eiu<ekp> h = a("mineshaft", ekp.d);
   eiu<ekt> i = a("nether_fossil", ekt.d);
   eiu<ekv> j = a("ocean_monument", ekv.d);
   eiu<ekx> k = a("ocean_ruin", ekx.d);
   eiu<ekz> l = a("ruined_portal", ekz.d);
   eiu<elb> m = a("shipwreck", elb.d);
   eiu<eld> n = a("stronghold", eld.d);
   eiu<elf> o = a("swamp_hut", elf.d);
   eiu<elh> p = a("woodland_mansion", elh.d);

   MapCodec<S> codec();

   private static <S extends eil> eiu<S> a(String $$0, MapCodec<S> $$1) {
      return jv.a(lp.T, $$0, () -> $$1);
   }
}
