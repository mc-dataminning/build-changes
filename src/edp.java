import com.mojang.serialization.Codec;

public interface edp<P extends edo> {
   edp<edn> a = a("constant", edn.b);
   edp<edr> b = a("uniform", edr.a);
   edp<edm> c = a("biased_to_bottom", edm.a);
   edp<eds> d = a("very_biased_to_bottom", eds.a);
   edp<edq> e = a("trapezoid", edq.a);
   edp<edt> f = a("weighted_list", edt.a);

   Codec<P> codec();

   private static <P extends edo> edp<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.N, $$0, () -> $$1);
   }
}
