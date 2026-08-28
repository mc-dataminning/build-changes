import com.mojang.serialization.MapCodec;

public interface err<S extends eri> {
   err<etc> a = a("buried_treasure", etc.d);
   err<ete> b = a("desert_pyramid", ete.d);
   err<etg> c = a("end_city", etg.d);
   err<etp> d = a("fortress", etp.e);
   err<eti> e = a("igloo", eti.d);
   err<etj> f = a("jigsaw", etj.i);
   err<etl> g = a("jungle_temple", etl.d);
   err<etn> h = a("mineshaft", etn.d);
   err<etr> i = a("nether_fossil", etr.d);
   err<ett> j = a("ocean_monument", ett.d);
   err<etv> k = a("ocean_ruin", etv.d);
   err<etx> l = a("ruined_portal", etx.d);
   err<etz> m = a("shipwreck", etz.d);
   err<eub> n = a("stronghold", eub.d);
   err<eud> o = a("swamp_hut", eud.d);
   err<euf> p = a("woodland_mansion", euf.d);

   MapCodec<S> codec();

   private static <S extends eri> err<S> a(String $$0, MapCodec<S> $$1) {
      return js.a(mg.R, $$0, () -> $$1);
   }
}
