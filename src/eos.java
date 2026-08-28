import com.mojang.serialization.MapCodec;

public interface eos<S extends eoj> {
   eos<eqd> a = a("buried_treasure", eqd.d);
   eos<eqf> b = a("desert_pyramid", eqf.d);
   eos<eqh> c = a("end_city", eqh.d);
   eos<eqq> d = a("fortress", eqq.e);
   eos<eqj> e = a("igloo", eqj.d);
   eos<eqk> f = a("jigsaw", eqk.i);
   eos<eqm> g = a("jungle_temple", eqm.d);
   eos<eqo> h = a("mineshaft", eqo.d);
   eos<eqs> i = a("nether_fossil", eqs.d);
   eos<equ> j = a("ocean_monument", equ.d);
   eos<eqw> k = a("ocean_ruin", eqw.d);
   eos<eqy> l = a("ruined_portal", eqy.d);
   eos<era> m = a("shipwreck", era.d);
   eos<erc> n = a("stronghold", erc.d);
   eos<ere> o = a("swamp_hut", ere.d);
   eos<erg> p = a("woodland_mansion", erg.d);

   MapCodec<S> codec();

   private static <S extends eoj> eos<S> a(String $$0, MapCodec<S> $$1) {
      return ke.a(mb.R, $$0, () -> $$1);
   }
}
