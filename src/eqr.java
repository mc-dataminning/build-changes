import com.mojang.serialization.MapCodec;

public interface eqr<S extends eqi> {
   eqr<esc> a = a("buried_treasure", esc.d);
   eqr<ese> b = a("desert_pyramid", ese.d);
   eqr<esg> c = a("end_city", esg.d);
   eqr<esp> d = a("fortress", esp.e);
   eqr<esi> e = a("igloo", esi.d);
   eqr<esj> f = a("jigsaw", esj.i);
   eqr<esl> g = a("jungle_temple", esl.d);
   eqr<esn> h = a("mineshaft", esn.d);
   eqr<esr> i = a("nether_fossil", esr.d);
   eqr<est> j = a("ocean_monument", est.d);
   eqr<esv> k = a("ocean_ruin", esv.d);
   eqr<esx> l = a("ruined_portal", esx.d);
   eqr<esz> m = a("shipwreck", esz.d);
   eqr<etb> n = a("stronghold", etb.d);
   eqr<etd> o = a("swamp_hut", etd.d);
   eqr<etf> p = a("woodland_mansion", etf.d);

   MapCodec<S> codec();

   private static <S extends eqi> eqr<S> a(String $$0, MapCodec<S> $$1) {
      return jr.a(mf.R, $$0, () -> $$1);
   }
}
