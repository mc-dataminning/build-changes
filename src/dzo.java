import com.mojang.serialization.Codec;

public interface dzo<S extends dzf> {
   dzo<eay> a = a("buried_treasure", eay.d);
   dzo<eba> b = a("desert_pyramid", eba.d);
   dzo<ebc> c = a("end_city", ebc.d);
   dzo<ebl> d = a("fortress", ebl.e);
   dzo<ebe> e = a("igloo", ebe.d);
   dzo<ebf> f = a("jigsaw", ebf.f);
   dzo<ebh> g = a("jungle_temple", ebh.d);
   dzo<ebj> h = a("mineshaft", ebj.d);
   dzo<ebn> i = a("nether_fossil", ebn.d);
   dzo<ebp> j = a("ocean_monument", ebp.d);
   dzo<ebr> k = a("ocean_ruin", ebr.d);
   dzo<ebt> l = a("ruined_portal", ebt.d);
   dzo<ebv> m = a("shipwreck", ebv.d);
   dzo<ebx> n = a("stronghold", ebx.d);
   dzo<ebz> o = a("swamp_hut", ebz.d);
   dzo<ecb> p = a("woodland_mansion", ecb.d);

   Codec<S> codec();

   private static <S extends dzf> dzo<S> a(String $$0, Codec<S> $$1) {
      return it.a(kd.T, $$0, () -> $$1);
   }
}
