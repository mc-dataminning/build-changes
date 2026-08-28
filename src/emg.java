import com.mojang.serialization.MapCodec;

public interface emg<S extends elx> {
   emg<enr> a = a("buried_treasure", enr.d);
   emg<ent> b = a("desert_pyramid", ent.d);
   emg<env> c = a("end_city", env.d);
   emg<eoe> d = a("fortress", eoe.e);
   emg<enx> e = a("igloo", enx.d);
   emg<eny> f = a("jigsaw", eny.i);
   emg<eoa> g = a("jungle_temple", eoa.d);
   emg<eoc> h = a("mineshaft", eoc.d);
   emg<eog> i = a("nether_fossil", eog.d);
   emg<eoi> j = a("ocean_monument", eoi.d);
   emg<eok> k = a("ocean_ruin", eok.d);
   emg<eom> l = a("ruined_portal", eom.d);
   emg<eoo> m = a("shipwreck", eoo.d);
   emg<eoq> n = a("stronghold", eoq.d);
   emg<eos> o = a("swamp_hut", eos.d);
   emg<eou> p = a("woodland_mansion", eou.d);

   MapCodec<S> codec();

   private static <S extends elx> emg<S> a(String $$0, MapCodec<S> $$1) {
      return kd.a(ly.R, $$0, () -> $$1);
   }
}
