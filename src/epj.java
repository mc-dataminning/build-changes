import com.mojang.serialization.MapCodec;

public interface epj<P extends epi> {
   epj<eph> a = a("constant", eph.b);
   epj<epl> b = a("uniform", epl.a);
   epj<epg> c = a("biased_to_bottom", epg.a);
   epj<epm> d = a("very_biased_to_bottom", epm.a);
   epj<epk> e = a("trapezoid", epk.a);
   epj<epn> f = a("weighted_list", epn.a);

   MapCodec<P> codec();

   private static <P extends epi> epj<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.L, $$0, () -> $$1);
   }
}
