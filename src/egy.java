import com.mojang.serialization.Codec;

public interface egy<S extends egp> {
   egy<eii> a = a("buried_treasure", eii.d);
   egy<eik> b = a("desert_pyramid", eik.d);
   egy<eim> c = a("end_city", eim.d);
   egy<eiv> d = a("fortress", eiv.e);
   egy<eio> e = a("igloo", eio.d);
   egy<eip> f = a("jigsaw", eip.g);
   egy<eir> g = a("jungle_temple", eir.d);
   egy<eit> h = a("mineshaft", eit.d);
   egy<eix> i = a("nether_fossil", eix.d);
   egy<eiz> j = a("ocean_monument", eiz.d);
   egy<ejb> k = a("ocean_ruin", ejb.d);
   egy<ejd> l = a("ruined_portal", ejd.d);
   egy<ejf> m = a("shipwreck", ejf.d);
   egy<ejh> n = a("stronghold", ejh.d);
   egy<ejj> o = a("swamp_hut", ejj.d);
   egy<ejl> p = a("woodland_mansion", ejl.d);

   Codec<S> codec();

   private static <S extends egp> egy<S> a(String $$0, Codec<S> $$1) {
      return jj.a(ld.T, $$0, () -> $$1);
   }
}
