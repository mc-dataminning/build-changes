import com.mojang.serialization.Codec;

public interface ecp<S extends ecg> {
   ecp<edz> a = a("buried_treasure", edz.d);
   ecp<eeb> b = a("desert_pyramid", eeb.d);
   ecp<eed> c = a("end_city", eed.d);
   ecp<eem> d = a("fortress", eem.e);
   ecp<eef> e = a("igloo", eef.d);
   ecp<eeg> f = a("jigsaw", eeg.f);
   ecp<eei> g = a("jungle_temple", eei.d);
   ecp<eek> h = a("mineshaft", eek.d);
   ecp<eeo> i = a("nether_fossil", eeo.d);
   ecp<eeq> j = a("ocean_monument", eeq.d);
   ecp<ees> k = a("ocean_ruin", ees.d);
   ecp<eeu> l = a("ruined_portal", eeu.d);
   ecp<eew> m = a("shipwreck", eew.d);
   ecp<eey> n = a("stronghold", eey.d);
   ecp<efa> o = a("swamp_hut", efa.d);
   ecp<efc> p = a("woodland_mansion", efc.d);

   Codec<S> codec();

   private static <S extends ecg> ecp<S> a(String $$0, Codec<S> $$1) {
      return ix.a(kh.T, $$0, () -> $$1);
   }
}
