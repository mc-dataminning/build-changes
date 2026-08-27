import com.mojang.serialization.Codec;

public interface ebu<S extends ebl> {
   ebu<ede> a = a("buried_treasure", ede.d);
   ebu<edg> b = a("desert_pyramid", edg.d);
   ebu<edi> c = a("end_city", edi.d);
   ebu<edr> d = a("fortress", edr.e);
   ebu<edk> e = a("igloo", edk.d);
   ebu<edl> f = a("jigsaw", edl.f);
   ebu<edn> g = a("jungle_temple", edn.d);
   ebu<edp> h = a("mineshaft", edp.d);
   ebu<edt> i = a("nether_fossil", edt.d);
   ebu<edv> j = a("ocean_monument", edv.d);
   ebu<edx> k = a("ocean_ruin", edx.d);
   ebu<edz> l = a("ruined_portal", edz.d);
   ebu<eeb> m = a("shipwreck", eeb.d);
   ebu<eed> n = a("stronghold", eed.d);
   ebu<eef> o = a("swamp_hut", eef.d);
   ebu<eeh> p = a("woodland_mansion", eeh.d);

   Codec<S> codec();

   private static <S extends ebl> ebu<S> a(String $$0, Codec<S> $$1) {
      return iv.a(kf.T, $$0, () -> $$1);
   }
}
