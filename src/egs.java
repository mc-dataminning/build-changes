import com.mojang.serialization.MapCodec;

public interface egs<P extends egr> {
   egs<egq> a = a("constant", egq.b);
   egs<egu> b = a("uniform", egu.a);
   egs<egp> c = a("biased_to_bottom", egp.a);
   egs<egv> d = a("very_biased_to_bottom", egv.a);
   egs<egt> e = a("trapezoid", egt.a);
   egs<egw> f = a("weighted_list", egw.a);

   MapCodec<P> codec();

   private static <P extends egr> egs<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.N, $$0, () -> $$1);
   }
}
