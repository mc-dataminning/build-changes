import com.mojang.serialization.MapCodec;

public interface ejv<S extends ejm> {
   ejv<elg> a = a("buried_treasure", elg.d);
   ejv<eli> b = a("desert_pyramid", eli.d);
   ejv<elk> c = a("end_city", elk.d);
   ejv<elt> d = a("fortress", elt.e);
   ejv<elm> e = a("igloo", elm.d);
   ejv<eln> f = a("jigsaw", eln.h);
   ejv<elp> g = a("jungle_temple", elp.d);
   ejv<elr> h = a("mineshaft", elr.d);
   ejv<elv> i = a("nether_fossil", elv.d);
   ejv<elx> j = a("ocean_monument", elx.d);
   ejv<elz> k = a("ocean_ruin", elz.d);
   ejv<emb> l = a("ruined_portal", emb.d);
   ejv<emd> m = a("shipwreck", emd.d);
   ejv<emf> n = a("stronghold", emf.d);
   ejv<emh> o = a("swamp_hut", emh.d);
   ejv<emj> p = a("woodland_mansion", emj.d);

   MapCodec<S> codec();

   private static <S extends ejm> ejv<S> a(String $$0, MapCodec<S> $$1) {
      return jz.a(lt.R, $$0, () -> $$1);
   }
}
