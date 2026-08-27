import com.mojang.serialization.Codec;

public interface edl<S extends edc> {
   edl<eev> a = a("buried_treasure", eev.d);
   edl<eex> b = a("desert_pyramid", eex.d);
   edl<eez> c = a("end_city", eez.d);
   edl<efi> d = a("fortress", efi.e);
   edl<efb> e = a("igloo", efb.d);
   edl<efc> f = a("jigsaw", efc.f);
   edl<efe> g = a("jungle_temple", efe.d);
   edl<efg> h = a("mineshaft", efg.d);
   edl<efk> i = a("nether_fossil", efk.d);
   edl<efm> j = a("ocean_monument", efm.d);
   edl<efo> k = a("ocean_ruin", efo.d);
   edl<efq> l = a("ruined_portal", efq.d);
   edl<efs> m = a("shipwreck", efs.d);
   edl<efu> n = a("stronghold", efu.d);
   edl<efw> o = a("swamp_hut", efw.d);
   edl<efy> p = a("woodland_mansion", efy.d);

   Codec<S> codec();

   private static <S extends edc> edl<S> a(String $$0, Codec<S> $$1) {
      return iy.a(ki.T, $$0, () -> $$1);
   }
}
