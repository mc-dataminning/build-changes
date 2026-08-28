import com.mojang.serialization.MapCodec;

public interface erk<S extends erb> {
   erk<esv> a = a("buried_treasure", esv.d);
   erk<esx> b = a("desert_pyramid", esx.d);
   erk<esz> c = a("end_city", esz.d);
   erk<eti> d = a("fortress", eti.e);
   erk<etb> e = a("igloo", etb.d);
   erk<etc> f = a("jigsaw", etc.i);
   erk<ete> g = a("jungle_temple", ete.d);
   erk<etg> h = a("mineshaft", etg.d);
   erk<etk> i = a("nether_fossil", etk.d);
   erk<etm> j = a("ocean_monument", etm.d);
   erk<eto> k = a("ocean_ruin", eto.d);
   erk<etq> l = a("ruined_portal", etq.d);
   erk<ets> m = a("shipwreck", ets.d);
   erk<etu> n = a("stronghold", etu.d);
   erk<etw> o = a("swamp_hut", etw.d);
   erk<ety> p = a("woodland_mansion", ety.d);

   MapCodec<S> codec();

   private static <S extends erb> erk<S> a(String $$0, MapCodec<S> $$1) {
      return jr.a(mf.R, $$0, () -> $$1);
   }
}
