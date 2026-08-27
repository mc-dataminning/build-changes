import com.mojang.serialization.Codec;

public interface ebn<S extends ebe> {
   ebn<ecx> a = a("buried_treasure", ecx.d);
   ebn<ecz> b = a("desert_pyramid", ecz.d);
   ebn<edb> c = a("end_city", edb.d);
   ebn<edk> d = a("fortress", edk.e);
   ebn<edd> e = a("igloo", edd.d);
   ebn<ede> f = a("jigsaw", ede.f);
   ebn<edg> g = a("jungle_temple", edg.d);
   ebn<edi> h = a("mineshaft", edi.d);
   ebn<edm> i = a("nether_fossil", edm.d);
   ebn<edo> j = a("ocean_monument", edo.d);
   ebn<edq> k = a("ocean_ruin", edq.d);
   ebn<eds> l = a("ruined_portal", eds.d);
   ebn<edu> m = a("shipwreck", edu.d);
   ebn<edw> n = a("stronghold", edw.d);
   ebn<edy> o = a("swamp_hut", edy.d);
   ebn<eea> p = a("woodland_mansion", eea.d);

   Codec<S> codec();

   private static <S extends ebe> ebn<S> a(String $$0, Codec<S> $$1) {
      return iv.a(kf.T, $$0, () -> $$1);
   }
}
