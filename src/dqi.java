import com.mojang.serialization.Codec;

public interface dqi<P extends dqh> {
   dqi<dqg> a = a("constant", dqg.b);
   dqi<dqk> b = a("uniform", dqk.a);
   dqi<dqf> c = a("biased_to_bottom", dqf.a);
   dqi<dql> d = a("very_biased_to_bottom", dql.a);
   dqi<dqj> e = a("trapezoid", dqj.a);
   dqi<dqm> f = a("weighted_list", dqm.a);

   Codec<P> codec();

   private static <P extends dqh> dqi<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.O, $$0, () -> $$1);
   }
}
