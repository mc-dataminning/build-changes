import com.mojang.serialization.Codec;

public interface dsj<S extends dsa> {
   dsj<dtm> a = a("buried_treasure", dtm.d);
   dsj<dto> b = a("desert_pyramid", dto.d);
   dsj<dtq> c = a("end_city", dtq.d);
   dsj<dtz> d = a("fortress", dtz.e);
   dsj<dts> e = a("igloo", dts.d);
   dsj<dtt> f = a("jigsaw", dtt.e);
   dsj<dtv> g = a("jungle_temple", dtv.d);
   dsj<dtx> h = a("mineshaft", dtx.d);
   dsj<dub> i = a("nether_fossil", dub.d);
   dsj<dud> j = a("ocean_monument", dud.d);
   dsj<duf> k = a("ocean_ruin", duf.d);
   dsj<duh> l = a("ruined_portal", duh.d);
   dsj<duj> m = a("shipwreck", duj.d);
   dsj<dul> n = a("stronghold", dul.d);
   dsj<dun> o = a("swamp_hut", dun.d);
   dsj<dup> p = a("woodland_mansion", dup.d);

   Codec<S> codec();

   private static <S extends dsa> dsj<S> a(String $$0, Codec<S> $$1) {
      return hr.a(jb.U, $$0, () -> $$1);
   }
}
