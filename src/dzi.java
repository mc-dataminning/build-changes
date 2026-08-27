import com.mojang.serialization.Codec;

public interface dzi<S extends dyz> {
   dzi<eas> a = a("buried_treasure", eas.d);
   dzi<eau> b = a("desert_pyramid", eau.d);
   dzi<eaw> c = a("end_city", eaw.d);
   dzi<ebf> d = a("fortress", ebf.e);
   dzi<eay> e = a("igloo", eay.d);
   dzi<eaz> f = a("jigsaw", eaz.f);
   dzi<ebb> g = a("jungle_temple", ebb.d);
   dzi<ebd> h = a("mineshaft", ebd.d);
   dzi<ebh> i = a("nether_fossil", ebh.d);
   dzi<ebj> j = a("ocean_monument", ebj.d);
   dzi<ebl> k = a("ocean_ruin", ebl.d);
   dzi<ebn> l = a("ruined_portal", ebn.d);
   dzi<ebp> m = a("shipwreck", ebp.d);
   dzi<ebr> n = a("stronghold", ebr.d);
   dzi<ebt> o = a("swamp_hut", ebt.d);
   dzi<ebv> p = a("woodland_mansion", ebv.d);

   Codec<S> codec();

   private static <S extends dyz> dzi<S> a(String $$0, Codec<S> $$1) {
      return it.a(kd.T, $$0, () -> $$1);
   }
}
