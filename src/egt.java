import com.mojang.serialization.MapCodec;

public interface egt<P extends egs> {
   egt<egr> a = a("constant", egr.b);
   egt<egv> b = a("uniform", egv.a);
   egt<egq> c = a("biased_to_bottom", egq.a);
   egt<egw> d = a("very_biased_to_bottom", egw.a);
   egt<egu> e = a("trapezoid", egu.a);
   egt<egx> f = a("weighted_list", egx.a);

   MapCodec<P> codec();

   private static <P extends egs> egt<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.N, $$0, () -> $$1);
   }
}
