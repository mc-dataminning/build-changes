import com.mojang.serialization.MapCodec;

public interface ehx<P extends ehw> {
   ehx<ehv> a = a("constant", ehv.b);
   ehx<ehz> b = a("uniform", ehz.a);
   ehx<ehu> c = a("biased_to_bottom", ehu.a);
   ehx<eia> d = a("very_biased_to_bottom", eia.a);
   ehx<ehy> e = a("trapezoid", ehy.a);
   ehx<eib> f = a("weighted_list", eib.a);

   MapCodec<P> codec();

   private static <P extends ehw> ehx<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.L, $$0, () -> $$1);
   }
}
