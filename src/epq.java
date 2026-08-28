import com.mojang.serialization.MapCodec;

public interface epq<P extends epp> {
   epq<epo> a = a("constant", epo.b);
   epq<eps> b = a("uniform", eps.a);
   epq<epn> c = a("biased_to_bottom", epn.a);
   epq<ept> d = a("very_biased_to_bottom", ept.a);
   epq<epr> e = a("trapezoid", epr.a);
   epq<epu> f = a("weighted_list", epu.a);

   MapCodec<P> codec();

   private static <P extends epp> epq<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.L, $$0, () -> $$1);
   }
}
