import com.mojang.serialization.MapCodec;

public interface ehy<P extends ehx> {
   ehy<ehw> a = a("constant", ehw.b);
   ehy<eia> b = a("uniform", eia.a);
   ehy<ehv> c = a("biased_to_bottom", ehv.a);
   ehy<eib> d = a("very_biased_to_bottom", eib.a);
   ehy<ehz> e = a("trapezoid", ehz.a);
   ehy<eic> f = a("weighted_list", eic.a);

   MapCodec<P> codec();

   private static <P extends ehx> ehy<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.L, $$0, () -> $$1);
   }
}
