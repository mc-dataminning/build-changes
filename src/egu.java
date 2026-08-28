import com.mojang.serialization.MapCodec;

public interface egu<P extends egt> {
   egu<egs> a = a("constant", egs.b);
   egu<egw> b = a("uniform", egw.a);
   egu<egr> c = a("biased_to_bottom", egr.a);
   egu<egx> d = a("very_biased_to_bottom", egx.a);
   egu<egv> e = a("trapezoid", egv.a);
   egu<egy> f = a("weighted_list", egy.a);

   MapCodec<P> codec();

   private static <P extends egt> egu<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.N, $$0, () -> $$1);
   }
}
