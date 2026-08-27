import com.mojang.serialization.Codec;

public interface dtg<P extends dtf> {
   dtg<dte> a = a("constant", dte.b);
   dtg<dti> b = a("uniform", dti.a);
   dtg<dtd> c = a("biased_to_bottom", dtd.a);
   dtg<dtj> d = a("very_biased_to_bottom", dtj.a);
   dtg<dth> e = a("trapezoid", dth.a);
   dtg<dtk> f = a("weighted_list", dtk.a);

   Codec<P> codec();

   private static <P extends dtf> dtg<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.O, $$0, () -> $$1);
   }
}
