import com.mojang.serialization.Codec;

public interface dzx<S extends dzo> {
   dzx<ebh> a = a("buried_treasure", ebh.d);
   dzx<ebj> b = a("desert_pyramid", ebj.d);
   dzx<ebl> c = a("end_city", ebl.d);
   dzx<ebu> d = a("fortress", ebu.e);
   dzx<ebn> e = a("igloo", ebn.d);
   dzx<ebo> f = a("jigsaw", ebo.f);
   dzx<ebq> g = a("jungle_temple", ebq.d);
   dzx<ebs> h = a("mineshaft", ebs.d);
   dzx<ebw> i = a("nether_fossil", ebw.d);
   dzx<eby> j = a("ocean_monument", eby.d);
   dzx<eca> k = a("ocean_ruin", eca.d);
   dzx<ecc> l = a("ruined_portal", ecc.d);
   dzx<ece> m = a("shipwreck", ece.d);
   dzx<ecg> n = a("stronghold", ecg.d);
   dzx<eci> o = a("swamp_hut", eci.d);
   dzx<eck> p = a("woodland_mansion", eck.d);

   Codec<S> codec();

   private static <S extends dzo> dzx<S> a(String $$0, Codec<S> $$1) {
      return it.a(kd.T, $$0, () -> $$1);
   }
}
