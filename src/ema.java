import com.mojang.serialization.MapCodec;

public interface ema<S extends elr> {
   ema<enl> a = a("buried_treasure", enl.d);
   ema<enn> b = a("desert_pyramid", enn.d);
   ema<enp> c = a("end_city", enp.d);
   ema<eny> d = a("fortress", eny.e);
   ema<enr> e = a("igloo", enr.d);
   ema<ens> f = a("jigsaw", ens.i);
   ema<enu> g = a("jungle_temple", enu.d);
   ema<enw> h = a("mineshaft", enw.d);
   ema<eoa> i = a("nether_fossil", eoa.d);
   ema<eoc> j = a("ocean_monument", eoc.d);
   ema<eoe> k = a("ocean_ruin", eoe.d);
   ema<eog> l = a("ruined_portal", eog.d);
   ema<eoi> m = a("shipwreck", eoi.d);
   ema<eok> n = a("stronghold", eok.d);
   ema<eom> o = a("swamp_hut", eom.d);
   ema<eoo> p = a("woodland_mansion", eoo.d);

   MapCodec<S> codec();

   private static <S extends elr> ema<S> a(String $$0, MapCodec<S> $$1) {
      return kc.a(lx.R, $$0, () -> $$1);
   }
}
