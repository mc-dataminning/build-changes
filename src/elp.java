import com.mojang.serialization.MapCodec;

public interface elp<S extends elg> {
   elp<ena> a = a("buried_treasure", ena.d);
   elp<enc> b = a("desert_pyramid", enc.d);
   elp<ene> c = a("end_city", ene.d);
   elp<enn> d = a("fortress", enn.e);
   elp<eng> e = a("igloo", eng.d);
   elp<enh> f = a("jigsaw", enh.i);
   elp<enj> g = a("jungle_temple", enj.d);
   elp<enl> h = a("mineshaft", enl.d);
   elp<enp> i = a("nether_fossil", enp.d);
   elp<enr> j = a("ocean_monument", enr.d);
   elp<ent> k = a("ocean_ruin", ent.d);
   elp<env> l = a("ruined_portal", env.d);
   elp<enx> m = a("shipwreck", enx.d);
   elp<enz> n = a("stronghold", enz.d);
   elp<eob> o = a("swamp_hut", eob.d);
   elp<eod> p = a("woodland_mansion", eod.d);

   MapCodec<S> codec();

   private static <S extends elg> elp<S> a(String $$0, MapCodec<S> $$1) {
      return kb.a(lv.R, $$0, () -> $$1);
   }
}
