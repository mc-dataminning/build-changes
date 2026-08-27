import com.mojang.serialization.Codec;

public interface dzp<S extends dzg> {
   dzp<eaz> a = a("buried_treasure", eaz.d);
   dzp<ebb> b = a("desert_pyramid", ebb.d);
   dzp<ebd> c = a("end_city", ebd.d);
   dzp<ebm> d = a("fortress", ebm.e);
   dzp<ebf> e = a("igloo", ebf.d);
   dzp<ebg> f = a("jigsaw", ebg.f);
   dzp<ebi> g = a("jungle_temple", ebi.d);
   dzp<ebk> h = a("mineshaft", ebk.d);
   dzp<ebo> i = a("nether_fossil", ebo.d);
   dzp<ebq> j = a("ocean_monument", ebq.d);
   dzp<ebs> k = a("ocean_ruin", ebs.d);
   dzp<ebu> l = a("ruined_portal", ebu.d);
   dzp<ebw> m = a("shipwreck", ebw.d);
   dzp<eby> n = a("stronghold", eby.d);
   dzp<eca> o = a("swamp_hut", eca.d);
   dzp<ecc> p = a("woodland_mansion", ecc.d);

   Codec<S> codec();

   private static <S extends dzg> dzp<S> a(String $$0, Codec<S> $$1) {
      return it.a(kd.T, $$0, () -> $$1);
   }
}
