import com.mojang.serialization.MapCodec;

public interface epv<P extends epu> {
   epv<ept> a = a("constant", ept.b);
   epv<epx> b = a("uniform", epx.a);
   epv<eps> c = a("biased_to_bottom", eps.a);
   epv<epy> d = a("very_biased_to_bottom", epy.a);
   epv<epw> e = a("trapezoid", epw.a);
   epv<epz> f = a("weighted_list", epz.a);

   MapCodec<P> codec();

   private static <P extends epu> epv<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.L, $$0, () -> $$1);
   }
}
