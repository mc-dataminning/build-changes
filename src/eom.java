import com.mojang.serialization.MapCodec;

public interface eom<S extends eod> {
   eom<epx> a = a("buried_treasure", epx.d);
   eom<epz> b = a("desert_pyramid", epz.d);
   eom<eqb> c = a("end_city", eqb.d);
   eom<eqk> d = a("fortress", eqk.e);
   eom<eqd> e = a("igloo", eqd.d);
   eom<eqe> f = a("jigsaw", eqe.i);
   eom<eqg> g = a("jungle_temple", eqg.d);
   eom<eqi> h = a("mineshaft", eqi.d);
   eom<eqm> i = a("nether_fossil", eqm.d);
   eom<eqo> j = a("ocean_monument", eqo.d);
   eom<eqq> k = a("ocean_ruin", eqq.d);
   eom<eqs> l = a("ruined_portal", eqs.d);
   eom<equ> m = a("shipwreck", equ.d);
   eom<eqw> n = a("stronghold", eqw.d);
   eom<eqy> o = a("swamp_hut", eqy.d);
   eom<era> p = a("woodland_mansion", era.d);

   MapCodec<S> codec();

   private static <S extends eod> eom<S> a(String $$0, MapCodec<S> $$1) {
      return kd.a(ma.R, $$0, () -> $$1);
   }
}
