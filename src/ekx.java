import com.mojang.serialization.MapCodec;

public interface ekx<S extends eko> {
   ekx<emi> a = a("buried_treasure", emi.d);
   ekx<emk> b = a("desert_pyramid", emk.d);
   ekx<emm> c = a("end_city", emm.d);
   ekx<emv> d = a("fortress", emv.e);
   ekx<emo> e = a("igloo", emo.d);
   ekx<emp> f = a("jigsaw", emp.i);
   ekx<emr> g = a("jungle_temple", emr.d);
   ekx<emt> h = a("mineshaft", emt.d);
   ekx<emx> i = a("nether_fossil", emx.d);
   ekx<emz> j = a("ocean_monument", emz.d);
   ekx<enb> k = a("ocean_ruin", enb.d);
   ekx<end> l = a("ruined_portal", end.d);
   ekx<enf> m = a("shipwreck", enf.d);
   ekx<enh> n = a("stronghold", enh.d);
   ekx<enj> o = a("swamp_hut", enj.d);
   ekx<enl> p = a("woodland_mansion", enl.d);

   MapCodec<S> codec();

   private static <S extends eko> ekx<S> a(String $$0, MapCodec<S> $$1) {
      return ka.a(lu.R, $$0, () -> $$1);
   }
}
