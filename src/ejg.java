import com.mojang.serialization.MapCodec;

public interface ejg<S extends eix> {
   ejg<ekr> a = a("buried_treasure", ekr.d);
   ejg<ekt> b = a("desert_pyramid", ekt.d);
   ejg<ekv> c = a("end_city", ekv.d);
   ejg<ele> d = a("fortress", ele.e);
   ejg<ekx> e = a("igloo", ekx.d);
   ejg<eky> f = a("jigsaw", eky.h);
   ejg<ela> g = a("jungle_temple", ela.d);
   ejg<elc> h = a("mineshaft", elc.d);
   ejg<elg> i = a("nether_fossil", elg.d);
   ejg<eli> j = a("ocean_monument", eli.d);
   ejg<elk> k = a("ocean_ruin", elk.d);
   ejg<elm> l = a("ruined_portal", elm.d);
   ejg<elo> m = a("shipwreck", elo.d);
   ejg<elq> n = a("stronghold", elq.d);
   ejg<els> o = a("swamp_hut", els.d);
   ejg<elu> p = a("woodland_mansion", elu.d);

   MapCodec<S> codec();

   private static <S extends eix> ejg<S> a(String $$0, MapCodec<S> $$1) {
      return jw.a(lq.R, $$0, () -> $$1);
   }
}
