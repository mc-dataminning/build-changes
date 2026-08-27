import com.mojang.serialization.Codec;

public interface dww<P extends dwv> {
   dww<dwu> a = a("constant", dwu.b);
   dww<dwy> b = a("uniform", dwy.a);
   dww<dwt> c = a("biased_to_bottom", dwt.a);
   dww<dwz> d = a("very_biased_to_bottom", dwz.a);
   dww<dwx> e = a("trapezoid", dwx.a);
   dww<dxa> f = a("weighted_list", dxa.a);

   Codec<P> codec();

   private static <P extends dwv> dww<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.N, $$0, () -> $$1);
   }
}
