import com.mojang.serialization.Codec;

public interface dth<P extends dtg> {
   dth<dtf> a = a("constant", dtf.b);
   dth<dtj> b = a("uniform", dtj.a);
   dth<dte> c = a("biased_to_bottom", dte.a);
   dth<dtk> d = a("very_biased_to_bottom", dtk.a);
   dth<dti> e = a("trapezoid", dti.a);
   dth<dtl> f = a("weighted_list", dtl.a);

   Codec<P> codec();

   private static <P extends dtg> dth<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.O, $$0, () -> $$1);
   }
}
