import com.mojang.serialization.MapCodec;

public interface ejy<S extends ejp> {
   ejy<elj> a = a("buried_treasure", elj.d);
   ejy<ell> b = a("desert_pyramid", ell.d);
   ejy<eln> c = a("end_city", eln.d);
   ejy<elw> d = a("fortress", elw.e);
   ejy<elp> e = a("igloo", elp.d);
   ejy<elq> f = a("jigsaw", elq.i);
   ejy<els> g = a("jungle_temple", els.d);
   ejy<elu> h = a("mineshaft", elu.d);
   ejy<ely> i = a("nether_fossil", ely.d);
   ejy<ema> j = a("ocean_monument", ema.d);
   ejy<emc> k = a("ocean_ruin", emc.d);
   ejy<eme> l = a("ruined_portal", eme.d);
   ejy<emg> m = a("shipwreck", emg.d);
   ejy<emi> n = a("stronghold", emi.d);
   ejy<emk> o = a("swamp_hut", emk.d);
   ejy<emm> p = a("woodland_mansion", emm.d);

   MapCodec<S> codec();

   private static <S extends ejp> ejy<S> a(String $$0, MapCodec<S> $$1) {
      return jz.a(lt.R, $$0, () -> $$1);
   }
}
