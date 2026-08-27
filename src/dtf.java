import com.mojang.serialization.Codec;

public interface dtf<P extends dte> {
   dtf<dtd> a = a("constant", dtd.b);
   dtf<dth> b = a("uniform", dth.a);
   dtf<dtc> c = a("biased_to_bottom", dtc.a);
   dtf<dti> d = a("very_biased_to_bottom", dti.a);
   dtf<dtg> e = a("trapezoid", dtg.a);
   dtf<dtj> f = a("weighted_list", dtj.a);

   Codec<P> codec();

   private static <P extends dte> dtf<P> a(String $$0, Codec<P> $$1) {
      return hs.a(jc.O, $$0, () -> $$1);
   }
}
