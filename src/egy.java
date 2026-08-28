import com.mojang.serialization.MapCodec;

public interface egy<P extends egx> {
   egy<egw> a = a("constant", egw.b);
   egy<eha> b = a("uniform", eha.a);
   egy<egv> c = a("biased_to_bottom", egv.a);
   egy<ehb> d = a("very_biased_to_bottom", ehb.a);
   egy<egz> e = a("trapezoid", egz.a);
   egy<ehc> f = a("weighted_list", ehc.a);

   MapCodec<P> codec();

   private static <P extends egx> egy<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.L, $$0, () -> $$1);
   }
}
