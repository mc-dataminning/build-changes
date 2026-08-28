import com.mojang.serialization.MapCodec;

public interface ejf<S extends eiw> {
   ejf<ekp> a = a("buried_treasure", ekp.d);
   ejf<ekr> b = a("desert_pyramid", ekr.d);
   ejf<ekt> c = a("end_city", ekt.d);
   ejf<elc> d = a("fortress", elc.e);
   ejf<ekv> e = a("igloo", ekv.d);
   ejf<ekw> f = a("jigsaw", ekw.g);
   ejf<eky> g = a("jungle_temple", eky.d);
   ejf<ela> h = a("mineshaft", ela.d);
   ejf<ele> i = a("nether_fossil", ele.d);
   ejf<elg> j = a("ocean_monument", elg.d);
   ejf<eli> k = a("ocean_ruin", eli.d);
   ejf<elk> l = a("ruined_portal", elk.d);
   ejf<elm> m = a("shipwreck", elm.d);
   ejf<elo> n = a("stronghold", elo.d);
   ejf<elq> o = a("swamp_hut", elq.d);
   ejf<els> p = a("woodland_mansion", els.d);

   MapCodec<S> codec();

   private static <S extends eiw> ejf<S> a(String $$0, MapCodec<S> $$1) {
      return jw.a(lq.R, $$0, () -> $$1);
   }
}
