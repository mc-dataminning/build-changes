import com.mojang.serialization.MapCodec;

public interface eka<S extends ejr> {
   eka<ell> a = a("buried_treasure", ell.d);
   eka<eln> b = a("desert_pyramid", eln.d);
   eka<elp> c = a("end_city", elp.d);
   eka<ely> d = a("fortress", ely.e);
   eka<elr> e = a("igloo", elr.d);
   eka<els> f = a("jigsaw", els.i);
   eka<elu> g = a("jungle_temple", elu.d);
   eka<elw> h = a("mineshaft", elw.d);
   eka<ema> i = a("nether_fossil", ema.d);
   eka<emc> j = a("ocean_monument", emc.d);
   eka<eme> k = a("ocean_ruin", eme.d);
   eka<emg> l = a("ruined_portal", emg.d);
   eka<emi> m = a("shipwreck", emi.d);
   eka<emk> n = a("stronghold", emk.d);
   eka<emm> o = a("swamp_hut", emm.d);
   eka<emo> p = a("woodland_mansion", emo.d);

   MapCodec<S> codec();

   private static <S extends ejr> eka<S> a(String $$0, MapCodec<S> $$1) {
      return jz.a(lt.R, $$0, () -> $$1);
   }
}
