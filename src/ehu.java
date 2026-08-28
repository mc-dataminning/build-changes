import com.mojang.serialization.MapCodec;

public interface ehu<P extends eht> {
   ehu<ehs> a = a("constant", ehs.b);
   ehu<ehw> b = a("uniform", ehw.a);
   ehu<ehr> c = a("biased_to_bottom", ehr.a);
   ehu<ehx> d = a("very_biased_to_bottom", ehx.a);
   ehu<ehv> e = a("trapezoid", ehv.a);
   ehu<ehy> f = a("weighted_list", ehy.a);

   MapCodec<P> codec();

   private static <P extends eht> ehu<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.L, $$0, () -> $$1);
   }
}
