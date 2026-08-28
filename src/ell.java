import com.mojang.serialization.MapCodec;

public interface ell<S extends elc> {
   ell<emw> a = a("buried_treasure", emw.d);
   ell<emy> b = a("desert_pyramid", emy.d);
   ell<ena> c = a("end_city", ena.d);
   ell<enj> d = a("fortress", enj.e);
   ell<enc> e = a("igloo", enc.d);
   ell<end> f = a("jigsaw", end.i);
   ell<enf> g = a("jungle_temple", enf.d);
   ell<enh> h = a("mineshaft", enh.d);
   ell<enl> i = a("nether_fossil", enl.d);
   ell<enn> j = a("ocean_monument", enn.d);
   ell<enp> k = a("ocean_ruin", enp.d);
   ell<enr> l = a("ruined_portal", enr.d);
   ell<ent> m = a("shipwreck", ent.d);
   ell<env> n = a("stronghold", env.d);
   ell<enx> o = a("swamp_hut", enx.d);
   ell<enz> p = a("woodland_mansion", enz.d);

   MapCodec<S> codec();

   private static <S extends elc> ell<S> a(String $$0, MapCodec<S> $$1) {
      return ka.a(lu.R, $$0, () -> $$1);
   }
}
