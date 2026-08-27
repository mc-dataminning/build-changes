import com.mojang.serialization.Codec;

public interface efq<S extends efh> {
   efq<eha> a = a("buried_treasure", eha.d);
   efq<ehc> b = a("desert_pyramid", ehc.d);
   efq<ehe> c = a("end_city", ehe.d);
   efq<ehn> d = a("fortress", ehn.e);
   efq<ehg> e = a("igloo", ehg.d);
   efq<ehh> f = a("jigsaw", ehh.g);
   efq<ehj> g = a("jungle_temple", ehj.d);
   efq<ehl> h = a("mineshaft", ehl.d);
   efq<ehp> i = a("nether_fossil", ehp.d);
   efq<ehr> j = a("ocean_monument", ehr.d);
   efq<eht> k = a("ocean_ruin", eht.d);
   efq<ehv> l = a("ruined_portal", ehv.d);
   efq<ehx> m = a("shipwreck", ehx.d);
   efq<ehz> n = a("stronghold", ehz.d);
   efq<eib> o = a("swamp_hut", eib.d);
   efq<eid> p = a("woodland_mansion", eid.d);

   Codec<S> codec();

   private static <S extends efh> efq<S> a(String $$0, Codec<S> $$1) {
      return iy.a(kr.T, $$0, () -> $$1);
   }
}
