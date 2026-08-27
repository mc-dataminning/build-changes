import com.mojang.serialization.Codec;

public interface edn<S extends ede> {
   edn<eex> a = a("buried_treasure", eex.d);
   edn<eez> b = a("desert_pyramid", eez.d);
   edn<efb> c = a("end_city", efb.d);
   edn<efk> d = a("fortress", efk.e);
   edn<efd> e = a("igloo", efd.d);
   edn<efe> f = a("jigsaw", efe.g);
   edn<efg> g = a("jungle_temple", efg.d);
   edn<efi> h = a("mineshaft", efi.d);
   edn<efm> i = a("nether_fossil", efm.d);
   edn<efo> j = a("ocean_monument", efo.d);
   edn<efq> k = a("ocean_ruin", efq.d);
   edn<efs> l = a("ruined_portal", efs.d);
   edn<efu> m = a("shipwreck", efu.d);
   edn<efw> n = a("stronghold", efw.d);
   edn<efy> o = a("swamp_hut", efy.d);
   edn<ega> p = a("woodland_mansion", ega.d);

   Codec<S> codec();

   private static <S extends ede> edn<S> a(String $$0, Codec<S> $$1) {
      return iy.a(ki.T, $$0, () -> $$1);
   }
}
