import com.mojang.serialization.Codec;

public interface edy<P extends edx> {
   edy<edw> a = a("constant", edw.b);
   edy<eea> b = a("uniform", eea.a);
   edy<edv> c = a("biased_to_bottom", edv.a);
   edy<eeb> d = a("very_biased_to_bottom", eeb.a);
   edy<edz> e = a("trapezoid", edz.a);
   edy<eec> f = a("weighted_list", eec.a);

   Codec<P> codec();

   private static <P extends edx> edy<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.N, $$0, () -> $$1);
   }
}
