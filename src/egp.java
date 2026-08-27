import com.mojang.serialization.Codec;

public interface egp<S extends egg> {
   egp<ehz> a = a("buried_treasure", ehz.d);
   egp<eib> b = a("desert_pyramid", eib.d);
   egp<eid> c = a("end_city", eid.d);
   egp<eim> d = a("fortress", eim.e);
   egp<eif> e = a("igloo", eif.d);
   egp<eig> f = a("jigsaw", eig.g);
   egp<eii> g = a("jungle_temple", eii.d);
   egp<eik> h = a("mineshaft", eik.d);
   egp<eio> i = a("nether_fossil", eio.d);
   egp<eiq> j = a("ocean_monument", eiq.d);
   egp<eis> k = a("ocean_ruin", eis.d);
   egp<eiu> l = a("ruined_portal", eiu.d);
   egp<eiw> m = a("shipwreck", eiw.d);
   egp<eiy> n = a("stronghold", eiy.d);
   egp<eja> o = a("swamp_hut", eja.d);
   egp<ejc> p = a("woodland_mansion", ejc.d);

   Codec<S> codec();

   private static <S extends egg> egp<S> a(String $$0, Codec<S> $$1) {
      return ji.a(lc.T, $$0, () -> $$1);
   }
}
